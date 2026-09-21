class NumberTools 
{
    static boolean isEven(int num)
    {
         if(!(num % 2 ==0)) return false;
         return true;
    }

    static int getLarger(int no1, int no2)
    {
        if(no1 > no2 || no1 == no2) return no1;
        return no2;
         
    }
}
class NumberToolsApp 
{
    public static void main(String[] args)
    {
        System.out.println("Is 8 even: " + NumberTools.isEven(8));
        System.out.println("Is 7 even: " + NumberTools.isEven(7));
        System.out.println("Is 0 even: " + NumberTools.isEven(0));
        System.out.println("Is -4 even: " + NumberTools.isEven(-4));
        System.out.println("Larger of 12 and 20: " + NumberTools.getLarger(12,20));
        System.out.println("Larger of 9 and 9: " + NumberTools.getLarger(9,9));
        System.out.println("Larger of -8 and -3: " + NumberTools.getLarger(-8,-3));
    }
}