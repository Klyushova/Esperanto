package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esperanto.databinding.RecicleMenuWordBinding;
import com.example.esperanto.databinding.TwoTastoBinding;

import java.util.ArrayList;

public class WordTasto extends AppCompatActivity {
    private TwoTastoBinding binding;
    public static Intent newInstance(Context context) {
        return new Intent(context, WordTasto.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = TwoTastoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }

}
