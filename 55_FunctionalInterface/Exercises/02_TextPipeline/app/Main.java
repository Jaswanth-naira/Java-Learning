package app;
public class Main
{
    public static void main(String[] args)
    {
        TextStep trim = new TrimStep();
        TextStep upperCase = new UpperCaseStep();

        String text = "  hello world  ";
        TextStep bracket = new TextStep()
        {
            @Override
            public String apply(String input)
            {
                return input == null ? null : "[" + input + "]";
            }

            @Override
            public String toString()
            {
                return "bracket";
            }
        };

        Pipeline tidy = new Pipeline(new TextStep[]{trim, upperCase, bracket});
        Pipeline bracketFirst = new Pipeline(new TextStep[]{bracket, trim, upperCase});
        Pipeline empty = new Pipeline(new TextStep[]{});

        System.out.println("Tidy: " + tidy.run(text));
        System.out.println("Bracket first: " + bracketFirst.run(text));
        System.out.println("Empty pipeline unchanged: " + text.equals(empty.run(text)));

        System.out.println("Tidy steps: " + tidy.describeSteps());
        System.out.println("Bracket first steps: " + bracketFirst.describeSteps());
        System.out.println("Empty pipeline description length: " + empty.describeSteps().length());
    }
}