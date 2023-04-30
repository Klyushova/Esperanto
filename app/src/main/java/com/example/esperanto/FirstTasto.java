package com.example.esperanto;

import static java.lang.String.valueOf;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.example.esperanto.databinding.FirstTastoBinding;

import java.util.Random;

public class FirstTasto extends Grammari {
    private int TrueResult = 0;
    private FirstTastoBinding binding;
    private String randomC[] = {"patro", "bovo", "koko", "kokoj", "studentoj"};
    private String randomG[] = {"iris", "ami", "estos", "volas", "vivi"};
    private String randomN[] = {"ofte", "sole", "zorgeme", "rapide", "tre"};
    private String randomP[] = {"griza", "longa", "alta", "ronda", "amara"};
    private LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);
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
        if (i == "chastiRechi"){
            TastojPartoj();
            onChastiR();
        }


    }
    private void TastojPartoj(){
        t +=1;
        if (t > 10){
            binding.lB.setVisibility(View.GONE);
            binding.answertasto.setText("Урок пройден");


        }
        else {
            Random random = new Random();
            randompatro = random.nextInt(4 - 1) + 1;
            int randomWord = random.nextInt(4 - 0) + 0;
            switch (randompatro) {
                case 1:
                    binding.answertasto.setText(valueOf(randomG[randomWord]));
                    break;
                case 2:
                    binding.answertasto.setText(valueOf(randomC[randomWord]));
                    break;
                case 3:
                    binding.answertasto.setText(valueOf(randomP[randomWord]));
                    break;
                default:
                    binding.answertasto.setText(valueOf(randomN[randomWord]));
                    break;
            }

        }

    }
    public void onChastiR(){
        Button button = new Button(this);
        button.setText("глагол");
        Button buttonN = new Button(this);
        buttonN.setText("наречие");
        Button buttonP = new Button(this);
        buttonP.setText("прилагательное");
        Button buttonC = new Button(this);
        buttonC.setText("существительное");
        LinearLayout ll = (LinearLayout)findViewById(R.id.lB);
        ll.addView(button, params);
        ll.addView(buttonC, params);
        ll.addView(buttonN, params);
        ll.addView(buttonP, params);

        button.setOnClickListener(view -> {
            if(randompatro == 1) {
                    TrueResult += 1;
                    binding.result.setText("" + TrueResult + "/ 10");
                }
            TastojPartoj();
        });
        buttonC.setOnClickListener(view -> {
            if(randompatro == 2) {
                TrueResult += 1;
                binding.result.setText("" + TrueResult + "/ 10");
            }
            TastojPartoj();
        });
        buttonN.setOnClickListener(view -> {
            if(randompatro == 3) {
                TrueResult += 1;
                binding.result.setText("" + TrueResult + "/ 10");
            }
            TastojPartoj();
        });

        buttonP.setOnClickListener(view -> {
            if(randompatro == 4) {
                TrueResult += 1;
                binding.result.setText("" + TrueResult + "/ 10");
            }
            TastojPartoj();
        });
    }

}
