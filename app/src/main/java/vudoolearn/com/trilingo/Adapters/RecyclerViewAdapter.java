package vudoolearn.com.trilingo.Adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import vudoolearn.com.trilingo.R;
import vudoolearn.com.trilingo.LessonMenu;

/**
 * Created by olaar on 25/08/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>{

    List<vudoolearn.com.trilingo.models.LessonMenu> lessonMenus;
    LessonMenu lessonMenuInstance;

    public RecyclerViewAdapter(List<vudoolearn.com.trilingo.models.LessonMenu> lessonMenus, LessonMenu lessonMenuInstance){
        this.lessonMenus = lessonMenus;
        this.lessonMenuInstance = lessonMenuInstance;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView menuName;
        ImageView menuImage;


        RecyclerViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            menuName = (TextView)itemView.findViewById(R.id.menu_name);
            menuImage = (ImageView) itemView.findViewById(R.id.menu_image);
        }
    }

    @Override
    public int getItemCount() {
        return lessonMenus.size();
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lang_menu_recycler_layout, viewGroup, false);
        RecyclerViewHolder pvh = new RecyclerViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder recyclerViewHolder, int i) {
        recyclerViewHolder.menuName.setText(lessonMenus.get(i).getMenuName());
        recyclerViewHolder.menuImage.setImageResource(lessonMenus.get(i).getMenuImage());
        final String lessonKey = lessonMenus.get(i).getLessonKey();
        final String lessonString = lessonMenus.get(i).getMenuName();
        recyclerViewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lessonMenuInstance.onLessonChoosen(lessonKey, lessonString);
            }
        });
    }

}