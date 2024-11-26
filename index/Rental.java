public class Rental {
   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
       _movie = movie;
       _daysRented = daysRented;
   }

   public int getDaysRented() {
       return _daysRented;
   }

   public Movie getMovie() {
       return _movie;
   }

   public double getCharge() {
       double thisAmount = 0;

       switch (_movie.getPriceCode()) {
           case Movie.REGULAR:
               thisAmount += 2;
               if (_daysRented > 2) {
                   thisAmount += (_daysRented - 2) * 1.5;
               }
               break;
           case Movie.NEW_RELEASE:
               thisAmount += _daysRented * 3;
               break;
           case Movie.CHILDRENS:
               thisAmount += 1.5;
               if (_daysRented > 3) {
                   thisAmount += (_daysRented - 3) * 1.5;
               }
               break;
       }
       return thisAmount;
   }
}
