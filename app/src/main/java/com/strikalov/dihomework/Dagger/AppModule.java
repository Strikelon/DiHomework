package com.strikalov.dihomework.Dagger;

import com.strikalov.dihomework.common.Green;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    @Singleton
    public Green provideGreen(){
        return new Green();
    }

}
