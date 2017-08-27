package vudoolearn.com.trilingo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView ;
import android.os.Bundle;
import android.text.Html;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import vudoolearn.com.trilingo.Adapters.RecyclerViewAdapter;
import vudoolearn.com.trilingo.Util.AppSharedPreferences;

public class LessonMenu extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private List<vudoolearn.com.trilingo.models.LessonMenu> lessonMenuList;
    private String languageSelected;

    public final static String LANGUAGE_SELECTED_KEY = "LANGUAGE_SELECTED";
    public final static String LESSON_SELECTED_KEY = "LESSON_SELECTED";
    public final static String LESSON_SELECTED_STRING = "LESSON_SELECTED_STRING";

    private AppSharedPreferences appSharedPreferences;
    public final static String LEARN_DICTIONARY_KEY = "LEARN_DICTIONARY";
    public final static String  LEARN_GREETINGS_KEY = "LEARN_GREETINGS";
    public final static String LEARN_PROVERBS_KEY = "LEARN_PROVERBS";
    public final static String LEARN_ALPHABET_KEY = "LEARN_ALPHABET";
    public final static String LEARN_FOODS_KEY = "LEARN_FOODS";
    public final static String LEARN_MARKINGS_KEY = "LEARN_MARKINGS";
    public final static String LEARN_NUMBERS_KEY = "LEARN_NUMBERS";
    public final static String LEARN_PART_OF_BODY_KEY = "LEARN_PART_OF_BODY";
    public final static String LEARN_HOME_ITEMS_KEY = "LEARN_HOME_ITEMS";
    public final static String LEARN_FAMILY_MEMBER_KEY = "LEARN_FAMILY_MEMBER";
    public final static String LEARN_ANIMALS_KEY = "LEARN_ANIMAL";
    public final static String LEARN_PROFFESSION_KEY = "LEARN_PROFFESSION";
    public final static String LEARN_DAYS_OF_WEEK_KEY = "LEARN_DAYS_OF_WEEK";
    public final static String LEARN_MONTHS_OF_YEAR_KEY = "LEARN_MONTHS_OF_YEAR";

    public final static String LEARN_MARKINGS_STRING = "Learn time markings";
    public final static String LEARN_NUMBERS_STRING = "Learn numbers";
    public final static String LEARN_PART_OF_BODY_STRING = "Learn part of body";
    public final static String LEARN_HOME_ITEMS_STRING = "Learn home items";
    public final static String LEARN_FAMILY_MEMBER_STRING = "Learn family members";
    public final static String LEARN_ANIMALS_STRING = "Learn animals";
    public final static String LEARN_PROFFESSION_STRING = "Learn proffesions";
    public final static String LEARN_DAYS_OF_WEEK_STRING = "Learn days of week";
    public final static String LEARN_MONTHS_OF_YEAR_STRING = "Learn days of month";
    public final static String LEARN_DICTIONARY_STRING = "Learn Dictionary";
    public final static String  LEARN_GREETINGS_STRING = "Learn Greetings";
    public final static String LEARN_PROVERBS_STRING = "Learn Proverbs";
    public final static String LEARN_ALPHABET_STRING = "Learn Alphabets";
    public final static String LEARN_FOODS_STRING = "Learn Foods";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor);
        appSharedPreferences = new AppSharedPreferences(getApplicationContext());

        languageSelected = getIntent().getStringExtra(LANGUAGE_SELECTED_KEY);
        if (languageSelected == null) {
            languageSelected = appSharedPreferences.getCurrentSelectedLang();
        } else {
            appSharedPreferences.setCurrentSelectedLang(languageSelected);
        }

        getSupportActionBar().setTitle(Html.fromHtml(String.format("<font color='#f5f5f5'> Learn %s</font>", languageSelected)));
        showListView();

    }

    private void showListView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.lesson_menu_recyclerview);
       // GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3); // incase he wants grid instead..
        mLinearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);

        lessonMenuList = new ArrayList<>();
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_FOODS_STRING, R.drawable.ic_shopping_basket_red_300_24dp, LEARN_FOODS_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_ALPHABET_STRING, R.drawable.ic_spellcheck_indigo_300_24dp, LEARN_ALPHABET_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_PROVERBS_STRING, R.drawable.ic_record_voice_over_deep_orange_300_24dp, LEARN_PROVERBS_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_GREETINGS_STRING, R.drawable.ic_supervisor_account_teal_300_24dp, LEARN_GREETINGS_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_ANIMALS_STRING, R.drawable.ic_bug_report_lime_300_24dp, LEARN_ANIMALS_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_MARKINGS_STRING, R.drawable.ic_alarm_yellow_300_24dp, LEARN_MARKINGS_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_NUMBERS_STRING, R.drawable.ic_timer_3_light_green_300_24dp, LEARN_NUMBERS_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_DAYS_OF_WEEK_STRING, R.drawable.ic_date_range_teal_300_24dp, LEARN_DAYS_OF_WEEK_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_MONTHS_OF_YEAR_STRING, R.drawable.ic_date_range_teal_300_24dp, LEARN_MONTHS_OF_YEAR_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_PROFFESSION_STRING, R.drawable.ic_assignment_ind_pink_300_24dp, LEARN_PROFFESSION_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_PART_OF_BODY_STRING, R.drawable.ic_accessibility_blue_grey_300_24dp, LEARN_PART_OF_BODY_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_HOME_ITEMS_STRING, R.drawable.ic_computer_indigo_400_24dp, LEARN_HOME_ITEMS_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_FAMILY_MEMBER_STRING, R.drawable.ic_accessible_light_blue_300_24dp, LEARN_FAMILY_MEMBER_KEY));
        lessonMenuList.add(new vudoolearn.com.trilingo.models.LessonMenu(LEARN_DICTIONARY_STRING, R.drawable.ic_translate_cyan_300_24dp, LEARN_DICTIONARY_KEY));

        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(lessonMenuList, this);
        mRecyclerView.setAdapter(recyclerViewAdapter);
    }


    public void onLessonChoosen(String lessonSelected, String lessonSelectedString) {
      //  if (lessonSelected == LEARN_DICTIONARY_KEY) {
          //      featureNotAvailable();
          //  return;
       // }
        Intent intent = new Intent(LessonMenu.this, LessonChoosen.class);
        intent.putExtra(LANGUAGE_SELECTED_KEY, languageSelected);
        intent.putExtra(LESSON_SELECTED_KEY, lessonSelected);
        intent.putExtra(LESSON_SELECTED_STRING, lessonSelectedString);
        startActivity(intent);
    }


    public  void featureNotAvailable() {
        Toast.makeText(getApplicationContext(), "This feature isnt available yet",
                Toast.LENGTH_LONG).show();
    }

}