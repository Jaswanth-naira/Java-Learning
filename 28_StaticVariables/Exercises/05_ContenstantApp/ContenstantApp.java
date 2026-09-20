class Contenstant 
{
     private String name;
     private int score;
     private static Contenstant leader;
     
     Contenstant(String name, int score)
     {
          this.name = name;
          this.score = score;
          checkLeader();
     }

     void checkLeader()
     {
          if(leader == null)
          {
               leader = this;
          }
         if(leader.getScore() < this.score)
          {
              leader = this;
          }
     }

     boolean addPoints(int points)
     {
         if(points <= 0) return false;
         this.score += points;
         checkLeader();
         return true;
     }
     
     String getName()
     {
         return name;
     }

     int getScore()
     {
         return score;
     }

     Contenstant getObjectReference()
     {
         return leader;
     }
     
     boolean isLeader()
     {
         if (!(this == getObjectReference())) return false;
         return true;
     }


}

class ContenstantApp
{
    public static void main(String[] args)
    {        
         Contenstant first = new Contenstant("Anika", 40); 
         Contenstant second = new Contenstant("Ravi", 40);
         System.out.println("Initial leader: " + first.getObjectReference().getName() + ", " +  first.getObjectReference().getScore());
         System.out.println("Ravi gains 5: " + second.addPoints(5));
         System.out.println("Leader: " + first.getObjectReference().getName() + ", " +  first.getObjectReference().getScore());
         System.out.println("Anika gains 5: " + first.addPoints(5));
         System.out.println("Leader after tie: " + first.getObjectReference().getName() + ", " +  first.getObjectReference().getScore());   
         System.out.println("Anika is leader: " + first.isLeader());
         System.out.println("Ravi is leader: " + second.isLeader());
         Contenstant third = new Contenstant("Maya", 50);
         System.out.println("Leader after maya joins: " + first.getObjectReference().getName() + ", " + first.getObjectReference().getScore());
         System.out.println("Ravi gains 0: " + second.addPoints(0));
         System.out.println("Maya gains 10: " + third.addPoints(10));   
         System.out.println("Leader: " + first.getObjectReference().getName() + ", " +  first.getObjectReference().getScore());
         System.out.println("Anika gains 20: " + first.addPoints(20));
         System.out.println("Final leader: " + first.getObjectReference().getName() + ", " +  second.getObjectReference().getScore());
         System.out.println("Anika is leader: " + first.isLeader());
         System.out.println("Ravi is leader: " + second.isLeader());
         System.out.println("Maya is leader: " + third.isLeader());
    }
}