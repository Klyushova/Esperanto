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
    private String flag;
    public String fam[][] = {{"Familio", "Семья"},{"edzo", "муж"}, {"fianĉo", "жених"}, {"patro", "отец"},
            {"filo", "сын"}, {"frato", "брат"}, {"ĝemeloj", "близнецы"}, {"vicfrato", "сводный брат"},
            {"orfo", "сирота"}, {"duonpatro", "отчим"}, {"ino", "мачеха"}, {"аvo", "дед"}, {"nepo", "внук"}, {"onklo", "дядя"}, {"nevo", "племянник"},
            {"kuzo", "двоюродный брат"}, {"parenco", "родственник"}, {"vidvo", "вдовец"}};
    public static Intent newInstance(Context context) {
        return new Intent(context, wordOtobr.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RecicleMenuWordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.exesize.setOnClickListener(view -> {
            startActivity(WordTasto.newInstance(this));
        });
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
        list.add(new word("filo", "сын"));
        list.add(new word("frato", "брат"));
        list.add(new word("ĝemeloj", "близнецы"));
        list.add(new word("vicfrato", "сводный брат"));
        list.add(new word("orfo", "сирота"));
        list.add(new word("duonpatro", "отчим"));
        list.add(new word("ino", "мачеха"));
        list.add(new word("аvo", "дед"));
        list.add(new word("nepo", "внук"));
        list.add(new word("onklo", "дядя"));
        list.add(new word("nevo", "племянник"));
        list.add(new word("kuzo", "двоюродный брат"));
        list.add(new word("parenco", "родственник"));
        list.add(new word("vidvo", "вдовец"));


        return list;
    }
}
