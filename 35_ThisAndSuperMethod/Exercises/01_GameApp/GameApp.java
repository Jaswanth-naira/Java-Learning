class BuildLog 
{
    private static StringBuilder steps = new StringBuilder();

    static void add(String step)
    {
        if(steps.length() > 0)
        {
            steps.append(" > ");
        }

        steps.append(step);
    }

    static String read()
    {
        return steps.toString();
    }

    static void clear()
    {
        steps.setLength(0);
    }
}
class Account 
{
    private String username;
    private static int totalCreated = 0;
    Account(String username)
    {
        this.username = username;
        BuildLog.add("Account");
        totalCreated++;
    }

    String getUsername()
    {
        return username;
    }
    
    static int getTotalCreated()
    {
        return totalCreated;
    }
    
}

class PlayerAccount extends Account
{
      private int level;

      PlayerAccount(String username, int level)
      {
          super(username);
          this.level =  (level >= 1) ? level : 1;
          BuildLog.add("Player");
      }

      PlayerAccount(String username)
      {
         this(username,1);
         BuildLog.add("Player default");
      }

      int getLevel()
      {
          return level;
      }
}
class ProPlayerAccount extends PlayerAccount
{
       private String sponsor;

       ProPlayerAccount(String username, int level, String sponsor)
       {
          super(username,level);
          this.sponsor = sponsor;
          BuildLog.add("Pro");
       }

       String getSponsor()
       {
           return sponsor;
       }
}
class GameApp
{
    public static void main(String[] args)
    {
          ProPlayerAccount zara = new ProPlayerAccount("zara", 12, "TechZone");
          System.out.println("Build order: " + BuildLog.read());   
          System.out.println("Username: " + zara.getUsername());   
          System.out.println("Level: " + zara.getLevel());
          System.out.println("Sponsor: " + zara.getSponsor()); 
          BuildLog.clear();
          PlayerAccount ravi = new PlayerAccount("ravi");
          System.out.println("Build order: " + BuildLog.read());
          System.out.println("Ravi level: " + ravi.getLevel());
          PlayerAccount mia = new PlayerAccount("mia", -5);
          System.out.println("Mia level: " + mia.getLevel());
          ProPlayerAccount leo = new ProPlayerAccount("leo", 0, "GameHub");
          System.out.println("Leo level: " + leo.getLevel());
          System.out.println("Total accounts created: " + Account.getTotalCreated());
    }
}