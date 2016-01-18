package com.gah.widget.horvoiceview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private HorVoiceView voiceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        voiceView = (HorVoiceView) findViewById(R.id.horvoiceview);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    voiceView.addElement((int)Math.round(Math.random() * 100 + 1));
			        try {
				        Thread.sleep(100);
			        } catch (InterruptedException e) {
				        e.printStackTrace();
			        }
			      }
            }
        }).start();

    }
}
