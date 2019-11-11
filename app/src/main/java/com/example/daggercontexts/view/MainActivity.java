package com.example.daggercontexts.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.daggercontexts.App;
import com.example.daggercontexts.R;
import com.example.daggercontexts.di.ActivityComponent;
import com.example.daggercontexts.di.ActivityModule;
import com.example.daggercontexts.di.DaggerActivityComponent;
import com.example.daggercontexts.di.HasComponent;

public class MainActivity extends AppCompatActivity implements HasComponent<ActivityComponent> {
private ActivityComponent activityComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
this.activityComponent= DaggerActivityComponent.builder()
       // .appComponent(getApplication().getCo
        .activityModule(new ActivityModule(this))
        .build();
activityComponent.injectActivity(this);
        setContentView(R.layout.activity_main);
    }


    @Override
    public ActivityComponent getCompi() {
        return null;
    }
}
