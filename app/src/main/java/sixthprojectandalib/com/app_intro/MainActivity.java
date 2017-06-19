package sixthprojectandalib.com.app_intro;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    private Toolbar mToolbar;
    //android.widget.SearchView sv;
    String[] names={
            "Most One-Day Internationals",
            "Most One-Day Internationals",
            "Most One-Day Internationals",
            "Most One-Day Internationals",
            "Most One-Day Internationals",
            "Most One-Day Internationals",
            "Most One-Day Internationals",
            "Most One-Day Internationals"
    };
    int[] images={
            R.drawable.s,
            R.drawable.s,
            R.drawable.s,
            R.drawable.s,
            R.drawable.s,
            R.drawable.s,
            R.drawable.s,
            R.drawable.s
    };
    String[] texts={
            "Cricket is a bat-and-ball game"+
                    " bat-and-ball game",
            "Cricket is a bat-and-ball game "+
                    " bat-and-ball game",
            "Cricket is a bat-and-ball game"+
                    " bat-and-ball game" ,
            "Cricket is a bat-and-ball game"+
                    " bat-and-ball game" ,
            "Cricket is a bat-and-ball game"+
                    " bat-and-ball game" ,
            "Cricket is a bat-and-ball game"+
                    " bat-and-ball game" ,
            "Cricket is a bat-and-ball game "+
                    " bat-and-ball game" ,
            "Cricket is a bat-and-ball game "+
                    " bat-and-ball game"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView) findViewById(R.id.listView1);
        Button btn=(Button)findViewById(R.id.btnNext);
        //sv=(android.widget.SearchView) findViewById(R.id.searchView1);
        //ADAPTER
        final Adapter adapter=new Adapter(this, getPlayers());
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 1) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 2) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 3) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 4) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 5) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 6) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 7) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
                if (position == 8) {
                    Intent obj = new Intent(view.getContext(), Display.class);

                    startActivityForResult(obj, 0);
                }
            }
        });

        // mToolbar.setNavigationIcon(R.drawable.menu);
               /* sv.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener() {

                    public boolean onQueryTextSubmit(String arg0) {
                        // TODO Auto-generated method stub
                        return false;
                    }

                    public boolean onQueryTextChange(String query) {
                        // TODO Auto-generated method stub
                        adapter.getFilter().filter(query);
                        return false;
                    }

                });*/
        //  mToolbar.setNavigationIcon(R.drawable.menu);
    }
    public void next(View v){
        Intent intent = new Intent(this,Menu2.class);
        startActivity(intent);
    }
    public static int getScreenWidth(){
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }




    private ArrayList<First> getPlayers() {
        ArrayList<First> players = new ArrayList<First>();
        First p;
        for (int i = 0; i < names.length; i++) {
            p = new First(names[i], images[i], texts[i]);
            players.add(p);
        }
        return players;

    }


}
