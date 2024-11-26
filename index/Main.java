public class Main {
  public static void main(String[] args) {
      // Criando filmes
      Movie movie1 = new Movie("The Godfather", Movie.REGULAR);
      Movie movie2 = new Movie("Frozen", Movie.CHILDRENS);
      Movie movie3 = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);

      // Criando aluguéis
      Rental rental1 = new Rental(movie1, 5);
      Rental rental2 = new Rental(movie2, 4);
      Rental rental3 = new Rental(movie3, 2);

      // Criando cliente
      Customer customer = new Customer("John Doe");
      customer.addRental(rental1);
      customer.addRental(rental2);
      customer.addRental(rental3);

      // Exibindo os relatórios
      System.out.println("Relatório em texto:");
      System.out.println(customer.statement());

      System.out.println("\nRelatório em HTML:");
      System.out.println(customer.htmlStatement());
  }
}
