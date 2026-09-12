class First 
{
    private int number = 10;

    int getNumber()
    {
        return this.number;
    }
}

class Second 
{
     int readNumber(First incomingNumber)
     {
        return incomingNumber.getNumber();
     }
}

class ReadNumber
{
     public static void main(String[] ags)
     {
        First first = new First();
        Second second = new Second();

        int result = second.readNumber(first);
        System.out.println(result);
     }
   
}