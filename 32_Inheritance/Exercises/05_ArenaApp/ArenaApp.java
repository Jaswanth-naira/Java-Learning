class ArenaMember 
{
    private String name;
    private int health;

    ArenaMember()
    {
        this.health = 100;
    }

    boolean setName(String name)
    {
        if(name == null || name.trim().isEmpty()) return false;
        this.name = name.trim();
        return true;
    }

    String getName()
    {
        return name;
    }

    int getHealth()
    {
        return health;
    }

    boolean takeDamage(int amount)
    {
        if(amount <= 0 || amount > this.health) return false;
        this.health = health - amount;
        return true;
    }
    
    boolean restoreHealth(int amount)
    {
        if(amount <= 0 || (amount > 100 - this.health)) return false;
        this.health = health + amount;
        return true;

    }

}

class Warrior extends ArenaMember 
{
    boolean attack(ArenaMember target)
    {
        if(target == null || target == this || (!(target.takeDamage(30)))) return false;
        return true;        
    }

}

class Medic extends ArenaMember 
{
     boolean heal(ArenaMember target)
     {
        if(target ==  null || !(target.restoreHealth(20))) return false;
        return true;
     }
}

class ArenaTools 
{
    static ArenaMember findMostInjured(ArenaMember[] team)
    {
        if (team == null)
        return null;
        ArenaMember playerWithHighestDamage = null;
        for(int i = 0 ; i < team.length; i++)
        {
            if(team[i] == null) continue;
            playerWithHighestDamage = team[i];  
            break;           
        }
        
        for(int i = 0; i < team.length; i++)
        {
            if(team[i] == null) continue;
            if(team[i].getHealth() < playerWithHighestDamage.getHealth())
            {
                playerWithHighestDamage = team[i];
            }
        }
        return playerWithHighestDamage;
    }
}


class ArenaApp 
{
    public static void main(String[] args)
    {
        Warrior firstPlayer = new Warrior();
        Warrior secondPlayer = new Warrior();
        Medic helper = new Medic();
        ArenaMember[] team = {null, firstPlayer, secondPlayer, helper};

        firstPlayer.setName("Anika");
        secondPlayer.setName("Ravi");
        helper.setName("Maya");

        System.out.println("Anika attacks Ravi: " + firstPlayer.attack(secondPlayer));
        System.out.println("Anika attacks Ravi again: " + firstPlayer.attack(secondPlayer));
        System.out.println("Ravi attacks Maya: " + secondPlayer.attack(helper));
        ArenaMember damagedPlayer = ArenaTools.findMostInjured(team);
        if(damagedPlayer != null)
        {
            System.out.println("Needs healing: " + damagedPlayer.getName() + ", " + damagedPlayer.getHealth());
        }
        System.out.println("Health restored: " + helper.heal(damagedPlayer));  
        damagedPlayer = ArenaTools.findMostInjured(team);
        if(damagedPlayer != null)
        {
            System.out.println("Needs healing again: " + damagedPlayer.getName() + ", " + damagedPlayer.getHealth());
        }      
        System.out.println("Second healing: " + helper.heal(damagedPlayer));
        damagedPlayer = ArenaTools.findMostInjured(team);
        if(damagedPlayer != null)
        {
        System.out.println("Now needs healing: " + damagedPlayer.getName() + ", " + damagedPlayer.getHealth());
        }
        System.out.println("Anika attacks herself: " + firstPlayer.attack(firstPlayer));
        System.out.println("Maya heals Anika at 100: " + helper.heal(firstPlayer));
        System.out.println(firstPlayer.getName() + ": " + firstPlayer.getHealth());
        System.out.println(secondPlayer.getName() + ": " + secondPlayer.getHealth());
        System.out.println(helper.getName() + ": " + helper.getHealth());
    }
}