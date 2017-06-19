package sixthprojectandalib.com.app_intro;

/**
 * Created by hp on 6/17/2017.
 */

import android.support.v4.app.Fragment;
        import android.support.v4.app.FragmentManager;
        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

public class Video2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment start_frag = fragmentManager.findFragmentById(R.id.fragment_container);
        if(start_frag == null) {
            start_frag = new CM_youtubePlaylist();
            fragmentManager.beginTransaction().add(R.id.fragment_container, start_frag).commit();
        }
    }
}

