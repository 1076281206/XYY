package com.example.test.ui.login;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.test.R;

public class LogingFragment extends Fragment {

    private LogingViewModel mViewModel;

    public static LogingFragment newInstance() {
        return new LogingFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //View = inflater.inflate(R.id.loginFragment,container,false);
        return inflater.inflate(R.layout.loging_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(LogingViewModel.class);
        // TODO: Use the ViewModel

    }

}
