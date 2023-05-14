package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.TexiMenuBinding;


public class Texti extends AppCompatActivity {
    public static String ji;
    public static String ni;
    private TexiMenuBinding binding;
    public String j, n;
    private String item;
    public static Intent newInstance(Context context) {

        return new Intent(context, Texti.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = TexiMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button nexti = (Button) findViewById(R.id.button);
        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        String[] text_numer = {"текст 1", "текст 2", "текст 3", "текст 4", "текст 5", "текст 6",
                "текст 7", "текст 8", "текст 9", "текст 10", "текст 11", "текст 12"};
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, text_numer);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                item = (String) parent.getItemAtPosition(position);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };
        binding.spinner.setOnItemSelectedListener(itemSelectedListener);
        binding.proda.setOnClickListener(view -> {
            Media media;
            switch (item) {
                case "текст 1":
                    j = Texti_Texti.T1;
                    n = "ti";
                    break;
                case "текст 2":
                    j = Texti_Texti.T2;
                    n = "ti2";
                    break;
                case "текст 3":
                    j = Texti_Texti.T3;
                    n = "ti3";
                    break;
                case "текст 4":
                    j = Texti_Texti.T4;
                    n = "ti4";
                    break;
                case "текст 5":
                    j = Texti_Texti.T5;
                    n = "ti5";
                    break;
                case "текст 6":
                    j = Texti_Texti.T6;
                    n = "ti6";
                    break;
                case "текст 7":
                    j = Texti_Texti.T7;
                    n = "ti7";
                    break;
                case "текст 8":
                    j = Texti_Texti.T8;
                    n = "ti8";
                    break;
                case "текст 9":
                    j = Texti_Texti.T9;
                    n = "ti9";
                    break;
                case "текст 10":
                    j = Texti_Texti.T10;
                    n = "ti10";
                    break;
                case "текст 11":
                    j = Texti_Texti.T11;
                    n = "ti11";
                    break;
                case "текст 12":
                    j = Texti_Texti.T12;
                    n = "ti12";
                    break;
            }
            ji = j;
            ni = n;

            startActivity(Media.newInstance(this));
        });

    }
}
