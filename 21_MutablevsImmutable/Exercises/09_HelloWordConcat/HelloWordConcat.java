class HelloWordConcat 
{
    public static void main(String args[])
    {
        String word = "hello";
        String result = word.concat("");
        System.out.println(word == result);
        System.out.println(word.equals(result));
    }
}