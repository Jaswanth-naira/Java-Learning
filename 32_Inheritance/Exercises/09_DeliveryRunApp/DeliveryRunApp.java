class DeliveryItem {
    private String recipientName = "Unassigned";
    private boolean delivered = false;
    private static int deliveredCount = 0;

    public DeliveryItem() {
    }

    public boolean setRecipientName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        this.recipientName = name.trim();
        return true;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public boolean markDelivered() {
        if (this.delivered) {
            return false;
        }
        this.delivered = true;
        deliveredCount++;
        return true;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public static int getDeliveredCount() {
        return deliveredCount;
    }
}


class Parcel extends DeliveryItem {
    private double weightKg;

    public Parcel(String recipientName, double weightKg) {
        setRecipientName(recipientName);
        this.weightKg = weightKg;
    }

    public double getWeightKg() {
        return weightKg;
    }
}


class Letter extends DeliveryItem {
    private int pageCount;

    public Letter(String recipientName, int pageCount) {
        setRecipientName(recipientName);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }
}


class DeliveryRun {
    private DeliveryItem[] items;

    public DeliveryRun(DeliveryItem[] officeList) {
        if (officeList == null) {
            this.items = new DeliveryItem[0];
        } else {
            this.items = new DeliveryItem[officeList.length];
            for (int i = 0; i < officeList.length; i++) {
                this.items[i] = officeList[i];
            }
        }
    }

    public int getSlotCount() {
        return items.length;
    }

    public DeliveryItem getItem(int index) {
        if (index < 0 || index >= items.length) {
            return null;
        }
        return items[index];
    }

    public int deliverAll() {
        int successfulDeliveries = 0;
        for (DeliveryItem item : items) {
            if (item != null) {
                if (item.markDelivered()) {
                    successfulDeliveries++;
                }
            }
        }
        return successfulDeliveries;
    }
}


public class DeliveryRunApp {
    public static void main(String[] args) {
        Parcel anikaParcel = new Parcel(" Anika ", 2.5);
        Letter raviLetter = new Letter("Ravi", 3);
        Parcel mayaParcel = new Parcel("Maya", 1.0);

        DeliveryItem[] officeArray = new DeliveryItem[] {
            anikaParcel,
            null,
            raviLetter,
            anikaParcel
        };

        DeliveryRun run = new DeliveryRun(officeArray);

        System.out.println("Parcel: " + anikaParcel.getRecipientName() + ", " + anikaParcel.getWeightKg() + " kg");
        System.out.println("Letter: " + raviLetter.getRecipientName() + ", " + raviLetter.getPageCount() + " pages");
        System.out.println("Run slots: " + run.getSlotCount());
        System.out.println("Delivered initially: " + DeliveryItem.getDeliveredCount());

        officeArray[0] = mayaParcel;
        System.out.println("Draft now starts with spare: " + (officeArray[0] == mayaParcel));
        System.out.println("Run still starts with original: " + (run.getItem(0) == anikaParcel));
        System.out.println("Repeated entry is original: " + (run.getItem(3) == anikaParcel));

        int newDeliveries = run.deliverAll();
        System.out.println("New deliveries: " + newDeliveries);
        System.out.println("Parcel delivered: " + anikaParcel.isDelivered());
        System.out.println("Letter delivered: " + raviLetter.isDelivered());
        System.out.println("Spare delivered: " + mayaParcel.isDelivered());
        System.out.println("Delivered total: " + DeliveryItem.getDeliveredCount());

        int repeatDeliveries = run.deliverAll();
        System.out.println("New deliveries on repeat: " + repeatDeliveries);
        System.out.println("Delivered total after repeat: " + DeliveryItem.getDeliveredCount());

        System.out.println("Negative index rejected: " + (run.getItem(-1) == null));
        System.out.println("Past-end index rejected: " + (run.getItem(4) == null));

        DeliveryRun emptyRun = new DeliveryRun(new DeliveryItem[0]);
        System.out.println("Empty run deliveries: " + emptyRun.deliverAll());

        DeliveryRun nullRun = new DeliveryRun(null);
        System.out.println("Missing list deliveries: " + nullRun.deliverAll());

        DeliveryRun allNullRun = new DeliveryRun(new DeliveryItem[] { null, null });
        System.out.println("All-null run deliveries: " + allNullRun.deliverAll());

        System.out.println("Final delivered total: " + DeliveryItem.getDeliveredCount());
    }
}