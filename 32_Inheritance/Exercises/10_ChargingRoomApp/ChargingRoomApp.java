class BatteryDevice {
    private String name = "Unnamed";
    private int charge = 100;

    public BatteryDevice() {
    }

    public boolean setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        this.name = name.trim();
        return true;
    }

    public String getName() {
        return name;
    }

    public int getCharge() {
        return charge;
    }

    public boolean useCharge(int amount) {
        if (amount <= 0 || amount > charge) {
            return false;
        }
        charge -= amount;
        return true;
    }

    public boolean receiveCharge(int amount) {
        if (amount <= 0 || amount > (100 - charge)) {
            return false;
        }
        charge += amount;
        return true;
    }
}

class Phone extends BatteryDevice {
    public Phone(String name) {
        setName(name);
    }

    public boolean makeCall() {
        return useCharge(30);
    }
}

class Tablet extends BatteryDevice {
    public Tablet(String name) {
        setName(name);
    }

    public boolean watchLesson() {
        return useCharge(40);
    }
}

class PowerBank extends BatteryDevice {
    private int successfulTransfers = 0;

    public PowerBank(String name) {
        setName(name);
    }

    public int getSuccessfulTransfers() {
        return successfulTransfers;
    }

    public boolean transferCharge(BatteryDevice target, int amount) {
        if (target == null || target == this || amount <= 0) {
            return false;
        }
        if (this.getCharge() < amount) {
            return false;
        }
        if (target.getCharge() + amount > 100) {
            return false;
        }

        boolean used = this.useCharge(amount);
        boolean received = target.receiveCharge(amount);

        if (used && received) {
            successfulTransfers++;
            return true;
        }
        return false;
    }
}

class ChargingTools {
    public static BatteryDevice findLowestCharge(BatteryDevice[] devices) {
        if (devices == null) {
            return null;
        }
        BatteryDevice lowest = null;
        for (BatteryDevice device : devices) {
            if (device != null) {
                if (lowest == null || device.getCharge() < lowest.getCharge()) {
                    lowest = device;
                }
            }
        }
        return lowest;
    }
}



public class ChargingRoomApp {
    public static void main(String[] args) {
        Phone phone = new Phone("Anika's phone");
        Tablet tablet = new Tablet("Ravi's tablet");
        PowerBank bank = new PowerBank("Study bank");

        System.out.println("--- Initial Devices ---");
        System.out.println(phone.getName() + ": " + phone.getCharge());
        System.out.println(tablet.getName() + ": " + tablet.getCharge());
        System.out.println(bank.getName() + ": " + bank.getCharge());
        System.out.println();

        System.out.println("--- Step 2: Consuming Charge ---");
        System.out.println("Make a call using phone: " + phone.makeCall());
        System.out.println("Make another call using phone: " + phone.makeCall());
        System.out.println("Watch a lesson using tablet: " + tablet.watchLesson());
        System.out.println();

        System.out.println("Phone: " + phone.getCharge());
        System.out.println("Tablet: " + tablet.getCharge());
        System.out.println("Bank: " + bank.getCharge());
        System.out.println();

        System.out.println("--- Step 3: Power Transfer ---");
        System.out.println("Transfer 20 to phone: " + bank.transferCharge(phone, 20));
        System.out.println("Phone: " + phone.getCharge());
        System.out.println("Bank: " + bank.getCharge());
        System.out.println("Successful transfers: " + bank.getSuccessfulTransfers());
        System.out.println();

        System.out.println("--- Step 4: Lowest Charge Lookup ---");
        BatteryDevice[] devices = { null, phone, tablet };
        BatteryDevice selected = ChargingTools.findLowestCharge(devices);

        if (selected != null) {
            System.out.println("Selected: " + selected.getName() + ", " + selected.getCharge());
        }
        System.out.println("Transfer 30 to selected: " + bank.transferCharge(selected, 30));
        System.out.println("Phone: " + phone.getCharge());
        System.out.println("Tablet: " + tablet.getCharge());
        System.out.println("Bank: " + bank.getCharge());
        System.out.println("Successful transfers: " + bank.getSuccessfulTransfers());
        System.out.println();

        System.out.println("--- Step 5: Handling Failed Transfers ---");
        System.out.println("Bank attempts to transfer 20 to the phone: " + bank.transferCharge(phone, 20) + " — phone would exceed 100");
        System.out.println("Phone: " + phone.getCharge() + ", bank: " + bank.getCharge());

        selected = ChargingTools.findLowestCharge(devices);
        if (selected != null) {
            System.out.println("Search the device array again selects: " + selected.getName());
        }
        System.out.println("Bank transfers 40 to the selected tablet: " + bank.transferCharge(selected, 40));
        System.out.println("Tablet: " + tablet.getCharge() + ", bank: " + bank.getCharge());

        System.out.println("Phone makes another call: " + phone.makeCall());
        System.out.println("Bank attempts to transfer 20 to the phone: " + bank.transferCharge(phone, 20) + " — bank has only 10");
        System.out.println("Phone: " + phone.getCharge() + ", bank: " + bank.getCharge());
        System.out.println("Successful transfers: " + bank.getSuccessfulTransfers());
        System.out.println();

        System.out.println("--- Step 6: Edge Cases & Aliases ---");
        System.out.println("Transfer 5 to a null target: " + bank.transferCharge(null, 5));

        BatteryDevice bankAlias = bank;
        System.out.println("Transfer 5 to bank alias: " + bank.transferCharge(bankAlias, 5));
        System.out.println("Transfer 0 to the phone: " + bank.transferCharge(phone, 0));

        System.out.println("Search a null array is null: " + (ChargingTools.findLowestCharge(null) == null));
        System.out.println("Search an empty array is null: " + (ChargingTools.findLowestCharge(new BatteryDevice[0]) == null));
        System.out.println("Search all-null array is null: " + (ChargingTools.findLowestCharge(new BatteryDevice[]{null, null}) == null));
        System.out.println();

        System.out.println("--- Final Summary ---");
        System.out.println("Final phone charge: " + phone.getCharge());
        System.out.println("Final tablet charge: " + tablet.getCharge());
        System.out.println("Final bank charge: " + bank.getCharge());
        System.out.println("Successful transfers: " + bank.getSuccessfulTransfers());
    }
}