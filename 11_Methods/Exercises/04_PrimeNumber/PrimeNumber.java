class PrimeNumber 
{
    boolean isPrime(int n)
    {
        if(n<2) return false;
        int i = 2;
        while(i*i <= n)
        {
            if(n % i == 0) return false;
            i++;
        }
        return true;
    }
    public static void main(String args[])
    {
        PrimeNumber obj = new PrimeNumber();
        for (int i=2;i<=20;i++)
        {
            if(obj.isPrime(i))
            {
                 System.out.println(i);
            }
        }
    }

}