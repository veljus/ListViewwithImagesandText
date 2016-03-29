package cirvirlab.mylistviewwithimages;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyLayoutConn extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] str_some_choice;
    private final Integer[] myImageID;

    public MyLayoutConn(Activity context, String[] str_some_choice, Integer[] myImageID) {

        super(context, R.layout.mylayout, str_some_choice);

        this.context = context;
        this.str_some_choice = str_some_choice;
        this.myImageID = myImageID;
    }
    public View getView(int position,View view,ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mylayout, null, true);

        TextView txtChoice = (TextView)rowView.findViewById(R.id.text);
        ImageView imageView =(ImageView)rowView.findViewById(R.id.image);

        txtChoice.setText(str_some_choice[position]);
        imageView.setImageResource(myImageID[position]);

        return rowView;

    }

}
