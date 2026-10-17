package app;

import library.Book;
import library.ReferenceBook;
import library.LoanSlip;

public class LibraryApp 
{
    public static void main(String[] args)
    {
        final Book[] shelf = { new Book("Java Basics"), new ReferenceBook("Atlas")};

        
        System.out.println(Book.MAX_LOAN_DAYS);
        System.out.println(shelf[0].isOverdue(14));
        System.out.println(shelf[1].isOverdue(15));

        LoanSlip firstSlip = new LoanSlip(shelf[0], 17);
        LoanSlip secondSlip = new LoanSlip(shelf[1], 16);
        System.out.println(firstSlip.amountDue());
        System.out.println(secondSlip.amountDue());

        shelf[1] = new Book("Clean Code");
        System.out.println(shelf[1].getTitle());
        System.out.println(secondSlip.amountDue());
    }
}