package sixthprojectandalib.com.app_intro;

/**
 * Created by hp on 6/17/2017.
 */
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Contact extends AppCompatActivity {
    private Button button;
    private EditText sname,ssubject,squery,snumber;
    private String ssname,sssubject,ssquery,ssnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact);
        sname=(EditText) findViewById(R.id.name);
        ssubject=(EditText) findViewById(R.id.subject);
        squery=(EditText) findViewById(R.id.query);
        snumber=(EditText) findViewById(R.id.number);

        button = (Button) findViewById(R.id.buttonCall);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String phone = "50505050";
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null));
                startActivity(intent);
            }
        });
        Button button1 = (Button) findViewById(R.id.buttonMail);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ssname=sname.getText().toString();
                sssubject=ssubject.getText().toString();
                ssquery=squery.getText().toString();
                ssnumber=snumber.getText().toString();

                if( snumber.getText().toString().length() == 0 )
                    snumber.setError( "All Fields are mandatory!!!!" );
                if( sname.getText().toString().length() == 0 )
                    sname.setError( "All Fields are mandatory!!!!" );
                if( ssubject.getText().toString().length() == 0 )
                    ssubject.setError( "All Fields are mandatory!!!!" );
                if( squery.getText().toString().length() == 0 )
                    squery.setError( "All Fields are mandatory!!!!" );

                if(snumber.getText().toString().length() != 0 && sname.getText().toString().length() != 0 && ssubject.getText().toString().length() != 0 && squery.getText().toString().length() != 0 ) {
                    Intent emailIntent = new Intent(Intent.ACTION_SEND);
                    emailIntent.setData(Uri.parse("mailto:"));
                    String[] to = {"info@kookyinfomedia.com"};
                    emailIntent.putExtra(Intent.EXTRA_EMAIL, to);
                    emailIntent.putExtra(Intent.EXTRA_SUBJECT, " " + sssubject);
                    emailIntent.putExtra(Intent.EXTRA_TEXT, " " + ssquery + "\n" + ssname + "\n" + ssnumber);
                    emailIntent.setType("message/rfc822");
                    startActivity(Intent.createChooser(emailIntent, "Choose App"));
                }
            }
        });
    }
}

