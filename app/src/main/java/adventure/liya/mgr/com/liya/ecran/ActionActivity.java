package adventure.liya.mgr.com.liya.ecran;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.List;

import adventure.liya.mgr.com.liya.R;
import adventure.liya.mgr.com.liya.model.Action;
import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.model.Peripetie;
import adventure.liya.mgr.com.liya.tools.GestionJsonAventure;

public class ActionActivity extends AppCompatActivity {
    Aventure aventure = new Aventure();
    OpenAventureAsyncTask task;

    private TextView lblDescription;
    private Button btnAction1;
    private Button btnAction2;
    private Button btnAction3;
    private Button btnAction4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        lblDescription = findViewById(R.id.lbl_description_action);
        btnAction1 = findViewById(R.id.btn_action1);
        btnAction2 = findViewById(R.id.btn_action2);
        btnAction3 = findViewById(R.id.btn_action3);
        btnAction4 = findViewById(R.id.btn_action4);

        btnAction1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cacherBouton();
            }
        });

        btnAction2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cacherBouton();
            }
        });

        btnAction3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cacherBouton();
            }
        });

        btnAction4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cacherBouton();
            }
        });


    }

    @Override
    protected void onResume() {
        super.onResume();
        chargerAventure();
    }

    private void chargerAventure(){
        task = new OpenAventureAsyncTask();
        task.execute();
    }

    private void actualiserActivity(Peripetie p){
        actualiserHistoire(p.getDescription());
        actualiserBouton(p.getActions());
    }

    //TODO rendre générique : récupérer liste des variables de types Button et boucler dessus !
    private void actualiserBouton(List<Action> actions) {
        int i = 1;

        for(Action a : actions){
            switch (i){
                case 1:
                    this.btnAction1.setText(a.getTitre());
                    this.btnAction1.setVisibility(View.VISIBLE);
                    break;
                case 2:
                    this.btnAction2.setText(a.getTitre());
                    this.btnAction2.setVisibility(View.VISIBLE);
                    break;
                case 3:
                    this.btnAction3.setText(a.getTitre());
                    this.btnAction3.setVisibility(View.VISIBLE);
                    break;
                case 4:
                    this.btnAction4.setText(a.getTitre());
                    this.btnAction4.setVisibility(View.VISIBLE);
                    break;
            }
            i++;
        }
    }
    private void actualiserHistoire(String description) {
        this.lblDescription.setText(this.lblDescription.getText()+ " " + description);
    }

    private void cacherBouton(){
        this.btnAction1.setVisibility(View.GONE);
        this.btnAction2.setVisibility(View.GONE);
        this.btnAction3.setVisibility(View.GONE);
        this.btnAction4.setVisibility(View.GONE);
    }


    private class OpenAventureAsyncTask extends AsyncTask<Object,Void,Aventure>{
        @Override
        protected Aventure doInBackground(Object... objects) {
            aventure = GestionJsonAventure.lireJsonAventure(ActionActivity.this,"http://rolyncraft.fr/img/perso/liya/aventure.json");
            return null;
        }

        @Override
        protected void onPostExecute(Aventure aventure) {
            Boolean test = true;
            for(Peripetie p : aventure.getHistoires()){
                if(test && p != null){
                    test= false;
                    actualiserActivity(p);
                }

            }
        }
    }

}
