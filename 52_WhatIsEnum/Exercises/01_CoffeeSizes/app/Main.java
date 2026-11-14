package app;
public class Main 
{
    public static void main(String[] args)
    {
        for(Size size: Size.values())
        {
            System.out.println("Size " + size.ordinal() + ": " + size);
        }
        
        Coffee espresso = new Coffee("Espresso", Size.SMALL);
        Coffee latte = new Coffee("Latte", Size.LARGE);

        Size chosen = Size.valueOf("MEDIUM");
        Coffee mocha = new Coffee("Mocha", chosen);

        System.out.println(espresso.getName() + ": " + espresso.getSize());
        System.out.println(mocha.getName() + ": " + mocha.getSize());
        System.out.println(latte.getName() + ": " + latte.getSize());
        System.out.println("Latte is large: " + latte.isSize(Size.LARGE));
        System.out.println("Mocha is large: " + mocha.isSize(Size.LARGE));
        System.out.println("Latte bigger than Mocha: " + latte.isBiggerThan(mocha));
        System.out.println("Espresso bigger than Mocha: " + espresso.isBiggerThan(mocha));
        System.out.println("Espresso upgrades left: " + espresso.upgradesLeft());
        System.out.println("Mocha upgrades left: " + mocha.upgradesLeft());
        System.out.println("Latte upgrades left: " + latte.upgradesLeft());
    }
}