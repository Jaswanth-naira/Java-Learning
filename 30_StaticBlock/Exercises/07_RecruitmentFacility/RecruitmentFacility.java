class Agent 
{
    private String codename;
    private boolean isActive = true;
    private static int globalActiveAgents;
    private static int maxAgents = 2;

    static 
    {
        System.out.println("---> Secure HQ Server Link Established");
    }
    private Agent(String name)
    {
        this.codename = name;
        globalActiveAgents++;
    }

    boolean burnProtocol()
    {
       if (!(isActive)) return false;
       isActive = false;
       globalActiveAgents--;
       return true;
         
    }

    static int getGlobalCount()
    {
        return globalActiveAgents;
    }

    public static Agent recruitAgent(String name)
    {
         if(globalActiveAgents < maxAgents)
         {
             Agent newAgent = new Agent(name);
             return newAgent;
         }

         System.out.println("Roster full. Cannot recruit " + name);
         return null;
    }
    
    String getCodename()
    {
        return codename;
    }

}
class RecruitmentFacility 
{
    public static void main(String[] args)
    {
        Agent bond = Agent.recruitAgent("007");
        Agent trevelyan = Agent.recruitAgent("006");

        Agent bourne = Agent.recruitAgent("Treadstone");

        System.out.println("Active Agents: " + Agent.getGlobalCount());
        System.out.println("First Agent: " + bond.getCodename());
    }
}