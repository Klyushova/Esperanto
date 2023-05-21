package com.example.esperanto;

import static java.lang.String.valueOf;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.TwoTastoBinding;

import java.util.Random;

public class WordTasto extends AppCompatActivity {
    private TwoTastoBinding binding;
    private String[][] CopyArr = MenuWord.WORD.clone();
    private String answerVo;
    private int TrueResult;
    private int t = 0;
    private int nu
    private String[][] shared = {{"Семья", "0"}, {"Еда", "0"}, {"Животные", "0"}, {"Цветы", "0"}, {"Мебель", "0"}, {"Школа", "0"}, {"Глаголы", "0"}, {"Погода", "0"},
            {"Одежда", "0"}, {"Спорт", "0"}, {"Развлечения", "0"}, {"Город", "0"}, {"Чуства", "0"}};
    private static String SHARE = MenuWord.SHARE;
    public static final String APP_PREFERENCES = "mysettings";
    public SharedPreferences sharedPreferences;

    public static Intent newInstance(Context context) {
        return new Intent(context, WordTasto.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        binding = TwoTastoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.vopross.setText("Напишите перевод слова на эсперанто");
        Button nexti = (Button) findViewById(R.id.button);
        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), wordOtobr.class);
                startActivity(intent);
                finish();
            }
        });
        Random();
        Tasto();

    }
    private void Random(){
        t +=1;
        if (t > 10){
            ResCopy.Ret(SHARE, TrueResult);
            binding.lm.setVisibility(View.GONE);
            binding.answertasto.setText("Урок пройден");}
        else{
        Random random = new Random();
        int randomWord = random.nextInt(19 - 0) + 0;
        binding.answertasto.setText(valueOf(CopyArr[randomWord][1]));
        answerVo = CopyArr[randomWord][0];
    }
}
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
