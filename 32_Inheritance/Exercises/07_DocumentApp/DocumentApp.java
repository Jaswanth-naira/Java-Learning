class Document 
{
    private String title;
    private String initializationTrace;
    private static int createdCount = 0;

    Document()
    {
        this.title = "Untitled";
        this.initializationTrace = "Document";
        createdCount++;
    }

    boolean setTitle(String title)
    {
        if(title == null || title.trim().isEmpty()) return false;
        this.title = title.trim();
        return true;
    }

    String getTitle()
    {
        return title;
    }

    void recordInitialization(String step)
    {
        this.initializationTrace += " -> " + step;
    }

    String getInitializationTrace()
    {
        return initializationTrace;
    }
    
    static int getCreatedCount()
    {
        return createdCount;
    }
}

class Invoice extends Document 
{
    private int invoiceNumber;

    Invoice(int invoiceNumber)
    {
        this.invoiceNumber = invoiceNumber;
        recordInitialization("Invoice");
    }

    int getInvoiceNumber()
    {
        return invoiceNumber;
    }
}
class DocumentApp 
{
    public static void main(String[] args)
    {
      System.out.println("created initially: " + Document.getCreatedCount());
      Document basic = new Document();
      System.out.println("Basic title: " + basic.getTitle());
      System.out.println("Basic initialization: " + basic.getInitializationTrace());
      System.out.println("Created after basic: " + Document.getCreatedCount());
      Invoice invoice = new Invoice(501);

      boolean updateResult = invoice.setTitle(" Workshop Fee ");
      System.out.println("Title update: " + updateResult);
      System.out.println("Invoice title: " + invoice.getTitle());
      System.out.println("Invoice number: " + invoice.getInvoiceNumber());
      System.out.println("Invoice initialization: " + invoice.getInitializationTrace());
      System.out.println("Created after invoice: " + Document.getCreatedCount()); 
      Document saved = invoice;
      System.out.println("Same invoice object: " + (saved == invoice)); 
      System.out.println("Created after reference assignment: " + Document.getCreatedCount());  
    }
}