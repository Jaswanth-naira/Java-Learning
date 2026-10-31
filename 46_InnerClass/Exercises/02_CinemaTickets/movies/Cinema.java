package movies;
public class Cinema {
    private static final int PREMIUM_EXTRA = 100;

    private final String cinemaName;
    private final int basePrice;
    private final Ticket[] soldTickets;
    private int soldCount;

    public Cinema(String cinemaName, int basePrice, int capacity) {
        this.cinemaName = cinemaName;
        this.basePrice = basePrice;
        this.soldTickets = new Ticket[capacity];
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public Ticket sellTicket(String seat, boolean premium) {
        if (soldCount >= soldTickets.length) {
            return null;
        }
        Ticket ticket = new Ticket(seat, premium);
        soldTickets[soldCount++] = ticket;
        return ticket;
    }

    public int totalSales() {
        int totalPrice = 0;
        for (int i = 0; i < soldCount; i++) {
            totalPrice += soldTickets[i].price();
        }
        return totalPrice;
    }

    public class Ticket {
        private final String seat;
        private final boolean premium;

        private Ticket(String seat, boolean premium) {
            this.seat = seat;
            this.premium = premium;
        }

        public int price() {
            return premium ? basePrice + PREMIUM_EXTRA : basePrice;
        }

        public String getSeat() {
            return seat;
        }
    }

    public static class Snack {
        private final String snackName;
        private final int price;

        public Snack(String snackName, int price) {
            this.snackName = snackName;
            this.price = price;
        }

        public String getSnackName() {
            return snackName;
        }

        public int getPrice() {
            return price;
        }
    }
}