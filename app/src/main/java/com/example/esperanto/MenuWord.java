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
    public String[][] WORD_NABOR;
    public static String[][] WORD;
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
            WORD_NABOR = Word_Nabor.fam.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.produkt.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.eatz.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.animals.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.animal.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.flowers.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.color.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.mebel.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.domo.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.shool.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.school.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.glagol.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.glagol.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.wether.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.pogoda.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.odet.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.odeshda.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.sport.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.sport.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.rathvlech.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.raschvlech.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.obschestvo.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.obschestv.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });
        binding.chyuka.setOnClickListener(view -> {
            WORD_NABOR = Word_Nabor.humoro.clone();
            WORD = WORD_NABOR;
            startActivity(wordOtobr.newInstance(this));
        });

    }
}
