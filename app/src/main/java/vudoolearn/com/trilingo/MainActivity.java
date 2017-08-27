package vudoolearn.com.trilingo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatSpinner;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(Html.fromHtml("<font color='#f5f5f5'> Trilingo </font>"));

        TextView introTextView = (TextView) findViewById(R.id.intro_text_view);
        introTextView.setText(Html.fromHtml("This application is designed to tutor Hausa, Yoruba and Igbo language and it's also voice enabled. <br> <br> <b> Select a language below and press continue</b>"));
    }


    public void languageSelected(View v){
        AppCompatSpinner langChooseSpinner = (AppCompatSpinner) findViewById(R.id.chooselang_spinner);
        String selected = langChooseSpinner.getSelectedItem().toString();
        if (selected.equals("Select a language")){
            Toast.makeText(getApplicationContext(), "Please select a language first",
                    Toast.LENGTH_LONG).show();
        }else{
            Intent intent = new Intent(MainActivity.this, LessonMenu.class);
            intent.putExtra("LANGUAGE_SELECTED", selected);
            startActivity(intent);
        }

    }



}
