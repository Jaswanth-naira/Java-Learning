class First 
{
    private int number = 10;

    int getNumber()
    {
        return this.number;
    }

    boolean setNumber(int number)
    {
        if(number < 0) return false;
        this.number = number;
        return true;
    }
   
    boolean storeIn(Second second)
    {
        if(second == null) return false;
        return second.storeNumber(this);
    }
    
}

class Second 
{
    private First first;
   
    boolean storeNumber(First first)
    {
        if(first == null) return false;
        this.first = first;
        return true;
    }

    int readStoredNumber()
    {
        return first.getNumber();
    }


}

class ReferenceStorageDemo 
{
    public static void main(String[] args)
    {

        First first = new First();
        Second second = new Second();


        boolean result = first.storeIn(second);
        if(result){
            System.out.println(second.readStoredNumber());
            first.setNumber(25);
            System.out.println(second.readStoredNumber());
        }

    }
}