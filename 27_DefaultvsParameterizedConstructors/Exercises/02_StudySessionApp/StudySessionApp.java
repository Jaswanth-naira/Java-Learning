class StudySession
{
    private String subject;
    private int durationMinutes;

    StudySession(String subject)
    {
        this.subject = subject;
        durationMinutes = 30;
    }

    StudySession(int durationMinutes)
    {
        this.durationMinutes = durationMinutes;
        subject = "General Practice";
    }

    String getSubject()
    {
        return subject;
    }

    int getDurationMinutes()
    {
        return durationMinutes;
    }
}
class StudySessionApp 
{
    public static void main(String[] args)
    {
        StudySession firstSession = new StudySession("Java");
        StudySession secondSession = new StudySession(45);

        System.out.println("Session 1: " + firstSession.getSubject() + ", " + firstSession.getDurationMinutes() + " minutes");
        System.out.println("Session 2: " + secondSession.getSubject() + ", " + secondSession.getDurationMinutes() + " minutes");
    }
}