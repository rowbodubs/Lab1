import java.util.Scanner;

public class MovieDriver_Task1 {
	public static void main(String[] a) {
		Movie movie;
		movie = new Movie();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the title of a movie: ");
		String title = scanner.nextLine();
		movie.setTitle(title );
		System.out.print("Please enter the rating of a movie: ");
		String rating = scanner.nextLine();
		movie.setRating(rating);
		System.out.print("Please enter the tickets sold a a theatre of a movie: ");
		int soldTickets = scanner.nextInt();
		movie.setSoldTickets(soldTickets);
		System.out.print(movie.toString());
	}
}
