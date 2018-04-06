package adventure.liya.mgr.com.liya.ecran;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import adventure.liya.mgr.com.liya.R;
import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.tools.GestionEcran;

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
