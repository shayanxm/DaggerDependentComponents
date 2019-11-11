package com.example.daggercontexts.di;

import android.app.Application;

import com.example.daggercontexts.App;

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent {
    App injectApp(App app);
}
