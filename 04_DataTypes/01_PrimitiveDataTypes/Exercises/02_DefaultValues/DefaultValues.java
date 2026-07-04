class DefaultValues 
{
      static byte currentSpeed;
      static short currentScore;
      static int currentLevel;
      static long totalWebsiteVisits;
      static float taxRate;
      static double discountPrice;
      static char accountStatusLevel;
      static boolean isSystemMaintenanceActive;

      public static void main(String args[])
       { 
          System.out.println(currentSpeed);
          System.out.println(currentScore);
          System.out.println(currentLevel);
          System.out.println(totalWebsiteVisits);
          System.out.println(taxRate);
          System.out.println(discountPrice);
          System.out.println(accountStatusLevel);
          System.out.println(isSystemMaintenanceActive);
       }
}