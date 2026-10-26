package shop;

public class OrderLine
{
    private String code;
    private Integer quantity;
    private double price;
    private boolean inStock;

    public OrderLine(String code, String quantityText, String priceText, String stockText)
    {
        this.code = code;
        
        this.quantity = Integer.valueOf(quantityText);
        
        this.price = Double.parseDouble(priceText);
        
        this.inStock = Boolean.parseBoolean(stockText);
    }

    public boolean isValidCode()
    {
        if (code.length() != 4) return false;
        for (int i = 0; i < code.length(); i++)
        {
            char ch = code.charAt(i);
            if (!Character.isDigit(ch)) return false;
        }
        return true;
    }

    public double lineTotal()
    {
        return quantity * price;
    }

    public boolean sameQuantity(OrderLine other)
    {
        return this.quantity.equals(other.quantity);
    }

    public boolean isInStock()
    {
        return inStock;
    }
}