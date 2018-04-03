package adventure.liya.mgr.com.liya.ecran;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import adventure.liya.mgr.com.liya.R;
import adventure.liya.mgr.com.liya.tools.GestionEcran;

public class DetailAventureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_aventure);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Gestion du design
        GestionEcran gestionEcran = new GestionEcran(this, DetailAventureActivity.this);
        gestionEcran.designDetailAventure();

    }
}
