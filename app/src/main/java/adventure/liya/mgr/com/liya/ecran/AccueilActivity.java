package adventure.liya.mgr.com.liya.ecran;

        import android.content.res.Configuration;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.LinearLayout;

        import adventure.liya.mgr.com.liya.R;
        import adventure.liya.mgr.com.liya.enumeration.DesEnum;
        import adventure.liya.mgr.com.liya.tools.GestionDes;

public class AccueilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }

    @Override
    protected void onResume() {
        super.onResume();

        LinearLayout espace = findViewById(R.id.espace_portrait);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            espace.setVisibility(View.GONE);
        } else {
            espace.setVisibility(View.VISIBLE);
        }

        GestionDes des = new GestionDes();

        des.lancerDes(DesEnum.FACE6);

        Log.i(AccueilActivity.class.getName(), "Aléatoire 6 : " + des.getResultat());
        Log.i(AccueilActivity.class.getName(), "Vérification résultat 6 : " + des.getType());

        des.lancerDes(DesEnum.FACE100);
        Log.i(AccueilActivity.class.getName(), "Aléatoire 100 : " + des.getResultat());
        Log.i(AccueilActivity.class.getName(), "Vérification résultat 100 : " + des.getType());
    }
}
