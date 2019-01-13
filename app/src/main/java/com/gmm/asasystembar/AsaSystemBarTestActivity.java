package com.gmm.asasystembar;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gmm.asasystembar.systembar.AsaSystemBar;

public class AsaSystemBarTestActivity extends AppCompatActivity {
    private View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_status_bar_test);
        view = findViewById(R.id.titlebar);

        //4.4.4
/*        AsaSystemBar.from(this)
                .setTransparentStatusBar(true) //4.4-5.0
                .process();*/
        //5.0
        /*AsaSystemBar.from(this)
                .setTransparentStatusBar(true) //4.4-5.0
                .setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccent)) //5.0之后
                .process();*/
        //6.0
//        AsaSystemBar.from(this)
//                .setTransparentStatusBar(true) //4.4-5.0
//                .setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccent)) //5.0之后
//                .setLightStatusBar(true) //6.0之后，改变状态栏图标颜色为黑色，这个效果对于沉浸式背景色为白色的页面是很有用的
//                .process();


//        AsaSystemBar.from(this)
//                .setStatusBarColor(ContextCompat.getColor(this, android.R.color.transparent))
//                 /*
//                   setActionbarView+setActionbarPadding 设置setActionbarView的paddingTop为状态栏高度
//                   或者在xml中设置fitsSystemWindows属性为处，或者设置marginTop
//                  */
//                .setActionbarView(view)
//                .setActionbarPadding(true)
//                .process();

        AsaSystemBar.from(this)
                .setTransparentStatusBar(true)
                .setStatusBarColor(ContextCompat.getColor(this, R.color.colorAccent))
                //或者在xml中设置fitsSystemWindows属性为处，或者设置marginTop
                .setActionbarView(view)
                .setActionbarPadding(true)
                .process();


//        AsaSystemBar.from(this)
//                .setTransparentStatusBar(true)
//                /*
//                 * 添加状态栏，并设置状态栏背景图片或颜色
//                 * 目前来看，相当于设置状态栏背景的作用
//                 */
//                .addStatusBarView(true)
//                .setStatusBarDrawable(getResources().getDrawable(R.mipmap.ic_launcher))
//                .process();

    }
}
