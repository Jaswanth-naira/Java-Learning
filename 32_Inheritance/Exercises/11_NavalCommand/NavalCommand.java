class Vessel 
{
    private String callsign;

    protected double fuelLevel = 100.0;

    Vessel()
    {
    
    }

    public void setCallSign(String callsign)
    {
        if(callsign!= null && !callsign.trim().isEmpty()){
            this.callsign = callsign.trim();
        }else{
            this.callsign = "UNKNOWN_VESSEL";
        }
    }

    public String getCallsign()
    {
        return callsign;
    }
}

class Submarine extends Vessel 
{
    private double maxDepth;

    public Submarine()
    {

    }
    public Submarine(String callsign, double maxDepth)
    {
        setCallSign(callsign);
        setMaxDepth(maxDepth);
    }
    public void setMaxDepth(double maxDepth)
    {
        if(maxDepth > 0){
            this.maxDepth = maxDepth;
        } else {
            this.maxDepth = 100.0;
        }

    }

    public boolean dive(double requestedDepth)
    {
        if(requestedDepth > maxDepth || fuelLevel < 15.0) return false;
        this.fuelLevel = fuelLevel - 15.0;
        return true;

    }
}

class NuclearSub extends Submarine 
{
    private boolean reactorOnline = false;

    public NuclearSub(String callsign, double maxDepth)
    {
        setCallSign(callsign);
        setMaxDepth(maxDepth);
    }

    public void activateReactor()
    {
       reactorOnline = true;
       fuelLevel = 100.0;  
    }

}

class NavalCommand 
{
    public static void main(String[] args)
    {
        NuclearSub submarine = new NuclearSub("Red October",500.0);
        System.out.println(" First dive: " + submarine.dive(400));
        System.out.println(" seond dive: " + submarine.dive(600));
        submarine.activateReactor();       
    }
}