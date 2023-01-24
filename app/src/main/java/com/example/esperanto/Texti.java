package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.TexiMenuBinding;


public class Texti extends AppCompatActivity {
    private TexiMenuBinding binding;

    public static Intent newInstance(Context context) {
        return new Intent(context, MenuWord.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = TexiMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}