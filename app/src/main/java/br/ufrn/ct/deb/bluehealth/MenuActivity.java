package br.ufrn.ct.deb.bluehealth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(this, MainIntroActivity.class);
        startActivity(i);


        setContentView(R.layout.activity_menu);
    }


    public void abrirMapa(View view){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}
