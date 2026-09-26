class EventPass 
{
    private int passId;
    private boolean checkedIn;
    private static int nextPassId = 101;
    private static int checkedInCount = 0; 

    EventPass()
    {
        this.passId = nextPassId;
        nextPassId++;
        this.checkedIn = false;
    }

    boolean checkIn()
    {
        if(this.checkedIn) return false;
        this.checkedIn = true;
        checkedInCount++;
        return true;
    }

    int getPassId()
    {
        return this.passId;
    }

    boolean isCheckedIn()
    {
       return this.checkedIn;        
    }

    static int getNextPassId()
    {
        return nextPassId;
    }

    static int getCheckedInCount()
    {
        return checkedInCount;
    }
}

class WorkshopPass extends EventPass 
{
    private boolean kitCollected = false;

    boolean collectKit()
    {
        if(!isCheckedIn() || (this.kitCollected)) return false;
        this.kitCollected = true;
        return true;
    } 

    boolean isKitCollected()
    {
        return this.kitCollected;
    }
}

class TalkPass extends EventPass 
{
    private int questionAsked = 0;

    boolean askQuestion()
    {
        if(!isCheckedIn() || questionAsked >= 2) return false;
        this.questionAsked++;
        return true;
    }

    int getQuestionsAsked()
    {
        return this.questionAsked;
    }
}
class EventEntryApp
{
    public static void main(String[] args)
    {
        WorkshopPass workshopPass = new WorkshopPass();
        TalkPass talkPass = new TalkPass();

        System.out.println("Workshop pass ID: " + workshopPass.getPassId());
        System.out.println("Talk pass ID: " + talkPass.getPassId());
        System.out.println("Next pass ID: " + EventPass.getNextPassId());
        System.out.println("kit before check-in: " + workshopPass.collectKit());
        System.out.println("Question before check-in: " + talkPass.askQuestion());
        System.out.println("Workshop check-in: " + workshopPass.checkIn());
        System.out.println("Workshop check-in again: " + workshopPass.checkIn());
        System.out.println("Collect kit: " + workshopPass.collectKit());
        System.out.println("Collect kit again: " + workshopPass.collectKit());
        System.out.println("Talk check-in: " + talkPass.checkIn());
        System.out.println("Question 1: " + talkPass.askQuestion());
        System.out.println("Question 2: " + talkPass.askQuestion());
        System.out.println("Question 3: " + talkPass.askQuestion());
        System.out.println("Checked-in passes: " + EventPass.getCheckedInCount());
        System.out.println("Workshop kit collected: " + workshopPass.isKitCollected());
        System.out.println("Talk questions asked: " + talkPass.getQuestionsAsked());
    }
}