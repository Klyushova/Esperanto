package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.GrammariMenuBinding;


public class Grammari extends AppCompatActivity {
    private  GrammariMenuBinding binding;
    public static String i;
    public static Intent newInstance(Context context) {
        return new Intent(context, Grammari.class);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = GrammariMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.chastiRechi.setOnClickListener(view ->{
                    i = TextGrammar.PARTOY;
                    startActivity(partojDeParolado.newInstance(this));
                }
                );
        binding.la.setOnClickListener(view ->{
                    i = TextGrammar.LA;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        binding.vopross.setOnClickListener(view ->{
                    i = TextGrammar.VOPROSS;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        binding.mestoim.setOnClickListener(view ->{
                    i = TextGrammar.MESTOIM;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        binding.predl.setOnClickListener(view ->{
                    i = TextGrammar.PREDL;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        binding.chisl.setOnClickListener(view ->{
                    i = TextGrammar.CHISL;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        binding.pristv.setOnClickListener(view ->{
                    i = TextGrammar.PRISTV;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        binding.cyww.setOnClickListener(view ->{
                    i = TextGrammar.CYWW;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        binding.cow.setOnClickListener(view ->{
                    i = TextGrammar.COW;
                    startActivity(partojDeParolado.newInstance(this));
                }
        );
        Button nexti =(Button)findViewById(R.id.button);

        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
    
}
