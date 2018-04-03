package adventure.liya.mgr.com.liya.tools;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import adventure.liya.mgr.com.liya.R;
import adventure.liya.mgr.com.liya.ecran.AccueilActivity;
import adventure.liya.mgr.com.liya.ecran.DetailAventureActivity;

public class GestionEcran {

    private Context context;
    private Activity activity;

    public GestionEcran(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }

    public void designAccueil() {

        LinearLayout espace = activity.findViewById(R.id.espace_portrait);

        if (context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            espace.setVisibility(View.GONE);
        } else {
            espace.setVisibility(View.VISIBLE);
        }

    }

    public void designDetailAventure() {
        ImageView hero1 = activity.findViewById(R.id.hero1);
        ImageView hero2 = activity.findViewById(R.id.hero2);
        ImageView hero3 = activity.findViewById(R.id.hero3);
        ImageView hero4 = activity.findViewById(R.id.hero4);

        if (context.getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            hero1.setPadding(0,0,0,0);
            hero2.setPadding(0,0,0,0);
            hero3.setPadding(0,0,0,0);
            hero4.setPadding(0,0,0,0);
        } else {
            hero1.setPadding(10,10,10,10);
            hero2.setPadding(10,10,10,10);
            hero3.setPadding(10,10,10,10);
            hero4.setPadding(10,10,10,10);
        }
    }

}
