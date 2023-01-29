package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.PartojBinding;


public class partojDeParolado extends AppCompatActivity {
     private PartojBinding binding;
    public static Intent newInstance(Context context) {
        return new Intent(context, partojDeParolado.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = PartojBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.textParto.setText("Члена неопределенного нет; есть только определенный (la), " +
                "одинаковый для всех родов, падежей и чисел. \n" +
                "Существительное всегда оканчивается на о. \n" +
                "Пример: patro, kato \n" +
                "Глагол по лицам и числам не изменяется (например: mi faras - я делаю, la patro faras - отец делает, ili faras - они делают). Формы глагола:\n" +
                "а) Настоящее время принимает окончание as (например: mi faras - я делаю).\n" +
                "b) Прошедшее - is (li faris - он делал).\n" +
                "с) Будущее - os (ili faros - они будут делать).\n" +
                "^c) Условное наклонение - us (^si farus - она бы делала).\n" +
                "d) Повелительное наклонение - u (faru - делай, делайте).\n" +
                "е) Неопределенное наклонение - i (fari - делать). \n" +
                "Наречия оканчиваются на е. \n" +
                "Прилагательное всегда оканчивается на а.");
        binding.tasko.setOnClickListener(view -> startActivity(FirstTasto.newInstance( this)));

    }
}
