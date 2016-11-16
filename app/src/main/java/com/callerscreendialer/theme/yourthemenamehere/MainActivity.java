package com.callerscreendialer.theme.yourthemenamehere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.callerscreendialer.themeclickevent.ApplyClickEvent;

public class MainActivity extends AppCompatActivity {

    Button Apply;
    TextView MAKE_YOUR_THEME;
    ApplyClickEvent applyClickEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Apply = (Button)findViewById(R.id.GoToCSD);
        MAKE_YOUR_THEME = (TextView)findViewById(R.id.make_theme);
        applyClickEvent = new ApplyClickEvent(); // Must Use this class for perform Apply button and Make Theme Click Events

        Apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                applyClickEvent.ApplyClickEvent_Function(MainActivity.this);

            }
        });

        MAKE_YOUR_THEME.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                applyClickEvent.MakeYourTheme_Function(MainActivity.this);

            }
        });
    }
}
