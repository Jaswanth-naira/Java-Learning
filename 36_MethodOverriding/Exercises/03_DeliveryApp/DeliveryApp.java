class Order 
{
    private int itemTotal;
    private int quotedAmount;

    Order(int itemTotal)
    {
        this.itemTotal = (itemTotal < 0) ? 0 : itemTotal;
        quotedAmount = finalAmount();
    }

    int getItemTotal()
    {
        return itemTotal;
    }

    int getQuotedAmount()
    {
        return quotedAmount;
    }

    int deliveryFee()
    {
        return 40;
    }

    int discount()
    {
        return 0;
    }

    String type()
    {
        return "Regular";
    }

    int finalAmount()
    {
        int amount = itemTotal + deliveryFee() - discount();
        return (amount < 0) ? 0 : amount;
    }
}

class PrimeOrder extends Order 
{
      PrimeOrder(int itemTotal)
      {
          super(itemTotal);
      }

      @Override
      int deliveryFee()
      {
        return 0;
      } 
      @Override
      String type()
      {
         return "Prime";
      }


}

class PrimeFestiveOrder extends PrimeOrder 
{
     PrimeFestiveOrder(int itemTotal)
     {
        super(itemTotal);
     }
     
     @Override
     int discount()
     {
        int itemTotal = getItemTotal();
        if(itemTotal >= 500) return itemTotal * 10 / 100;
        return 0;
     }

     @Override 
     String type()
     {
        return super.type() + " Festive";
     }

}

class LateNightOrder extends Order 
{
    private int surcharge = 30;
    LateNightOrder(int itemTotal)
    {
        super(itemTotal);
    }

    @Override
    int deliveryFee()
    {
        return super.deliveryFee() + surcharge;
    }

    @Override
    String type()
    {
        return "Late Night";
    }
}
class Billing 
{
    static int totalRevenue(Order[] orders)
    {
        if(orders == null) return 0;

        int total = 0;
        for(Order order: orders)
        {
            if(order == null) continue;
            total += order.finalAmount();
        }
        return total;
    }

    static int countFreeDelivery(Order[] orders)
    {
        if(orders == null) return 0;

        int count = 0;
        for(Order order: orders)
        {
            if(order == null) continue;
            if(order.deliveryFee() == 0) count++;
        }
        return count;
    }
}
class DeliveryApp 
{
    public static void main(String[] args)
    {
        Order regularOrder = new Order(300);
        PrimeOrder primeOrder = new PrimeOrder(300);
        PrimeFestiveOrder festiveOrder = new PrimeFestiveOrder(800);
        LateNightOrder lateNightOrder = new LateNightOrder(300);

        Order[] orders = {regularOrder, primeOrder, festiveOrder, lateNightOrder, null};
        
        for(Order order : orders)
        {
            if(order == null) continue;
            System.out.println(order.type() + ": " + order.finalAmount());
        }

        System.out.println("Total revenue: " + Billing.totalRevenue(orders));
        System.out.println("Free delivery orders: " + Billing.countFreeDelivery(orders)); 

        Order smallFestive = new PrimeFestiveOrder(400);
        System.out.println("Small festive order: " + smallFestive.finalAmount());
        System.out.println("Late night quoted: " + lateNightOrder.getQuotedAmount());
        System.out.println("Late night final: " + lateNightOrder.finalAmount());
        System.out.println("Festive quoted: " + festiveOrder.getQuotedAmount());
        System.out.println("festive final: " + festiveOrder.finalAmount());
    }
}