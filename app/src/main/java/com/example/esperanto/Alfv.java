package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.AlfavBinding;
import com.example.esperanto.databinding.TexiMenuBinding;

public class Alfv extends AppCompatActivity {
    private AlfavBinding binding;
    private String j = Texti.ji;
    public static Intent newInstance(Context context) {
        return new Intent(context, Alfv.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = AlfavBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button nexti = (Button) findViewById(R.id.button);
        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Texti.class);
                startActivity(intent);
                finish();
            }
        });
        binding.text.setText(j);

    }}
