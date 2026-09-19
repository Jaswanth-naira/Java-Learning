class TicketBooking
{
    private String customerName;
    private int bookedSeats;
    private static int availableSeats = 5;

    TicketBooking(String customerName)
    {
        this.customerName = customerName;
    }
    
    boolean bookTicket(int noOfSeats)
    {
        if(noOfSeats <= 0 || noOfSeats > availableSeats) return false;
        this.bookedSeats += noOfSeats;
        availableSeats -= noOfSeats;
        return true;
    }

    boolean cancelSeats(int noOfSeats)
    {
        if(noOfSeats <= 0 || noOfSeats > this.bookedSeats) return false;
        this.bookedSeats = this.bookedSeats - noOfSeats;
        availableSeats += noOfSeats;
        return true;
    }

    String getName()
    {
        return customerName;
    }

    int getBookedSeats()
    {
        return bookedSeats;
    }

    int getAvailableSeats()
    {
        return availableSeats;
    }
}

class BookingApp
{
    public static void main(String[] args)
    {
        TicketBooking first = new TicketBooking("Anika");
        TicketBooking second = new TicketBooking("Ravi");

        System.out.println("Anika books 3: " + first.bookTicket(3));
        System.out.println("Ravi books 2: " + second.bookTicket(2));
        System.out.println("Available seats: " + first.getAvailableSeats());
        
        TicketBooking third = new TicketBooking("Maya");
        System.out.println("Maya books 1: " + third.bookTicket(1));
        System.out.println("Ravi cancels 3: " + second.cancelSeats(3));
        System.out.println("Anika cancels 2: " + first.cancelSeats(2));
        System.out.println("Maya books 1: " + third.bookTicket(1));

        System.out.println(first.getName() + ": " + first.getBookedSeats());
        System.out.println(second.getName() + ": " + second.getBookedSeats());
        System.out.println(third.getName() + ": " + third.getBookedSeats());
        System.out.println("Available seats: " + first.getAvailableSeats());
    }
}