package vudoolearn.com.trilingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView introTextView = (TextView) findViewById(R.id.intro_text_view);
        introTextView.setText(Html.fromHtml("This application is designed to tutor Hausa, Yoruba and Igbo language and it's also voice enabled. It is designed to enhance the easy and efficient learning of the three languages on the go. <br> <br> <b> Select a language below and press continue</b>"));
    }



}
