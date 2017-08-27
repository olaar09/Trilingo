package vudoolearn.com.trilingo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;

public class LessonChoosen extends AppCompatActivity {

    private String languageSelected;
    private String lessonSelected;
    private String lessonSelectedString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_choosen);

        languageSelected = getIntent().getStringExtra(LessonMenu.LANGUAGE_SELECTED_KEY);
        lessonSelected = getIntent().getStringExtra(LessonMenu.LESSON_SELECTED_KEY);
        lessonSelectedString = getIntent().getStringExtra(LessonMenu.LESSON_SELECTED_STRING);

        getSupportActionBar().setTitle(Html.fromHtml(String.format("<font color='#f5f5f5'> %s in %s</font>", lessonSelectedString.toLowerCase(), languageSelected.toLowerCase())));

    }



}
