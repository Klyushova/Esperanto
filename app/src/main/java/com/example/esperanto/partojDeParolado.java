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
        if (i == "chastiRechi") {
            binding.textParto.setText(TextGrammar.PARTOY);
        }
        else if (i == "la") {
            binding.textParto.setText(TextGrammar.LA);
        }
        else if (i == "vopross"){
            binding.textParto.setText(TextGrammar.VOPROSS);
            }
        else if (i == "mestoim") {
            binding.textParto.setText(TextGrammar.MESTOIM);
        }
        else if (i == "predl") {
            binding.textParto.setText(TextGrammar.PREDL);
        }
        else if (i == "chisl") {
            binding.textParto.setText(TextGrammar.CHISL);
        }
        else if (i == "pristv") {
            binding.textParto.setText(TextGrammar.PRISTV);
        }
        else if (i == "cyww") {
            binding.textParto.setText(TextGrammar.CYWW);
        }
        else if (i == "cow") {
            binding.textParto.setText(TextGrammar.COW);
        }



        binding.tasko.setOnClickListener(view -> {
            if (i == "chastiRechi" || i == "la"){
            startActivity(FirstTasto.newInstance(this));}
            else{
                startActivity(TwoTasto.newInstance(this));}

        });

    }
}
