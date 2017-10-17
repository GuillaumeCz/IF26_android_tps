package fr.utt.if26.guillaumecz_tp04;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static fr.utt.if26.guillaumecz_tp04.R.string.prenom;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.but_1);
        Button button2 = (Button)findViewById(R.id.but_2);

        EditText nom = (EditText)findViewById(R.id.et_nom);
        EditText prenom = (EditText)findViewById(R.id.et_prenom);

        button1.setOnClickListener(this);
        button1.setOnLongClickListener(clkLong);
        button2.setOnClickListener(this);
        button2.setOnLongClickListener(clkLong);
    }

    private View.OnLongClickListener clkLong = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View view) {
            // Notre intent
            Intent intent = null;
            // L'activité cible
            Class targetAct = null;
            // Un objet (sous forme de dictionnaire) pour mettre plusieurs extras
            Bundle extras = new Bundle();

            // logique de definition de l'activité cible
            if (view.getId() == R.id.but_1) {
                //On definit le comportement dans le cas du premier bouton
                EditText nom = (EditText)findViewById(R.id.et_nom);
                EditText prenom = (EditText)findViewById(R.id.et_prenom);
                targetAct = ResultActivity.class;
                //Placement des données à faire transiter dans le Bundle
                extras.putString("nom", nom.getText().toString());
                extras.putString("prenom", prenom.getText().toString());
            } else if(view.getId() == R.id.but_2) {
                targetAct = GridActivity.class;
            }

            // Création de l'intent avec l'activité cible définie
            intent = new Intent(view.getContext(), targetAct);
            // Ajout des extras
            intent.putExtras(extras);
            // Démarrage de l'activité
            startActivity(intent);
            return true;
        }
    };

    public void onClick(View v) {
        v.setBackgroundColor(Color.GREEN);
    }
}
