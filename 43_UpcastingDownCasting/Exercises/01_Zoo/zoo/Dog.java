package zoo;
public class Dog extends Animal 
{
    private final int tricks;
   
    public Dog(String name,int tricks)
    {
        super(name);
        this.tricks = tricks;
    }

    public int getTricks()
    {
        return tricks;
    }

    @Override 
    public String sound()
    {
        return "Woof";
    }
}