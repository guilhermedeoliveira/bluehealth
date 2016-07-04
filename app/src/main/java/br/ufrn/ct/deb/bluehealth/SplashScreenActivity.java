package br.ufrn.ct.deb.bluehealth;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();

        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
//        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }

}