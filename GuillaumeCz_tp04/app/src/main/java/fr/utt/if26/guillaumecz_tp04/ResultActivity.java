package fr.utt.if26.guillaumecz_tp04;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        // recuperation des infos contenus dans le bundle lors de son appel
        Bundle extras = getIntent().getExtras();
        EditText et = (EditText)findViewById(R.id.result);
        // recuperation des variables
        String nom = extras.getString("nom");
        String prenom = extras.getString("prenom");
        // concatenation des variables
        String fullname = nom.concat(" ".concat(prenom));
        // Placement du texte dans la view
        et.setText(fullname);
    }
}
