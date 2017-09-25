package edu.uark.csce4623.martyh.directassistance;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mainAcrivity extends AppCompatActivity {

    TextView tvDirAssist;

    Typeface tfLobster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acrivity);

        tvDirAssist = (TextView) findViewById(R.id.directAssist);

        tfLobster = Typeface.createFromAsset(getAssets(), "LobsterTwo-Regular.ttf");

        tvDirAssist.setTypeface(tfLobster);

    }
}
