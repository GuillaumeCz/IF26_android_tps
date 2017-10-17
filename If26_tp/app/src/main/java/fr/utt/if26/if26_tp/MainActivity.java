package fr.utt.if26.if26_tp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String message = "Bonjour IF26 ! :D";

    @Override
    /**
     * Executed on the creation of the Activity
     * @param savedInstanceState Instance of the current activity, if reloading
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tx = (TextView) findViewById(R.id.message);
        tx.setText(message);
    }
}
