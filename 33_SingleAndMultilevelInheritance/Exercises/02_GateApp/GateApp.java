class TravelCard {

    private int balance = 0;

    boolean recharge(int amount) {
        if (amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }

    boolean pay(int fare) {
        if (fare <= 0 || fare > balance) {
            return false;
        }
        balance -= fare;
        return true;
    }

    int getBalance() {
        return balance;
    }
}

class StudentCard extends TravelCard {

    boolean payStudentFare(int fare) {
        return pay(fare / 2);
    }
}

class ScholarCard extends StudentCard {

    private int freeRidesLeft = 2;

    boolean ride(int fare) {
        if (fare <= 0) {
            return false;
        }
        if (freeRidesLeft == 0) {
            return payStudentFare(fare);
        }
        freeRidesLeft--;
        return true;
    }

    int getFreeRidesLeft() {
        return freeRidesLeft;
    }
}

class MetroGate {

    private int fare;
    private int entriesAllowed = 0;

    MetroGate(int fare) {
        this.fare = fare;
    }

    boolean enter(TravelCard card) {
        if (card == null) {
            return false;
        }
        if (!card.pay(this.fare)) {
            return false;
        }
        entriesAllowed++;
        return true;
    }

    int getEntriesAllowed() {
        return entriesAllowed;
    }

    int countCannotEnter(TravelCard[] cards) {
        if (cards == null) {
            return 0;
        }
        int count = 0;
        for (TravelCard card : cards) {
            if (card == null) {
                continue;
            }
            if (card.getBalance() < fare) {
                count++;
            }
        }
        return count;
    }
}

class GateApp {

    public static void main(String[] args) {
        TravelCard plainCard = new TravelCard();
        StudentCard studentCard = new StudentCard();
        ScholarCard scholarCard = new ScholarCard();

        TravelCard studentAsCard = studentCard;
        TravelCard scholarAsCard = scholarCard;

        System.out.println("Recharge plain: " + plainCard.recharge(100));
        System.out.println("Recharge student: " + studentAsCard.recharge(100));
        System.out.println("Recharge scholar: " + scholarAsCard.recharge(100));
        System.out.println("Same student object: " + (studentAsCard == studentCard));
        System.out.println("Student balance: " + studentCard.getBalance());

        MetroGate gate = new MetroGate(40);
        TravelCard[] cards = {plainCard, studentCard, scholarCard};

        for (int i = 0; i < cards.length; i++) {
            System.out.println("Card " + i + " enters: " + gate.enter(cards[i]));
        }

        System.out.println("Plain balance: " + plainCard.getBalance());
        System.out.println("Student balance: " + studentCard.getBalance());
        System.out.println("Scholar balance: " + scholarCard.getBalance());
        System.out.println("Scholar free rides left: " + scholarCard.getFreeRidesLeft());
        System.out.println("Gate entries: " + gate.getEntriesAllowed());

        System.out.println("Student discount counter: " + studentCard.payStudentFare(40));
        System.out.println("Scholar discount counter: " + scholarCard.ride(40));
        System.out.println("Student balance: " + studentCard.getBalance());
        System.out.println("Scholar balance: " + scholarCard.getBalance());
        System.out.println("Scholar free rides left: " + scholarCard.getFreeRidesLeft());

        System.out.println("Cannot enter now: " + gate.countCannotEnter(cards));
        System.out.println("Student enters through gate: " + gate.enter(studentCard));
        System.out.println("Cannot enter now: " + gate.countCannotEnter(cards));
        System.out.println("Student enters again: " + gate.enter(studentCard));
        System.out.println("Student balance: " + studentCard.getBalance());
        System.out.println("Null card enters: " + gate.enter(null));
        System.out.println("Null array count: " + gate.countCannotEnter(null));

        TravelCard[] queue = {null, studentCard, null};
        System.out.println("Queue with nulls count: " + gate.countCannotEnter(queue));
        System.out.println("Gate entries: " + gate.getEntriesAllowed());
    }
}
