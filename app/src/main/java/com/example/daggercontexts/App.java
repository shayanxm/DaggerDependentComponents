package com.example.daggercontexts;

import android.app.Application;

import com.example.daggercontexts.di.AppComponent;
import com.example.daggercontexts.di.AppModule;
import com.example.daggercontexts.di.DaggerAppComponent;

public class App extends Application {
    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        this.appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
        appComponent.injectApp(this);


    }

    public AppComponent getAppComponent() {
        return appComponent;
    }


}
