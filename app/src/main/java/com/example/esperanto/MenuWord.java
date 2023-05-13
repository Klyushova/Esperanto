package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.MenuWordBinding;

public class MenuWord extends AppCompatActivity {
    private MenuWordBinding binding;
    public static Intent newInstance(Context context) {
        return new Intent(context, MenuWord.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = MenuWordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button nexti = (Button) findViewById(R.id.button);
        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        binding.fam.setOnClickListener(view -> {
            startActivity(wordOtobr.newInstance(this));
        });

    }
    }
