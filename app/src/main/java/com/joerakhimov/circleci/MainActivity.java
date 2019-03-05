package com.joerakhimov.circleci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppCenter.start(getApplication(), "2a526a94-34b6-431d-a49d-0da1728060f1",
                Analytics.class, Crashes.class);

    }

}
