class Agent 
{
    private String codename;
    private boolean isActive = true;
    private static int globalActiveAgents;

    static 
    {
        System.out.println("---> Secure HQ Server Link Established");
    }
    Agent(String name)
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

}
class Headquarters 
{
    public static void main(String[] args)
    {
        Agent bond = new Agent("007");
        Agent trevelyan = new Agent("006");  
        
        System.out.println("Active Agents: " + Agent.getGlobalCount());
        trevelyan.burnProtocol();
        trevelyan.burnProtocol();
        System.out.println("Active Agents: " + Agent.getGlobalCount());
    }
}