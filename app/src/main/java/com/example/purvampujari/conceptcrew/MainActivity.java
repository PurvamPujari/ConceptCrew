package com.example.purvampujari.conceptcrew;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abo_next(View view) {
        Toast.makeText(this, "ABOUT US !", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void reg_next(View view) {
        Toast.makeText(this, " REGISTERING", Toast.LENGTH_SHORT).show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.djcsi.co.in/codeshastra"));
        startActivity(browserIntent);
    }

    public void bot_next(View view) {
        Toast.makeText(this, " BOT IS INITIALIZING !", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, Main3Activity.class);

        startActivity(intent);

    }
}
