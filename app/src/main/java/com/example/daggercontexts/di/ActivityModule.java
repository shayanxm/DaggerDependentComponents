package com.example.daggercontexts.di;

import android.app.Activity;

import androidx.swiperefreshlayout.widget.CircularProgressDrawable;

import dagger.Module;
import dagger.Provides;
@Module
public class ActivityModule {
    private Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }
@Provides
    Activity provideActivity(){
        return activity;
}
}
