package com.example.esperanto;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.esperanto.databinding.FragmentBinding;

public class FragmentREs extends androidx.fragment.app.Fragment {
    private FragmentBinding binding;
    public FragmentREs(){
        super(R.layout.fragment);
    }
    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        binding = FragmentBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


}
