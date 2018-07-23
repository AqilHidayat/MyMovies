package sg.edu.rp.c346.mymovies;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Created by 16019623 on 23/7/2018.
 */

public class Movie_item implements Serializable {

    private String title;
    private String year;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;
    private boolean isFirst;
    private int rating;

    public Movie_item(String title, String year, String genre, Calendar watched_on, String in_theatre, String description, boolean isFirst, int rating) {
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
        this.isFirst = isFirst;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public void setWatched_on(Calendar watched_on) {
        this.watched_on = watched_on;
    }



    public String getIn_theatre() {
        return in_theatre;
    }

    public void setIn_theatre(String in_theatre) {
        this.in_theatre = in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateString() {
        String str = watched_on.get(Calendar.DAY_OF_MONTH)+"/"+watched_on.get(Calendar.MONTH)+"/"+watched_on.get(Calendar.YEAR);
        return str;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public void setFirst(boolean first) {
        isFirst = first;
    }

    @Override
    public String toString() {
        return "Movie_item{" +
                "title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", genre='" + genre + '\'' +
                ", watched_on=" + watched_on +
                ", in_theatre='" + in_theatre + '\'' +
                ", description='" + description + '\'' +
                ", isFirst=" + isFirst +
                ", rating=" + rating +
                '}';
    }
}
