package com.example.niuxiaowei.dagger2sample.presenter;

import com.example.niuxiaowei.dagger2sample.data.UserData;

import javax.inject.Inject;

/**
 * Created by niuxiaowei on 16/3/20.
 */
public class MainPresenter {

    public UserData mUserData;
    private IUserView mUserView;

    @Inject
    public MainPresenter(UserData userData){
        this.mUserData = userData;
    }

    public void getUser(){
        this.mUserView.setUserName(this.mUserData.getUserName());
    }
    public void setUserView(IUserView userView){
        this.mUserView = userView;
    }

    public  interface IUserView{
        void setUserName(String name);
    }
}
