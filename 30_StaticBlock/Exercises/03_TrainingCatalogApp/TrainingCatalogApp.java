class TrainingSession 
{
    private String title;
    private int durationMinutes;

    TrainingSession(String title, int durationMinutes)
    {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    String getTitle()
    {
        return title;
    }

    int getDurationMinutes()
    {
        return durationMinutes;
    }
}
class TrainingCatalog 
{
    private static TrainingSession[] sessions;
    private static int totalMinutes;
    
    static
    {
         sessions = new TrainingSession[]{
                                    new TrainingSession("Java Basics", 30),
                                    new TrainingSession("Arrays", 45),
                                    new TrainingSession("Static Methods", 60)
        };
    }

    static 
    {
         totalMinutes = 0;
         for(int i = 0; i < sessions.length; i++)
         {
            totalMinutes += sessions[i].getDurationMinutes();
         }
    }

    static int getSessionCount()
    {
        return sessions.length;
    } 

    static int getTotalMinutes()
    {
        return totalMinutes;
    }

    static TrainingSession getSession(int index)
    {
        if(index < 0 || index >= sessions.length) return null;
        return sessions[index];
    }

}

class TrainingCatalogApp
{
    public static void main(String[] args)
    {
        System.out.println("Before accessing catalog");
        System.out.println("Session count: " + TrainingCatalog.getSessionCount()); 
        System.out.println("Total duration: " + TrainingCatalog.getTotalMinutes() + " minutes");
        TrainingSession selectedSession = TrainingCatalog.getSession(1);
        if(selectedSession != null)
        {
        System.out.println("Selected: " + selectedSession.getTitle() + ", " + selectedSession.getDurationMinutes() + " minutes");
        }
        System.out.println("same session object: " +  (selectedSession == TrainingCatalog.getSession(1)));
        selectedSession = TrainingCatalog.getSession(-1);
        System.out.println("Negative index rejected: " + (selectedSession == null));
        selectedSession = TrainingCatalog.getSession(3);
        System.out.println("Past-end index rejected: " + (selectedSession == null));
        System.out.println("Session count again: " + TrainingCatalog.getSessionCount());
    }
}