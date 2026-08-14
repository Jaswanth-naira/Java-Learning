import java.util.*;
class VowelString 
{
    int countVowels(String str)
    {
         int count = 0;
         for(int i = 0; i < str.length(); i++)
         {
             char lowerCaseLetter = Character.toLowerCase(str.charAt(i));

             if(lowerCaseLetter == 'a' || lowerCaseLetter == 'e' || lowerCaseLetter == 'i' || lowerCaseLetter == 'o' || lowerCaseLetter == 'u'){
                  count++;
             }
         }

         return count;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any sentence here: ");

        String str = sc.nextLine();

        if(!str.matches("[a-zA-Z0-9 .:]+")){
            System.out.println("Please enter any sentence.");
            return;
        }   
        VowelString obj = new VowelString();
        int totalNoOfVowels = obj.countVowels(str);

        System.out.print("The total count of vowels in the statement: " + totalNoOfVowels);
        

    }
}