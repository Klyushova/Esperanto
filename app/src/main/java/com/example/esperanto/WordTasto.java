package com.example.esperanto;

import static java.lang.String.valueOf;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.TwoTastoBinding;

import java.util.Random;

public class WordTasto extends AppCompatActivity {
    private TwoTastoBinding binding;
    private String[][] CopyArr = MenuWord.WORD.clone();
    private String answerVo;
    private int TrueResult;
    private int t = 0;

    private static String SHARE = MenuWord.SHARE;
    public static final String APP_PREFERENCES = "mysettings";

    public static Intent newInstance(Context context) {
        return new Intent(context, WordTasto.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = TwoTastoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Random();
        Tasto();

    }
    private void Random(){
        t +=1;
        if (t > 10){
            binding.lm.setVisibility(View.GONE);
            binding.vopross.setText("Урок пройден");
        }
        else{
        Random random = new Random();
        int randomWord = random.nextInt(19 - 0) + 0;
        binding.answertasto.setText(valueOf(CopyArr[randomWord][1]));
        answerVo = CopyArr[randomWord][0];
    }}
    private void Tasto(){
        binding.bt.setOnClickListener(view -> {
            String editi = binding.edit.getText().toString();
            if(editi.equals(answerVo)){
                TrueResult += 1;
                binding.result.setText("" + TrueResult + "/ 10");
            }
            binding.edit.getText().clear();
            Random();
        });
    }

}
