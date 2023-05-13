package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.RecicleMenuWordBinding;

public class wordOtobr extends AppCompatActivity {
    private RecicleMenuWordBinding binding;
    public static Intent newInstance(Context context) {
        return new Intent(context, wordOtobr.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RecicleMenuWordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}
