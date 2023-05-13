package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.esperanto.databinding.PartojBinding;


public class partojDeParolado extends Grammari {
     private PartojBinding binding;
    public static Intent newInstance(Context context) {

        return new Intent(context, partojDeParolado.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = PartojBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
            binding.textParto.setText(i);

            binding.tasko.setOnClickListener(view ->{
            if(i == TextGrammar.LA || i == TextGrammar.PARTOY){
            startActivity(FirstTasto.newInstance(this)); }
            else{
                startActivity(TwoTasto.newInstance(this));
            }
        });

    }
}
