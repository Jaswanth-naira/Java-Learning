class DisplaySettings 
{
    private int width;
    private int height;
    private boolean fallbackUsed;

    DisplaySettings()
    {
        this(800,600);
    }

    DisplaySettings(int sideLength)
    {
        this(sideLength,sideLength);
    }

    DisplaySettings(int width, int height)
    {
        if((width >=1 && width <=2000) && (height >=1 && height <=2000)){
             this.width = width;
             this.height = height;
             fallbackUsed = false;
        }       

        else{
            this.width = 800;
            this.height = 600;
            fallbackUsed = true;
        }
    }

    int getWidth()
    {
        return width;
    }

    int getHeight()
    {
        return height;
    }

    boolean getFallbackUsed()
    {
        return fallbackUsed;
    }

}

class DisplaySettingsApp
{
    public static void main(String args[])
    {
        DisplaySettings first = new DisplaySettings();
        DisplaySettings second = new DisplaySettings(500);
        DisplaySettings third = new DisplaySettings(1200,800);
        DisplaySettings fourth = new DisplaySettings(0);
        DisplaySettings fifth = new DisplaySettings(1200,2500);

        System.out.println("No-argument: " + first.getWidth() + " x " + first.getHeight() + ", " + "fallback: " + first.getFallbackUsed());
        System.out.println("Square: " + second.getWidth() + " x " + second.getHeight() + ", " + "fallback: " + second.getFallbackUsed());
        System.out.println("Rectangle: " + third.getWidth() + " x " + third.getHeight() + ", " + "fallback: " + third.getFallbackUsed());
        System.out.println("Invalid square: " + fourth.getWidth() + " x " + fourth.getHeight() + ", " + "fallback: " + fourth.getFallbackUsed());
         System.out.println("Invalid rectangle: " + fifth.getWidth() + " x " + fifth.getHeight() + ", " + "fallback: " + fifth.getFallbackUsed());
    }
}