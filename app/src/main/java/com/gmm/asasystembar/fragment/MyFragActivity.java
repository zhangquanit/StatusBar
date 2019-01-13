package com.gmm.asasystembar.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.gmm.asasystembar.R;

/**
 * @author 张全
 */
public class MyFragActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity);


        addFragment(MyFragment.class, R.id.contentbar, null);
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(MyFragment.class, R.id.contentbar, null);
            }
        });
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFragment(MyFragment2.class, R.id.contentbar, null);
            }
        });
    }

    @SuppressWarnings("unchecked")
    protected <T> T addFragment(Class<T> cls, int id, Bundle args) {
        T fragment = (T) Fragment.instantiate(this, cls.getName(), args);
        ((Fragment) fragment).setArguments(args);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(id, (Fragment) fragment);
        ft.commitAllowingStateLoss();
        return fragment;
    }

    protected void addFragment(Fragment fragment, int id) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(id, fragment);
        ft.commitAllowingStateLoss();
    }
}
