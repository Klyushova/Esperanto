package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esperanto.databinding.RecicleMenuWordBinding;

import java.util.ArrayList;

public class wordOtobr extends AppCompatActivity {
    private RecicleMenuWordBinding binding;
    private RecyclerView wordes;
    private RecyclerView.Adapter adapter;
    public static Intent newInstance(Context context) {
        return new Intent(context, wordOtobr.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RecicleMenuWordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<word> worldi = Wordi();
        this.wordes = (RecyclerView) findViewById(R.id.word);
            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
            this.wordes.setLayoutManager(mLayoutManager);

            adapter = new Adapter(worldi);
            this.wordes.setAdapter(adapter);
        }

    private ArrayList<word> Wordi() {
        ArrayList<word> list = new ArrayList<>();

        list.add(new word("Familio", "Семья"));
        list.add(new word("edzo", "муж"));
        list.add(new word("fianĉo", "жених"));
        list.add(new word("patro", "отец"));

        return list;
    }
}
