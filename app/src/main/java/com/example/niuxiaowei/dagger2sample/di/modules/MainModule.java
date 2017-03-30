package com.example.niuxiaowei.dagger2sample.di.modules;

import com.example.niuxiaowei.dagger2sample.data.UserData;

import dagger.Module;
import dagger.Provides;

/**
 * Created by niuxiaowei on 16/3/20.
 */

@Module
public class MainModule {


    @Provides
    public UserData provideUserData(){
        return new UserData();
    }


}
