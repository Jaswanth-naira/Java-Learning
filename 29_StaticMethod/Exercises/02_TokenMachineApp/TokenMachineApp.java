class TokenMachine 
{
     private static int nextToken = 101;
     private static int issuedCount = 0;
     
     static int issueToken()
     {
          int currentToken = nextToken;
          nextToken++;
          issuedCount++;
          return currentToken;
     }

     static int peekNextToken()
     {
          return nextToken;
     }
    
     static int getIssuedCount()
     {
         return issuedCount;
     }

     static boolean advanceTo(int incomingTokenNo)
     {
          if(!(incomingTokenNo > nextToken)) return false;
          nextToken = incomingTokenNo;
          return true;
     }

}
class TokenMachineApp
{
    public static void main(String[] args)
    {
         System.out.println("Next token: " + TokenMachine.peekNextToken());
         System.out.println("Issued count: " + TokenMachine.getIssuedCount());
         System.out.println("Issued token: " + TokenMachine.issueToken());
         System.out.println("Issued token: " + TokenMachine.issueToken());
         System.out.println("Move next token to 105: " + TokenMachine.advanceTo(105));
         System.out.println("Issued count: " + TokenMachine.getIssuedCount());
         System.out.println("Issued token: " + TokenMachine.issueToken());
         System.out.println("Move next token to 104: " + TokenMachine.advanceTo(104));
         System.out.println("Next token: " + TokenMachine.peekNextToken());
         System.out.println("Issued count: " + TokenMachine.getIssuedCount());
    }
}