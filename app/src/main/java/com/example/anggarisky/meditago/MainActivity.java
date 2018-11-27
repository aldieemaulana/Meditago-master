package com.example.anggarisky.meditago;

import android.graphics.Typeface;
import android.support.design.widget.AppBarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textTitle, textSubTitle, textLogo, textItemOne,
            textItemTwo, textItemThree, textItemFour, textItemFive, textItemSix, textBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface a = Typeface.createFromAsset(getAssets(), "fonts/Fredoka.ttf");
        Typeface b = Typeface.createFromAsset(getAssets(), "fonts/MontserratLight.ttf");
        Typeface c = Typeface.createFromAsset(getAssets(), "fonts/MontserratMedium.ttf");

        textTitle = (TextView) findViewById(R.id.textTitle);
        textSubTitle = (TextView) findViewById(R.id.textSubTitle);
        textLogo = (TextView) findViewById(R.id.textLogo);

        textTitle.setTypeface(c);
        textSubTitle.setTypeface(b);
        textLogo.setTypeface(a);

        textItemOne = (TextView) findViewById(R.id.textItemOne);
        textItemTwo = (TextView) findViewById(R.id.textItemTwo);
        textItemThree = (TextView) findViewById(R.id.textItemThree);
        textItemFour = (TextView) findViewById(R.id.textItemFour);
        textItemFive = (TextView) findViewById(R.id.textItemFive);
        textItemSix = (TextView) findViewById(R.id.textItemSix);
        textBtn = (TextView) findViewById(R.id.textBtn);

        textItemOne.setTypeface(c);
        textItemTwo.setTypeface(c);
        textItemThree.setTypeface(c);
        textItemFour.setTypeface(c);
        textItemFive.setTypeface(c);
        textItemSix.setTypeface(c);
        textBtn.setTypeface(c);

        /*AppBarLayout appBarLayout = findViewById(R.id.appBarLayout);
        final Toolbar toolBar = findViewById(R.id.toolbar);

        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (Math.abs(i) == appBarLayout.getTotalScrollRange()) {
                    toolBar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorAccent));
                } else {
                    toolBar.setBackgroundColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
                }
            }
        });*/


    }
}
