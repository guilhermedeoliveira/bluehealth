package br.ufrn.ct.deb.bluehealth;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainIntroActivity extends com.heinrichreimersoftware.materialintro.app.IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new SimpleSlide.Builder()
//                .title(R.string.slide1_title)
                .description(R.string.slide1_desc)
//                .image(R.drawable.image_1)
                .background(R.color.slide1)
                .image(R.drawable.logo_small)
                .backgroundDark(R.color.slide1d)
                .build());


        addSlide(new FragmentSlide.Builder()
                .fragment(R.layout.fragment_register_form)
//                .image(R.drawable.image_1)
                .background(R.color.slide2)
                .backgroundDark(R.color.slide2d)
                .build());

    }
}
