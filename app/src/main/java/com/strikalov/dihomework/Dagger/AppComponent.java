package com.strikalov.dihomework.Dagger;

import com.strikalov.dihomework.DaggerActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void injectDaggerActivity(DaggerActivity daggerActivity);

}
