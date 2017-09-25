package edu.uark.csce4623.martyh.directassistance;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class newMessageSetup extends AppCompatActivity {

    TextView tvCreateMsg, tvIntroMsg;
    EditText etMessage;
    Button btnContinue;

    Typeface tfLobster, tfCrete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_message_setup);

        tvCreateMsg = (TextView) findViewById(R.id.createMessage);
        tvIntroMsg = (TextView) findViewById(R.id.introCreateMessage);
        btnContinue = (Button) findViewById(R.id.msgContinue);
        etMessage = (EditText) findViewById(R.id.newMessage);

        tfLobster = Typeface.createFromAsset(getAssets(), "LobsterTwo-Regular.ttf");
        tfCrete = Typeface.createFromAsset(getAssets(), "CreteRound-Italic.ttf");

        tvCreateMsg.setTypeface(tfCrete);
        tvIntroMsg.setTypeface(tfCrete);
        etMessage.setTypeface(tfCrete);
        btnContinue.setTypeface(tfCrete);
    }
}
