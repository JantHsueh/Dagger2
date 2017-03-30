package com.example.niuxiaowei.dagger2sample.view;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.niuxiaowei.dagger2sample.App;
import com.example.niuxiaowei.dagger2sample.R;
import com.example.niuxiaowei.dagger2sample.ToastUtil;
import com.example.niuxiaowei.dagger2sample.di.components.DaggerMainComponent;
import com.example.niuxiaowei.dagger2sample.di.components.MainComponent;
import com.example.niuxiaowei.dagger2sample.di.modules.MainModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener{

    private MainComponent mMainComponent;

    @Inject
    ToastUtil toastUtil;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMainComponent = DaggerMainComponent.builder().appComponent(((App)getApplication()).getAppComponent())
                .mainModule(new MainModule())
                .build();
//        mMainComponent.inject(this);
    }

    public MainComponent getMainComponent(){
        return mMainComponent;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
