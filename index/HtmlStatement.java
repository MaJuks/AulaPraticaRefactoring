public class HtmlStatement extends Statement {
    @Override
    protected String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    @Override
    protected String rentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " + rental.getCharge() + "<BR>\n";
    }

    @Override
    protected String footerString(Customer customer) {
        return "<P>You owe <EM>" + customer.getTotalCharge() + "</EM><P>\n" +
               "On this rental you earned <EM>" + customer.getTotalFrequentRenterPoints() + "</EM> frequent renter points<P>";
    }
}
