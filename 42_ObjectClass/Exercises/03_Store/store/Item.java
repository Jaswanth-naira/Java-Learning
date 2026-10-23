package store;
import java.util.Objects;

public class Item {
    private final String code;
    private final String name;
    private final int price;

    public Item(String code, String name, int price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return code + " " + name + " " + price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (this.getClass() != obj.getClass()) return false;
        Item other = (Item) obj;
        if (this.code == null && other.code == null) return true;
        if (this.code == null) return false;
        return this.code.equalsIgnoreCase(other.code);
    }

    @Override
    public int hashCode() {
        if (code == null) return 0;
        return code.toLowerCase().hashCode();
    }
}