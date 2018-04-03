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
        import adventure.liya.mgr.com.liya.tools.GestionDes;
        import adventure.liya.mgr.com.liya.tools.GestionEcran;

public class AccueilActivity extends AppCompatActivity {

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

        // Gestion du design
        GestionEcran gestionEcran = new GestionEcran(this, AccueilActivity.this);
        gestionEcran.designAccueil();

        ImageButton btnContinuer = findViewById(R.id.btn_continuer);

        btnContinuer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccueilActivity.this, DetailAventureActivity.class);
                startActivity(intent);
            }
        });
    }

    public void fermerApplication(View view) {
        finish();
        moveTaskToBack(true);
    }
}
