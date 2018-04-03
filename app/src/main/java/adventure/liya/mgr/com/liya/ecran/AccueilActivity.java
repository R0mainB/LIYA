package adventure.liya.mgr.com.liya.ecran;

        import android.content.Intent;
        import android.content.res.Configuration;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.ImageButton;
        import android.widget.LinearLayout;

        import adventure.liya.mgr.com.liya.R;

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

        LinearLayout espace = findViewById(R.id.espace_portrait);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            espace.setVisibility(View.GONE);
        } else {
            espace.setVisibility(View.VISIBLE);
        }
    }
}
