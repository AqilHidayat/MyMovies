package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MovieActivity extends AppCompatActivity {

    TextView tvTitle;
    TextView tvInfo;
    TextView tvDes;
    TextView tvWatchOn;
    TextView tvInTheatre;
    RatingBar rbRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        tvTitle = findViewById(R.id.textViewTitle);
        tvInfo = findViewById(R.id.textViewInfo);
        tvDes = findViewById(R.id.textViewDes);
        tvWatchOn = findViewById(R.id.textViewWatchedOn);
        tvInTheatre = findViewById(R.id.textViewInTheatre);
        rbRating = findViewById(R.id.ratingBar);

        Intent intentReceived = getIntent();
        Movie_item mov = (Movie_item)intentReceived.getSerializableExtra("list");


        rbRating.setIsIndicator(true);
        rbRating.setRating(mov.getRating());

        tvTitle.setText(mov.getTitle());
        tvInfo.setText(mov.getYear() + " - " + mov.getGenre());
        tvDes.setText(mov.getDescription());
        tvWatchOn.setText("Watch on: " + mov.getDateString());
        tvInTheatre.setText("In Theatre: " + mov.getIn_theatre());

    }
}
