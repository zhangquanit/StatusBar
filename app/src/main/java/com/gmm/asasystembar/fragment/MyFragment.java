package com.gmm.asasystembar.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gmm.asasystembar.R;
import com.gmm.asasystembar.systembar.SystemBar;

/**
 * @author 张全
 */
public class MyFragment extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = getLayoutInflater().inflate(R.layout.myfrag, null);
        View titlebar = view.findViewById(R.id.titlebar);

        SystemBar.clearSystemUiVisibility(getActivity().getWindow());
        SystemBar.from(getActivity())
                .setTransparentStatusBar(true)
                .setLightStatusBar(false)
                .setActionbarPadding(titlebar)
                .process();
        return view;
    }
}
