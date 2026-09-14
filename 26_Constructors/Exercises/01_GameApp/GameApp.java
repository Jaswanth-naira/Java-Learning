class GameCharacter 
{
    private String name;
    private int health;

    GameCharacter()
    {
        name = "Guest";
        health = 100;
    }

    String getName()
    {
        return name;
    }

    int getHealth()
    {
        return health;
    }
}
class GameApp 
{
    public static void main(String args[])
    {
        GameCharacter gameCharacter = new GameCharacter();
        String name = gameCharacter.getName();
        int health = gameCharacter.getHealth();
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
    
    }
}