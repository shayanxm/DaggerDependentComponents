package com.example.daggercontexts.view;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.daggercontexts.R;
import com.example.daggercontexts.di.HasComponent;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {
    public interface Injector {
        MainFragment inject(MainFragment fragment);
    }


    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((HasComponent<Injector>) getActivity()).getCompi().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

}
