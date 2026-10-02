class TravelCard 
{
    private int balance = 0;
    
    boolean recharge(int amount)
    {
        if(amount <= 0) return false;
        balance += amount;
        return true;
    }

    boolean pay(int fare)
    {
        if(fare <= 0 || fare > balance) return false;
        balance -= fare;
        return true;
    }

    int getBalance()
    {
        return balance;
    } 
}

class StudentCard extends TravelCard 
{
    boolean payStudentFare(int fare)
    {
        return pay(fare/2);
    }
}

class ScholarCard extends StudentCard 
{
    private int freeRidesLeft = 2;

    boolean ride(int fare)
    {
        if(fare <= 0) return false;
        if(freeRidesLeft== 0) return payStudentFare(fare);
        freeRidesLeft--;
        return true;
    }

    int getFreeRidesLeft()
    {
        return freeRidesLeft;
    }
}

class MetroApp
{
   public static void main(String[] args)
   {
       TravelCard card = new TravelCard();
       System.out.println("Plain card recharge 200: " + card.recharge(200));
       System.out.println("Plain card pay 50: " + card.pay(50));
       System.out.println("Plain card balance: " + card.getBalance());
       
       StudentCard studentCard = new StudentCard();
       System.out.println("Student recharge 100: " + studentCard.recharge(100));
       System.out.println("Student fare 40: " + studentCard.payStudentFare(40));
       System.out.println("Student balance: " + studentCard.getBalance());
       
       ScholarCard scholarCard = new ScholarCard();
       System.out.println("Scholar recharge 60: " + scholarCard.recharge(60));
       System.out.println("Ride 1: " + scholarCard.ride(30));
       System.out.println("Ride 2: " + scholarCard.ride(30));
       System.out.println("Ride 3: " + scholarCard.ride(30));
       System.out.println("Scholar balance: " + scholarCard.getBalance());
       System.out.println("Free rides left: " + scholarCard.getFreeRidesLeft());

      ScholarCard newScholar = new ScholarCard();
      System.out.println("New scholar ride 0: " + newScholar.ride(0));
      System.out.println("New scholar free rides left: " + newScholar.getFreeRidesLeft());
      System.out.println("Student fare 400: " + studentCard.payStudentFare(400));
      System.out.println("Student fare 1: " + studentCard.payStudentFare(1));
      System.out.println("Student balance: " + studentCard.getBalance());
      System.out.println("Plain card balance: " + card.getBalance());

   }
}