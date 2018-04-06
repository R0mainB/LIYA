package adventure.liya.mgr.com.liya.ecran;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import adventure.liya.mgr.com.liya.R;

public class ActionActivity extends AppCompatActivity {

    private TextView lblTitre;
    private TextView lblDescription;
    private Button btnAction1;
    private Button btnAction2;
    private Button btnAction3;
    private Button btnAction4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        lblTitre = findViewById(R.id.lbl_titre_action);
        lblDescription = findViewById(R.id.lbl_description_action);
        btnAction1 = findViewById(R.id.btn_action1);
        btnAction2 = findViewById(R.id.btn_action2);
        btnAction3 = findViewById(R.id.btn_action3);
        btnAction4 = findViewById(R.id.btn_action4);
    }

    @Override
    protected void onResume() {
        super.onResume();


    }
}
