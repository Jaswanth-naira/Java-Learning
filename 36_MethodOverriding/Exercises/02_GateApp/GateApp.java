class TravelCard
{
    private int balance;

    boolean recharge(int amount)
    {
        if(amount <= 0) return false;
        balance += amount;
        return true;
    }

    int getBalance()
    {
        return balance;
    }

    boolean pay(int fare)
    {
         if(fare <=0 || fare > balance) return false;
         balance -= fare;
         return true;
    }

    String cardType()
    {
        return "Plain";
    }

    String summary()
    {
        return cardType() + " card, balance " + getBalance();
    }
}

class StudentCard extends TravelCard 
{
   @Override 
   boolean pay(int fare)
   {
      return super.pay(fare/2);
   }

   @Override
   String cardType()
   {
      return "Student";
   }
}

class ScholarCard extends StudentCard 
{
    private int freeRidesLeft = 2;
    int getFreeRidesLeft()
    {
        return freeRidesLeft;
    }

    @Override 
    boolean pay(int fare)
    {
        if(fare <= 0) return false;
        if(freeRidesLeft > 0) 
           {
            freeRidesLeft--;
            return true;
           }
        return super.pay(fare);
    }

    @Override
    String cardType()
    {
        return "Scholar";
    }
}

class MetroGate 
{
    private int fare;
    private int entriesAllowed = 0;

    MetroGate(int fare)
    {
        this.fare = fare;
    }

    boolean enter(TravelCard card)
    {                                                                                                           
        if(card == null) return false;
        if(!card.pay(this.fare)) return false;
        entriesAllowed++;
        return true;
    }

    int getEntriesAllowed()
    {
        return entriesAllowed;
    }
}

class GateApp 
{
    public static void main(String[] args)
    {
        TravelCard plain = new TravelCard();
        StudentCard student = new StudentCard();
        ScholarCard scholar = new ScholarCard();

        plain.recharge(100);
        student.recharge(100);
        scholar.recharge(100);

        MetroGate gate = new MetroGate(40);
        TravelCard[] cards = {plain, student, scholar};

        for(int i = 0; i < cards.length; i++)
        {
            System.out.println("Card " + i + " enters: " + gate.enter(cards[i]));
        }
        System.out.println("Plain balance: " + plain.getBalance());
        System.out.println("Student balance: " + student.getBalance());
        System.out.println("Scholar balance: " + scholar.getBalance());
        System.out.println("Scholar free rides left: " + scholar.getFreeRidesLeft());

        System.out.println("Scholar enters: " + gate.enter(scholar));
        System.out.println("Scholar enters: " + gate.enter(scholar));

        System.out.println("Scholar balance: " + scholar.getBalance());
        System.out.println("Scholar free rides left: " + scholar.getFreeRidesLeft());

        for(TravelCard card: cards)
        {
            System.out.println(card.summary());
        }

        MetroGate tinyGate = new MetroGate(1);
        System.out.println("Student at 1-rupee gate: " + tinyGate.enter(student));
        System.out.println("Plain at 1-rupee gate: " + tinyGate.enter(plain));
        System.out.println("Gate entries: " + gate.getEntriesAllowed());

    }
}