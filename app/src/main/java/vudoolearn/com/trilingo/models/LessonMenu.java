package vudoolearn.com.trilingo.models;

import android.graphics.drawable.Drawable;

/**
 * Created by olaar on 25/08/2017.
 */

public class LessonMenu {

    private String menuName;
    private int menuImage;
    private String lessonKey;

    public int getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(int menuImage) {
        this.menuImage = menuImage;
    }

    public String getLessonKey() {
        return lessonKey;
    }

    public void setLessonKey(String lessonId) {
        this.lessonKey = lessonId;
    }

    public LessonMenu(String menuName, int menuImage, String lessonKey) {
        this.menuName = menuName;
        this.menuImage = menuImage;
        this.lessonKey = lessonKey;


    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {

        this.menuName = menuName;
    }
}
