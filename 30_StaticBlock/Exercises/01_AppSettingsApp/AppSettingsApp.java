class AppSettings 
{
     private static String appName;
     private static int maxUsers;
     private static int initializationCount;

     static
     {
        appName = "StudyHub";
        maxUsers = 50;
        initializationCount++;
     }

     static String getAppName() 
     {
         return appName;
     }
     
     static int getMaxUsers()
     {
        return maxUsers;
     }
     
     static int getInitializationCount()
     {
        return initializationCount;
     }
}
class AppSettingsApp
{
   public static void main(String[] args)
   {
       System.out.println("Before accessing settings");
       System.out.println("App: " + AppSettings.getAppName());
       System.out.println("Maximum users: " + AppSettings.getMaxUsers());
       System.out.println("Initialization count: " + AppSettings.getInitializationCount());
       System.out.println("App again: " + AppSettings.getAppName());
       System.out.println("Intialization count: " + AppSettings.getInitializationCount());
   }
}
