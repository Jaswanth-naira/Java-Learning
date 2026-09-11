import java.util.Scanner;

class Student
{
    private String name;

    boolean setName(String name)
    {
        if(name == null || name.trim().isEmpty()) return false;

        this.name = name.trim();
        return true;
    }

    String getName()
    {
        return name;
    }

    boolean borrowTo(LibraryBook book)
    {
        if(book == null) return false;

        return book.borrowBy(this);
    }

    boolean returnTo(LibraryBook book)
    {
        if(book == null) return false;

        return book.returnBook(this);
    }
}

class LibraryBook
{
    private String title;
    private Student borrower;

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

    boolean borrowBy(Student borrower)
    {
        if(borrower == null || this.borrower != null) return false;

        this.borrower = borrower;
        return true;
    }

    boolean returnBook(Student borrower)
    {
        if(borrower == null || this.borrower != borrower) return false;

        this.borrower = null;
        return true;
    }

    String getBorrowerName()
    {
        if(borrower == null) return null;

        return borrower.getName();
    }
}

class BookLendingApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Student firstStudent = new Student();
        Student secondStudent = new Student();
        LibraryBook book = new LibraryBook();

        System.out.print("Enter title of book: ");
        String bookTitle = scanner.nextLine();

        if(!book.setTitle(bookTitle))
        {
            System.out.println("Title cannot be blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter first student name: ");
        String firstStudentName = scanner.nextLine();

        if(!firstStudent.setName(firstStudentName))
        {
            System.out.println("First student name cannot be blank.");
            scanner.close();
            return;
        }

        System.out.print("Enter second student name: ");
        String secondStudentName = scanner.nextLine();

        if(!secondStudent.setName(secondStudentName))
        {
            System.out.println("Second student name cannot be blank.");
            scanner.close();
            return;
        }

        boolean firstBorrowSucceeded = firstStudent.borrowTo(book);
        boolean secondReturnSucceeded = secondStudent.returnTo(book);
        boolean firstReturnSucceeded = firstStudent.returnTo(book);
        boolean secondBorrowSucceeded = secondStudent.borrowTo(book);

        System.out.println("First student borrows: " + firstBorrowSucceeded);
        System.out.println("Second student returns: " + secondReturnSucceeded);
        System.out.println("First student returns: " + firstReturnSucceeded);
        System.out.println("Second student borrows: " + secondBorrowSucceeded);

        System.out.println("Book: " + book.getTitle());
        System.out.println("Borrower: " + book.getBorrowerName());

        scanner.close();
    }
}