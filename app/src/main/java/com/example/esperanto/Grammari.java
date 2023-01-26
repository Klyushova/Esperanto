package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.GliBinding;


public class Grammari extends AppCompatActivity {
    private GliBinding binding;

    public static Intent newInstance(Context context) {
        return new Intent(context, MenuWord.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GliBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.getRoot().setOnClickListener(v -> finish());
        setContentView(binding.getRoot());


    }
    
}
