class LibraryMember
{
    private String name;
    private int memberId;
    private static int nextMemberId;
    private static int initializationCount;

    static 
    {
        nextMemberId = 101;
        initializationCount++;
    }

    LibraryMember(String name)
    {
        this.name = name;
        this.memberId = nextMemberId;
        nextMemberId++;
    }

    String getName()
    {
        return name;
    }

    int getMemberId()
    {
         return memberId;
    }

    static int getNextMemberId()
    {
        return nextMemberId;
    }

    static int getInitializationCount()
    {
         return initializationCount;
    }
}
class LibraryMembershipApp
{
    public static void main(String[] args)
    {
        System.out.println("Before creating numbers");
        LibraryMember first = new LibraryMember("Anika");
        System.out.println(first.getName() + ": " + first.getMemberId());
        System.out.println("Initialization count: " + LibraryMember.getInitializationCount());
        LibraryMember second = new LibraryMember("Ravi");
        System.out.println(second.getName() + ": " + second.getMemberId());
        System.out.println("Initialization count: " + LibraryMember.getInitializationCount());
        LibraryMember third = new LibraryMember("Maya");
        System.out.println(third.getName() + ": " + third.getMemberId());
        System.out.println("Initialization count: " + LibraryMember.getInitializationCount());
        System.out.println("Next member ID: " + LibraryMember.getNextMemberId());

    }
}