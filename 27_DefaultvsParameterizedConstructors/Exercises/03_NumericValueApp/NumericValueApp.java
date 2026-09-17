class NumericValue 
{
    private double value;
    private String constructorUsed;

    NumericValue(int value)
    {
        this.value = value;
        this.constructorUsed = "int";
    }

    NumericValue(double value)
    {
        this.value = value;
        this.constructorUsed = "double";
    }

    double getValue()
    {
        return value;    
    }

    String getConstructorUsed()
    {
        return constructorUsed;
    }


}


class NumericValueApp
{
    public static void main(String args[])
    {
         byte first = 10;
         int second = 20;
         float third = 2.5f;
         double fourth = 7.5;
         
         NumericValue byteValue = new NumericValue(first);
         NumericValue integer = new NumericValue(second);
         NumericValue floatValue = new NumericValue(third);
         NumericValue doubleValue = new NumericValue(fourth);

         System.out.println("Value 1: " + byteValue.getValue() + ", constructor: " + byteValue.getConstructorUsed());
         System.out.println("Value 2: " + integer.getValue() + ", constructor: " + integer.getConstructorUsed());
         System.out.println("Value 3: " + floatValue.getValue() + ", constructor: " + floatValue.getConstructorUsed());
         System.out.println("Value 4: " + doubleValue.getValue() + ", constructor: " + doubleValue.getConstructorUsed());

    }
}