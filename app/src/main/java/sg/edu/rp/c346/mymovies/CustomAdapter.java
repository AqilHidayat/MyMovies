package sg.edu.rp.c346.mymovies;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 16019623 on 23/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie_item> movieList;


    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Movie_item> objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvInfo = rowView.findViewById(R.id.textViewInfo);
        ImageView ivFirst = rowView.findViewById(R.id.imageViewFirst);

        Movie_item curItem = movieList.get(position);

        tvTitle.setText(curItem.getTitle());
        tvInfo.setText(curItem.getYear() + " - " + curItem.getGenre());

        if(curItem.isFirst()){
            ivFirst.setImageResource(R.drawable.rating_pg13);
        }
        else{
            ivFirst.setImageResource(R.drawable.rating_pg);
        }
        return rowView;
    }
}
