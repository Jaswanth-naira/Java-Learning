class FinalVariable
{
    public static void main(String args[])
    {
        final double pi=3.14;
        System.out.println(pi);
        pi = 4.56;
    }
}

/*
Java is a compiled language the entire file is checked for errors before anything runs.Since pi=4.56 violates the rule about reassigning
a final variable the compiler flags it and refuses to compile the whole program.
*/