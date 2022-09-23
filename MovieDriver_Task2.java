import java.util.Scanner;

public class MovieDriver_Task2 {
	public static void main(String[] a) {
		Movie movie;
		movie = new Movie();
		
		String title, rating;
		int soldTickets;
		String enterAnother;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please enter the title of a movie: ");
			title = scanner.nextLine();
			movie.setTitle(title );
			System.out.println("Please enter the rating of a movie: ");
			rating = scanner.nextLine();
			movie.setRating(rating);
			System.out.println("Please enter the tickets sold a a theatre of a movie: ");
			soldTickets = scanner.nextInt();
			movie.setSoldTickets(soldTickets);
			System.out.println(movie.toString());
			System.out.println("Do you want to enter another? (y or n)");
			scanner.nextLine();
			enterAnother = scanner.nextLine();
		} while (enterAnother.equals("y"));
		System.out.println("Goodbye");
	}
}
