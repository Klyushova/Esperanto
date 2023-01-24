package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.GrammariMenuBinding;


public class Grammari extends AppCompatActivity {
    private GrammariMenuBinding binding;

    public static Intent newInstance(Context context) {
        return new Intent(context, MenuWord.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GrammariMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}
