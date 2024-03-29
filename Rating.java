/**
 * Internship Builder
 * CSCE 240 - Portia Plante
 * @author Jonathan Brennan, LJ Todd, Patrick Burroughs, Tyler Madden
 */

public class Rating {
    private int numRating;
    private String comment;
    private User user;
    private int ID;

    public Rating(int numRating, String comment, User user) {
        this.numRating = numRating;
        this.comment = comment;
        this.user = user;
        this.ID = RatingList.getRatings().size();
    }

    public void editRating(Rating rating, int numRating, String comment) {
        rating.setNumRating(numRating);
        rating.setComment(comment);
    }

    /**
     * Setter for the comment pn the rating
     * @param comment new comment
     */
    public void setComment(String newComment) {
        this.comment = newComment;
    }

    /**
     * Setter for the numerical value of the rating
     * @param numRating new rating # value
     */
    public void setNumRating(int newNumRating) {
        this.numRating = newNumRating;
    }

    /**
     * Getter for the numerical value of the rating
     * @return rating # value
     */
    public int getNumRating() {
        return numRating;
    }

    /**
     * Getter for the comment on the rating
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Getter for the user who is being rated
     * @return user being rated
     */
    public User getUser() {
        return user;
    }

    /**
     * Getter for the rating's identifier
     * @return rating's identifier
     */
    public int getID() {
        return ID;
    }

    /**
     * Setter for the new ID of a rating
     * @param ID the new ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }
}