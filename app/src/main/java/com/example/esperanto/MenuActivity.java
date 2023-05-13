package com.example.esperanto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;

import com.example.esperanto.databinding.ActivityMenuBinding;
import com.example.esperanto.databinding.ItemButtonBinding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuActivity extends AppCompatActivity {
    private final static String ARG_BUTTONS = "ARG_BUTTONS";
    private final static String ARG_BUNDLE = "ARG_BUNDLE";

    private ActivityMenuBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        List<ButtonTransition> buttons = (ArrayList<ButtonTransition>) getIntent()
                .getBundleExtra(ARG_BUNDLE)
                .getSerializable(ARG_BUTTONS);
        addButtons(buttons);
    }

    private void addButtons(List<ButtonTransition> buttons) {
        for (ButtonTransition button : buttons) {
            ItemButtonBinding itemBinding = ItemButtonBinding.inflate(
                    getLayoutInflater(),
                    binding.getRoot(),
                    true
            );
            itemBinding.getRoot().setText(button.getName());
            itemBinding.getRoot().setOnClickListener(view -> {
                startActivity(button.getNextTransition().newIntent(this));
            });
        }
    }

    public static Intent newIntent(Context context, ButtonTransition[] buttons) {
        Intent intent = new Intent(context, MenuActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(ARG_BUTTONS, new ArrayList<>(Arrays.asList(buttons)));
        intent.putExtra(ARG_BUNDLE, bundle);
        return intent;
    }
}