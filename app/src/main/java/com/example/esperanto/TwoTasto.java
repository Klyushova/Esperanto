package com.example.esperanto;

import static java.lang.String.valueOf;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.example.esperanto.databinding.TwoTastoBinding;

import java.util.Random;

public class TwoTasto extends  Grammari{
    public TwoTastoBinding binding;
    private String answerVo;
    private int t = 0;
    private int TrueResult = 0;
    private int j  = 0;

    private String Vopross[][] = {{"_ li estas?", "Kie"}, {"_ estas ĉi tio?", "Kio"}, {"_ vi estas malgaja?", "Kial"},
            {"_ vi deziras ludi?", "Kiel"}, {"_ vi povas helpi min?", "ĉu"}, {"_ kostas ĉi tio?", "Kiom"},
            {"_ vi loĝas?", "Kie"}, {"_ horo estas?", "Kioma"}, {"_ vi havas mian libron?", "ĉu"}, {"_ granda ĝi estas?", "kiel"}};
    private String Mest[][]= {{"я", "mi"}, {"ты", "vi"}, {"ты", "вы"}, {"она", "ŝi"}, {"они", "ili"},
            {"их", "ilia"}, {"наш", "nia"}, {"его", "lia"}, {"мой", "mia"}, {"он", "li"}, {"мы", "ni"}};

    private String Chisl[][] = {{"1", "unu"}, {"2", "du"}, {"5", "kvin"}, {"10", "dek"}, {"13", "dek tri"}, {"20", "dudek"},
            {"100", "cent"}, {"123", "cent dudek tri"}, {"801", "okcent unu"}, {"6000", "ses mil"}};

    private String Pristv[][] = {{"foriti", "for"}, {"kunlabori", "kun"}, {"transsalti", "trans"}, {"sendoma", "sen"}, {"aliri", "al"},
            {"eliri", "el"}, {"internacia", "inter"}, {"priskribi", "pri"}, {"subtera", "sub"}, {"travivi", "tra"}};

    private String Cyww[][] = {{"kuracisto", "ist"}, {"tranĉilo", "il"}, {"katino", "in"}, {"bovido", "id"}, {"dormema", "em"},
            {"duono", "on"}, {"urbestro", "estro"}, {"blankigi", "ig"}, {"beleco", "ec"}, {"pluvego", "eg"}};

    private String Cow[][]= {{"и", "kaj"}, {"ни", "nek"}, {"потому что", "ĉar"}, {"но", "sed"}, {"если", "se"},
            {"ибо", "ĉar"}, {"хотя", "kvankam"}, {"чем", "ol"}, {"или", "aŭ"}, {"что", "ke"}};

    private String Predl[] = {"sub", "inter", "en", "ekster", "apud", "antau", "al", "kun", "dum", "el"};
    private String Osnov[][] = null;
    SharedPreferences sharedPreferences;

    private static final String PREDLOG = "PREDL";
    private static final String VOPROS = "VOPROSS";
    private static final String MEST = "MESTOM";
    private static final String CHISLIT = "CHISL";
    private static final String PRISTAV = "PRISTV";
    private static final String COWW = "COW";
    private static final String CYW = "CYWW";
    private static String SHARE = "";
    public static final String APP_PREFERENCES = "mysettings";
    public static Intent newInstance(Context context) {
        return new Intent(context, TwoTasto.class);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        sharedPreferences = getSharedPreferences(APP_PREFERENCES, Context.MODE_PRIVATE);
        super.onCreate(savedInstanceState);
        binding = TwoTastoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if(i == TextGrammar.PREDL){
            SHARE = PREDLOG;
            Pred();
            Nopred();
        }

        else{
            if(i == TextGrammar.VOPROSS){
                SHARE = VOPROS;
                Osnov = Vopross.clone();
            }
            else if(i == TextGrammar.MESTOIM){
                SHARE = MEST;
                Osnov = Mest.clone();
            }
            else if(i == TextGrammar.CHISL){
                SHARE = CHISLIT;
                Osnov = Chisl.clone();

            }
            else if(i == TextGrammar.PRISTV){
                SHARE =PRISTAV;
                Osnov = Pristv.clone();

            }
            else if (i == TextGrammar.COW){
                SHARE = COWW;
                Osnov = Cow.clone();

            }
            else if(i == TextGrammar.CYWW){
                SHARE = CYW;
                Osnov = Cyww.clone();

            }
            TascoVopr();
            Vopro();


        }}
    private  void TascoVopr(){
        t +=1;
        if (t > 10){
            if (sharedPreferences.contains(SHARE)) {
                String resultititi = sharedPreferences.getString(SHARE,"");
                if(TrueResult > Integer.parseInt(resultititi)){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(SHARE, String.valueOf(TrueResult));
                    editor.apply();
                }
            }
            else {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(SHARE, String.valueOf(TrueResult));
                editor.apply();
            }
            binding.result.setText(sharedPreferences.getString(SHARE, ""));
            binding.lm.setVisibility(View.GONE);
            binding.vopross.setText("Урок пройден");
        }
        else {
            Random random = new Random();
            int randomWord = random.nextInt(9 - 0) + 0;
            binding.answertasto.setText(valueOf(Osnov[randomWord][0]));
            answerVo = Osnov[randomWord][1];
        }
    }

    private void Vopro(){
        binding.bt.setOnClickListener(view -> {
            String editi = binding.edit.getText().toString();
            if(editi.equals(answerVo)){
                TrueResult += 1;
                binding.result.setText("" + TrueResult + "/ 10");
            }
            binding.edit.getText().clear();
            TascoVopr();
        });
    }
    private void Pred(){
        int resID = getResources().getIdentifier(Predl[j], "drawable", getPackageName());
        binding.image.setImageResource(resID);
        binding.bt.setOnClickListener(view -> {
            String editi = binding.edit.getText().toString();
            if(editi.equals(answerVo)){
                TrueResult += 1;
                binding.result.setText("" + TrueResult + "/ 10");

            }
            binding.edit.getText().clear();
            Nopred();
        });
    }
    private void Nopred(){
        t ++;
        if (j > 8){
            if (sharedPreferences.contains(SHARE)) {
                String resultititi = sharedPreferences.getString(SHARE,"");
                if(TrueResult > Integer.parseInt(resultititi)){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(SHARE, String.valueOf(TrueResult));
                    editor.apply();
                }
            }
            else {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(SHARE, String.valueOf(TrueResult));
                editor.apply();
            }
            binding.lm.setVisibility(View.GONE);
            binding.answertasto.setText("Урок пройден");
        }
        else{
            j ++;
            Pred();
        }
    }

}