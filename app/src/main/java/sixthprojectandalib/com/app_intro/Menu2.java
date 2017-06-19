package sixthprojectandalib.com.app_intro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hp on 6/17/2017.
 */
public class Menu2 extends AppCompatActivity{
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2);
        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
    }
    public void image(View v){
            Intent intent = new Intent(getApplicationContext(), Image2.class);
            startActivityForResult(intent,0);
    }
    public void video(View v){
        Intent intent = new Intent(getApplicationContext(), Video2.class);
        startActivityForResult(intent,0);
    }
    public void findus(View v){
        Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
        startActivityForResult(intent,0);
    }
    public void contact(View v){
        Intent intent = new Intent(getApplicationContext(), Contact.class);
        startActivityForResult(intent,0);
    }
    public void events(View v){
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivityForResult(intent,0);
    }
}
