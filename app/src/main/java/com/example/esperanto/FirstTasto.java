package com.example.esperanto;

import static java.lang.String.valueOf;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.FirstTastoBinding;

import java.util.Random;

public class FirstTasto extends AppCompatActivity {
    private FirstTastoBinding binding;
    private String randomC[] = {"patro", "bovo", "koko", "kokoj", "studentoj"};
    private String randomG[] = {"iris", "ami", "estos", "volas", "vivi"};
    private String randomN[] = {"ofte", "sole", "zorgeme", "rapide", "tre"};
    private String randomP[] = {"griza", "longa", "alta", "ronda", "amara"};

   private int randompatro;
   private int t = 0;
    public static Intent newInstance(Context context) {
        return new Intent(context, FirstTasto.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FirstTastoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        TastojPartoj();
        binding.glag.setOnClickListener(view -> {
            if(t == 0) TastojPartoj();
            else{
               if(randompatro == 1) binding.pravanswer.setText("Верно");
               else binding.pravanswer.setText("Неверно");
               TastojPartoj();}
        });
        binding.cuch.setOnClickListener(view -> {
            if(t == 0) TastojPartoj();
            else{
                if(randompatro == 2) binding.pravanswer.setText("Верно");
                else binding.pravanswer.setText("Неверно");
                TastojPartoj();}
        });
        binding.pril.setOnClickListener(view -> {
            if(t == 0) TastojPartoj();
            else{
                if(randompatro == 3) binding.pravanswer.setText("Верно");
                else binding.pravanswer.setText("Неверно");
                TastojPartoj();}
        });
        binding.nar.setOnClickListener(view -> {
            if(t == 0) TastojPartoj();
            else{
                if(randompatro == 4) binding.pravanswer.setText("Верно");
                else binding.pravanswer.setText("Неверно");
                TastojPartoj();}
        });
    }
    private void TastojPartoj(){
        t = 1;
        Random random = new Random();
        randompatro = random.nextInt(4 - 1) + 1;
            int randomWord = random.nextInt(4 - 0) + 0;
            switch (randompatro){
                case 1:
                    binding.answertasto.setText( valueOf(randomG[randomWord]));
                    break;
                case 2:
                    binding.answertasto.setText( valueOf(randomC[randomWord]));
                    break;
                case 3:
                    binding.answertasto.setText( valueOf(randomP[randomWord]));
                    break;
                default:
                    binding.answertasto.setText( valueOf(randomN[randomWord]));
                    break;
            }



    }

}
