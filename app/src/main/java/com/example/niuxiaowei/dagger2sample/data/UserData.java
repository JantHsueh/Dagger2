package com.example.niuxiaowei.dagger2sample.data;

/**
 * Created by niuxiaowei on 16/3/22.
 */
public class UserData {


    public UserData() {

    }

    public String mUserName;

    public String getUserName() {
        mUserName =  "niu";

        return mUserName;
    }

    public void setUserName(String userName) {
        mUserName = userName;
    }
}
