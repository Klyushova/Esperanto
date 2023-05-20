package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.esperanto.databinding.RecicleMenuWordBinding;

import java.util.ArrayList;

public class wordOtobr extends AppCompatActivity {
    private Context context;
    private RecicleMenuWordBinding binding;
    private RecyclerView wordes;
    private RecyclerView.Adapter adapter;
    private String flag;
    private String[][] OtobrNabor = MenuWord.WORD.clone();

    public static Intent newInstance(Context context) {
        return new Intent(context, wordOtobr.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = RecicleMenuWordBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button nexti = (Button) findViewById(R.id.button);
        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuWord.class);
                startActivity(intent);
                finish();
            }
        });
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

        list.add(new word(OtobrNabor[0][0], OtobrNabor[0][1]));
        list.add(new word(OtobrNabor[1][0], OtobrNabor[1][1]));
        list.add(new word(OtobrNabor[2][0], OtobrNabor[2][1]));
        list.add(new word(OtobrNabor[3][0], OtobrNabor[3][1]));
        list.add(new word(OtobrNabor[4][0], OtobrNabor[4][1]));
        list.add(new word(OtobrNabor[5][0], OtobrNabor[5][1]));
        list.add(new word(OtobrNabor[6][0], OtobrNabor[6][1]));
        list.add(new word(OtobrNabor[8][0], OtobrNabor[7][1]));
        list.add(new word(OtobrNabor[9][0], OtobrNabor[9][1]));
        list.add(new word(OtobrNabor[10][0], OtobrNabor[10][1]));
        list.add(new word(OtobrNabor[11][0], OtobrNabor[11][1]));
        list.add(new word(OtobrNabor[12][0], OtobrNabor[12][1]));
        list.add(new word(OtobrNabor[13][0], OtobrNabor[13][1]));
        list.add(new word(OtobrNabor[14][0], OtobrNabor[14][1]));
        list.add(new word(OtobrNabor[15][0], OtobrNabor[15][1]));
        list.add(new word(OtobrNabor[16][0], OtobrNabor[16][1]));
        list.add(new word(OtobrNabor[17][0], OtobrNabor[17][1]));
        list.add(new word(OtobrNabor[18][0], OtobrNabor[18][1]));
        list.add(new word(OtobrNabor[19][0], OtobrNabor[19][1]));
        return list;
    }

}
