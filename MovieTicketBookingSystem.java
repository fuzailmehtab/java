import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTicketBookingSystem{

    static class Movie {
        private String title;
        private String[] showtimes;
        private int[] availableSeats;

        public Movie(String title, String[] showtimes) {
            this.title = title;
            this.showtimes = showtimes;
            this.availableSeats = new int[showtimes.length];
            for (int i = 0; i < availableSeats.length; i++) {
                availableSeats[i] = 150; // Assume 100 seats available initially
            }
        }

        public String getTitle() {
            return title;
        }

        public String[] getShowtimes() {
            return showtimes;
        }

        public int getAvailableSeats(int index) {
            return availableSeats[index];
        }

        public void bookSeats(int index, int seats) {
            if (seats <= availableSeats[index]) {
                availableSeats[index] -= seats;
            } else {
                System.out.println("Not enough seats available!");
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Movie: ").append(title).append("\n");
            for (int i = 0; i < showtimes.length; i++) {
                sb.append(i + 1).append(". ").append(showtimes[i])
                  .append(" (Seats available: ").append(availableSeats[i]).append(")\n");
            }
            return sb.toString();
        }
    }

    static class TicketBookingSystem {
        private List<Movie> movies;

        public TicketBookingSystem() {
            movies = new ArrayList<>();
            // Adding some sample movies
            movies.add(new Movie("Sooryavanshi", new String[]{"10:00 AM", "2:00 PM", "6:00 PM"}));
            movies.add(new Movie("3 idiots", new String[]{"11:00 AM", "3:00 PM", "7:00 PM"}));
        }

        public void displayMovies() {
            for (int i = 0; i < movies.size(); i++) {
                System.out.println((i + 1) + ". " + movies.get(i));
            }
        }

        public void bookTicket() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Select a movie by number:");
            displayMovies();
            int movieIndex = scanner.nextInt() - 1;

            if (movieIndex < 0 || movieIndex >= movies.size()) {
                System.out.println("Invalid movie selection.");
                return;
            }

            Movie selectedMovie = movies.get(movieIndex);
            System.out.println("Select a showtime:");
            String[] showtimes = selectedMovie.getShowtimes();
            for (int i = 0; i < showtimes.length; i++) {
                System.out.println((i + 1) + ". " + showtimes[i]);
            }

            int showtimeIndex = scanner.nextInt() - 1;

            if (showtimeIndex < 0 || showtimeIndex >= showtimes.length) {
                System.out.println("Invalid showtime selection.");
                return;
            }

            System.out.println("Enter number of seats to book:");
            int seats = scanner.nextInt();

            selectedMovie.bookSeats(showtimeIndex, seats);
            System.out.println("Booking successfull");
        }
    }

    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. View Movies");
            System.out.println("2. Book Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    system.displayMovies();
                    break;
                case 2:
                    system.bookTicket();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
}
