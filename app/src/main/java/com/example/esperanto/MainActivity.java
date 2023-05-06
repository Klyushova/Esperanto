package com.example.esperanto;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        binding.word.setOnClickListener(view ->
                startActivity(
                        MenuActivity.newIntent(
                                this,
                                new ButtonTransition[]{
                                        new ButtonTransition("Grammar", ButtonTransition.Transition.MENU_GRAMMAR),
                                        new ButtonTransition("Word", ButtonTransition.Transition.MENU_WORD)
                                }
                        )/*MenuWord.newInstance( this))*/
                )
        );
        binding.textAndritten.setOnClickListener(view ->
                startActivity(Texti.newInstance(this)));
        binding.grammar.setOnClickListener(view ->
                startActivity(Grammari.newInstance(this)));
    }

}
