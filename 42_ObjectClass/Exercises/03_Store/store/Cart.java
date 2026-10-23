package store;

public final class Cart {
    private final Item[] items;
    private int count;

    public Cart(int capacity) {
        this.items = new Item[capacity];
        this.count = 0;
    }

    public boolean contains(Item item) {
        if (item == null) return false;
        for (int i = 0; i < count; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    public boolean add(Item item) {
        
        if (item == null) {
            return false;
        }
        
        if (count >= items.length) {
            return false;
        }

        if (contains(item)) {
            return false;
        }

        items[count++] = item;
        return true;
    }

    public int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < count; i++) {
            total += items[i].getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            sb.append(items[i].toString());
            if (i < count - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}