package com.example.daggercontexts.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
@Module
public class AppModule {
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }
    @Provides
    Application provideApplication(){
        return application;
    }
}
