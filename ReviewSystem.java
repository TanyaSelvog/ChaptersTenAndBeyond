import java.util.ArrayList;
import java.util.Scanner;

public class ReviewSystem {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Review> reviewList = new ArrayList<Review>();
        Review currentReview;
        int currentRating;
        String currentComment;
        int i;

        System.out.println("Type rating");
        currentRating = scan.nextInt();
        while (currentRating >= 0) {
            currentReview = new Review();
            currentComment = scan.nextLine();
            currentReview.setRatingAndComment(currentRating,
            currentComment);
            reviewList.add(currentReview);
            currentRating = scan.nextInt();
        }

        // Output all comments for given rating
        System.out.println();
        System.out.println("Type rating. To end: -1");
        currentRating = scan.nextInt();
        while (currentRating != -1) {
            for (i = 0; i < reviewList.size(); i++) {
                currentReview = reviewList.get(i);
                if (currentRating == currentReview.getRating()){
                    System.out.println(currentReview.getComment());
                }
            }
            currentRating = scan.nextInt();
        }
    }
}
