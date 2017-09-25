package edu.uark.csce4623.martyh.directassistance;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class welcomeSetup extends AppCompatActivity {

    TextView tvWelcome, tvSetName;
    EditText etName;
    Button btnContinue;

    Typeface tfLobster, tfCrete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_setup);

        tvWelcome = (TextView) findViewById(R.id.welcomeMessage);
        tvSetName = (TextView) findViewById(R.id.setNameMessage);
        btnContinue = (Button) findViewById(R.id.nameContinue);
        etName = (EditText) findViewById(R.id.etYourName);

        tfLobster = Typeface.createFromAsset(getAssets(), "LobsterTwo-Regular.ttf");
        tfCrete = Typeface.createFromAsset(getAssets(), "CreteRound-Italic.ttf");

        tvWelcome.setTypeface(tfLobster);
        tvSetName.setTypeface(tfCrete);
        etName.setTypeface(tfCrete);
        btnContinue.setTypeface(tfCrete);

    }
}
