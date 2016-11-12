package com.callerscreendialer.theme.yourthemenamehere;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button GoToCSD;
    String CSD_PACKAGE_NAME = "com.ios.caller.screen.sprite.coc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoToCSD = (Button)findViewById(R.id.GoToCSD);

        GoToCSD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Intent intent = new Intent();
                    intent.setComponent(new ComponentName(CSD_PACKAGE_NAME,"com.ios.caller.screen.sprite.coc.Theme"));
                    startActivity(intent);
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,"Caller Screen Dialer is Not Installed",Toast.LENGTH_SHORT).show();
                    Uri uriw = Uri.parse("market://details?id=" + CSD_PACKAGE_NAME);
                    Intent goToMarket = new Intent(Intent.ACTION_VIEW, uriw);
                    startActivity(goToMarket);
                }
            }
        });
    }
}
