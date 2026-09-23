class StartupLog 
{
    private static String trace = "Start";
    
    static void recordStep(String step)
    {
        trace = trace +  " -> " + step;
    }

    static String getTrace() 
    {
        return trace;
    }
}

class Participant 
{
    private String name;
    private int id;
    private static int nextId;

    static
    {
        nextId = 101;
        StartupLog.recordStep("Participant");
    }

    Participant(String name)
    {
        this.name = name;
        this.id = nextId;
        nextId++;
    }

    String getName()
    {
        return name;
    }

    int getId()
    {
        return id;
    }

    static int getNextId()
    {
        return nextId;
    }
}

class RegistrationDesk 
{
    private static Participant[] participants;
    private static int registeredCount;

    static 
    {
        participants = new Participant[2];
        StartupLog.recordStep("Desk");
    }

    static Participant register(String name)
    {
        if(name ==  null || name.trim().isEmpty() || registeredCount >= participants.length) return null;
        Participant p = new Participant(name.trim());
        participants[registeredCount] = p;
        registeredCount++;
        return p;
    }

    static Participant findById(int id)
    {
        for(int i = 0; i < registeredCount; i++)
        {
            if(participants[i].getId() == id) return participants[i];
        }
       return null;
    }

    static int getCapacity()
    {
        return participants.length;
    }

    static int getRegisteredCount()
    {
        return registeredCount;
    }
}



class RegistrationApp
{
    public static void main(String[] args)
    {
        System.out.println("Initial trace: " + StartupLog.getTrace());
        System.out.println("Blank registration rejected: " + (RegistrationDesk.register(" ") == null));
        System.out.println("After rejection: " + StartupLog.getTrace());
        System.out.println("Desk capacity: " + RegistrationDesk.getCapacity());
        Participant firstPerson = RegistrationDesk.register(" Anika ");
        if(firstPerson != null)
        {
        System.out.println("First: " + firstPerson.getName() + ", " + firstPerson.getId());
        }
        System.out.println("After first registration: " + StartupLog.getTrace());
        Participant secondPerson = RegistrationDesk.register("Ravi");
        if(secondPerson != null)
        {
        System.out.println("Second: " + secondPerson.getName() + ", " + secondPerson.getId());
        }
        System.out.println("Full desk rejected: " + (RegistrationDesk.register("Maya") == null));
        Participant foundRavi = RegistrationDesk.findById(102);
        System.out.println("Lookup is Ravi object: " + (foundRavi == secondPerson));

        System.out.println("Unknown ID rejected: " + (RegistrationDesk.findById(999) == null));
        System.out.println("Registered count: " + RegistrationDesk.getRegisteredCount());
        System.out.println("Next participant ID: " + Participant.getNextId());
        System.out.println("Final trace: " + StartupLog.getTrace());

    }
}