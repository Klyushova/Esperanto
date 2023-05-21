package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.ResultBinding;
import com.example.esperanto.databinding.TwoTastoBinding;

public class ResCopy extends AppCompatActivity {
    public SharedPreferences sharedPreferences;

    private ResultBinding binding;
    public static final String APP_PREFERENCES = "mysettings";
    private String[][] shared = {{"Семья", "FAM"}, {"Еда", "EATS"}, {"Животные", "ANIMAL"}, {"Цветы", "COLOR"}, {"Мебель", "DOMO"}, {"Школа", "SCHOOL"}, {"Глаголы", "GLAGOL"}, {"Погода", "POGODA"}, {"Одежда", "ODESHDA"}, {"Спорт", "SPORT"}, {"Развлечения", "RASCHVLECH"}, {"Город", "OBSCHESTV"}, {"Чуства", "HUMORO"}, {"Предлоги", "PREDL"}, {"Вопросительные слова", "VOPROSS"},
            {"Местоимения", "MESTOM"}, {"Числительные", "CHISL"}, {"Приставки", "PRISTV"}, {"Союзы", "COW"}, {"Суффиксы", "CYWW"}, {"Части речи", "PARTOY"}, {"La", "LA"}};

    public static Intent newInstance(Context context) {
        return new Intent(context, ResCopy.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        sharedPreferences = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        binding = ResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        sharedPreferences = getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE);
        Shared();
        Button nexti = (Button) findViewById(R.id.button);
        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void Shared(){
        for (int i =0; i<shared.length; i++){
            TextView text = new TextView(this);
            binding.result.addView(text);
             if (sharedPreferences.contains(shared[i][1])) {
                 text.setText(shared[i][0] + " " + sharedPreferences.getString(shared[i][1], ""));
             }
             else{
                 text.setText(shared[i][0] + " " + "0");
             }

        }

    }

}
