package adventure.liya.mgr.com.liya.ecran;

        import android.content.Intent;
        import android.content.Intent;
        import android.content.res.Configuration;
        import android.media.Image;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.LinearLayout;

        import adventure.liya.mgr.com.liya.R;
        import adventure.liya.mgr.com.liya.enumeration.DesEnum;
        import adventure.liya.mgr.com.liya.model.Aventure;
        import adventure.liya.mgr.com.liya.tools.GestionDes;
        import adventure.liya.mgr.com.liya.tools.GestionEcran;
        import adventure.liya.mgr.com.liya.tools.GestionJsonAventure;

public class AccueilActivity extends AppCompatActivity {
    private Aventure aventure;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        ImageButton btnNewGame = findViewById(R.id.btn_new_game);

        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccueilActivity.this,SelectionAventureActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        GestionDesign();
    }

    public void GestionDesign(){
        GestionEcran gestionEcran = new GestionEcran(this, AccueilActivity.this);
        gestionEcran.designAccueil();
    }

    public void fermerApplication(View view) {
        finish();
        moveTaskToBack(true);
    }
}
