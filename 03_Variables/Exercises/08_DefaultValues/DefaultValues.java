class DefaultValues 
{   
     int a;
     double b;
     boolean c;
     String instanceVariable;
     public static void main(String args[])
     {
        DefaultValues obj=new DefaultValues();
        System.out.printf("int default: %d\n",obj.a);
        System.out.printf("double default: %.1f\n",obj.b);
        System.out.printf("boolean default: %b\n",obj.c);
        System.out.printf("String default: %s",obj.instanceVariable);
     }
       
}