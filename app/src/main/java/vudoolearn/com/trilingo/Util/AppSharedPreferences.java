package vudoolearn.com.trilingo.Util;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by olaar on 27/08/2017.
 */

public class AppSharedPreferences {

    Context appContext;

    public AppSharedPreferences(Context context){
        this.appContext = context;
    }

    private  final static String USER_STATES = "USER_STATES";
    private  final static String CURRENT_SELECTED_LANG = "CURRENT_SELECTED_LANG";

    public  String getCurrentSelectedLang(){
        SharedPreferences prefs = this.appContext.getSharedPreferences(USER_STATES, MODE_PRIVATE);
        return prefs.getString(CURRENT_SELECTED_LANG, null);
    }

    public void setCurrentSelectedLang(String currentSelectedLang){
        SharedPreferences.Editor editor = this.appContext.getSharedPreferences(USER_STATES, MODE_PRIVATE).edit();
        editor.putString(CURRENT_SELECTED_LANG, currentSelectedLang);
        editor.apply();
    }
}
