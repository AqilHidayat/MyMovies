package sg.edu.rp.c346.mymovies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie_item> alMovieList;
    CustomAdapter caMovie;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovies);

        alMovieList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2014, 11,15);

        Calendar date2 = Calendar.getInstance();
        date2.set(2015, 05, 15);

        Movie_item mov1 = new Movie_item("The Avengers","2012", "Action | Sci-Fi", date1 ,"Golden Village - Bishan", "Nick Fury of S.H.I.E.L.D. assembles a team of superheroes to save the planet from Loki and his army.", true, 4);
        Movie_item mov2 = new Movie_item("Planes", "2013", "Animation | Comedy", date2, "Cathay - AMK Hub", "A crop-dusting plane with a fear of heights lives his dream of competing in a famous around-the-world aerial race.", false, 2 );


        alMovieList.add(mov1);
        alMovieList.add(mov2);

        caMovie = new CustomAdapter(this, R.layout.movie_layout, alMovieList);

        lvMovie.setAdapter(caMovie);

        lvMovie.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(), MovieActivity.class);
                Movie_item pos = alMovieList.get(position);


                intent.putExtra("list", pos);

                startActivity(intent);
            }
        });


    }
}
