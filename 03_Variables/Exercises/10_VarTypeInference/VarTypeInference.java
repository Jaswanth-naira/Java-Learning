class VarTypeInference 
{
    
    public static void main(String args[])
    {
        var a = 10; 
        printType(a);
        var b = "Jack"; 
        printType(b);
        var c = 10.56;
        printType(c);
        var d = false;
        printType(d);

    }

    public static void printType(Object obj)
    {
       System.out.println(obj.getClass().getSimpleName());
    }
}