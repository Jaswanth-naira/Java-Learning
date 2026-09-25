class SalesReport 
{
    private int[] dailyUnits;
    SalesReport()
    {
       dailyUnits = new int[0];
    }
    
    boolean setDailyUnits(int[] values)
    {
        if(values == null || values.length == 0) return false;
        for(int i = 0; i < values.length; i++)
        {
            if(values[i] < 0) return false;
            
        } 

        dailyUnits = new int[values.length];

        for(int i = 0; i < values.length; i++)
        {
            dailyUnits[i] = values[i];
        }

        return true;
    }

    int getDayCount()
    {
        return dailyUnits.length;
    }

    int getUnitsAt(int index)
    {
        if((index >= 0 && index < dailyUnits.length)) return dailyUnits[index];
        return -1;
    }

}
class TotalSalesReport extends SalesReport
{
      int getTotalUnits()
      {
        int arrayLength = getDayCount();
        int sum = 0;

        for(int i = 0; i < arrayLength; i++)
        {
             sum = sum + getUnitsAt(i);
        }
        return sum;
      }
      

}
class TrendSalesReport extends SalesReport
{
      int getNetChange() 
      {
          int arrayLength = getDayCount();
         if(arrayLength >= 2)
         {
             return getUnitsAt(arrayLength-1) - getUnitsAt(0);
         }
         return 0;

      }    
}
class SalesReportApp
{
    public static void main(String[] args)
    {
         int[] sourceArray = {10,20,30};

         TotalSalesReport totalReport = new TotalSalesReport();
         TrendSalesReport trendReport = new TrendSalesReport();

         System.out.println("Total Report data accepted: " + totalReport.setDailyUnits(sourceArray));
         System.out.println("Trend Report data accepted: " + trendReport.setDailyUnits(sourceArray));

         sourceArray[0] = 99;
         System.out.println("Source first value: " + sourceArray[0]);            
         System.out.println("Total units: " + totalReport.getTotalUnits());
         System.out.println("Net change: " + trendReport.getNetChange());
         int[] badData = {10,-5,30};
         System.out.println("Invalid trend update: " + trendReport.setDailyUnits(badData));
         System.out.println("Trend after rejection: " + trendReport.getNetChange());
         int[] newTotalData = {5,5,5};
         System.out.println("Total report update: " + totalReport.setDailyUnits(newTotalData));
         System.out.println("Updated total: " + totalReport.getTotalUnits());
         System.out.println("Trend still: " + trendReport.getNetChange());
    }
}