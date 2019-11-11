package com.example.daggercontexts.di;

import com.example.daggercontexts.view.MainActivity;
import com.example.daggercontexts.view.MainFragment;

import dagger.Component;

@Component(dependencies = AppComponent.class,modules = ActivityModule.class
)
public interface ActivityComponent extends MainFragment.Injector {
    MainActivity injectActivity(MainActivity mainActivity);
}
