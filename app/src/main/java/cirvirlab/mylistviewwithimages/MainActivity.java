package cirvirlab.mylistviewwithimages;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
    ListView listView;
    String[] str_choice = {"Camera","Map","Comment","Send"};
    Integer[] int_image = {R.drawable.camera,R.drawable.pin,R.drawable.pencil,R.drawable.paperplane};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyLayoutConn adapter = new MyLayoutConn(MainActivity.this,str_choice,int_image);
        listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You choosed: " + str_choice[+position], Toast.LENGTH_SHORT).show();
                if(position==0) {
                    startActivity(new Intent(getApplicationContext(),Activity2.class));

                   // FragmentManager fragmentManager = getFragmentManager();
                   // FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                   // CameraFragment cameraFragment = new CameraFragment();
                   // fragmentTransaction.add(R.id.central_fragment,cameraFragment);
                   // fragmentTransaction.addToBackStack(null);
                   // fragmentTransaction.commit();
                }

            }
        });
    }
}
