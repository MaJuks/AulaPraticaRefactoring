public abstract class Statement {
    public String value(Customer customer) {
        String result = headerString(customer);
        for (Rental rental : customer.getRentals()) {
            result += rentalString(rental);
        }
        result += footerString(customer);
        return result;
    }

    protected abstract String headerString(Customer customer);

    protected abstract String rentalString(Rental rental);

    protected abstract String footerString(Customer customer);
}
