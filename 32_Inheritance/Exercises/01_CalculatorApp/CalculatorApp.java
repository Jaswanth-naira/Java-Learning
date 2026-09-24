class BasicCalculator 
{
    int add(int a, int b)
    {
        return a + b;
    }

    int subtract(int a, int b)
    {
        return a-b;
    }

}

class AdvancedCalculator extends BasicCalculator
{
    int multiply(int a, int b)
    {
        return a*b;
    }
}
class CalculatorApp
{
     public static void main(String[] args)
     {
        AdvancedCalculator calculator = new AdvancedCalculator();
        System.out.println("Addition: " + calculator.add(12,4));
        System.out.println("Subtraction: " + calculator.subtract(12,4));
        System.out.println("Multiplication: " + calculator.multiply(12,4));
     }   
}