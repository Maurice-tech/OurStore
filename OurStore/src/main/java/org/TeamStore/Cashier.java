package org.TeamStore;
public class Cashier extends Staff {
    private int Rating;

    public Cashier(String staffName, String id, String email, int rating) {
        super(staffName, id, email);
        Rating = rating;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }
}
