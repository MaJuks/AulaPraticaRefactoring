public class TextStatement extends Statement {
    @Override
    protected String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    protected String rentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n";
    }

    @Override
    protected String footerString(Customer customer) {
        return "Amount owed is " + customer.getTotalCharge() + "\n" +
               "You earned " + customer.getTotalFrequentRenterPoints() + " frequent renter points";
    }
}
