// package Lab 4;
import java.util.Scanner;

class Movie {
    String title;
    String genre;
    int numberOfRatings = 0;
    int totalRatingPoints = 0;

    // Add a new rating
    void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            totalRatingPoints += rating;
            numberOfRatings++;
        } else {
            System.out.println("Invalid Rating! Rating must be between 1 and 5.");
        }
    }

    // Calculate average rating
    double calculateAverage() {
        if (numberOfRatings == 0) {
            return 0;
        }
        return (double) totalRatingPoints / numberOfRatings;
    }

    // Display movie details
    void displayDetails() {
        double average = calculateAverage();
        String classification;

        if (average >= 4.5) {
            classification = "Excellent";
        } else if (average >= 3.5) {
            classification = "Good";
        } else if (average >= 2.5) {
            classification = "Average";
        } else {
            classification = "Poor";
        }

        System.out.println("\nMovie Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Number of Valid Ratings: " + numberOfRatings);
        System.out.printf("Average Rating: %.2f\n", average);
        System.out.println("Classification: " + classification);
    }
}

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Movie movie = new Movie();

        // Input movie details
        System.out.print("Enter movie title: ");
        movie.title = sc.nextLine();

        System.out.print("Enter genre: ");
        movie.genre = sc.nextLine();

        System.out.print("Enter number of ratings: ");
        int n = sc.nextInt();

        // Input ratings using loop
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter rating " + i + ": ");
            int rating = sc.nextInt();
            movie.addRating(rating);
        }

        // Display details
        movie.displayDetails();

        sc.close();
    }
}