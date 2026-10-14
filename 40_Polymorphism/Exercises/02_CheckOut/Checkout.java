public class Checkout 
{
    public static String describe(Payment payment)
    {
        return "payment";
    }

    public static String describe(CardPayment payment)
    {
        return "card";
    }

    public static int sumTotals(Payment[] payments)
    {
        int sum = 0;
        for (Payment payment : payments)
        {
            sum += payment.getTotal();
        }
        return sum;
    }

    public static void main(String[] args)
    {
        CardPayment card = new CardPayment(500);
        UpiPayment upi = new UpiPayment(300);

        Payment[] payments = {card, upi};

        for(Payment payment: payments)
        {
            System.out.println(payment.getTotal());
        }
        System.out.println(sumTotals(payments));
        System.out.println(upi.getTotal(50));
        System.out.println(describe(card));
        System.out.println(describe(payments[0]));
    }
}