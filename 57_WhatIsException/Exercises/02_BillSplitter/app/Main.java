package app;
public class Main
{
    public static void main(String[] args)
    {
        BillSplitter splitter = new BillSplitter();
        System.out.println("Share (1200 among 4): " + splitter.share("1200","4"));
        System.out.println("Share (space before 900, among 3): " + splitter.share(" 900", "3"));

        System.out.println("Share (1000 among 3): " + splitter.share("1000", "3"));
        System.out.println("Leftover (1000 among 3): " + splitter.leftover("1000", "3"));
        System.out.println("Leftover (1200 among 4): " + splitter.leftover("1200", "4"));

    }
}