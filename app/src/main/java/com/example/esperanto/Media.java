package com.example.esperanto;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.esperanto.databinding.TextActivityBinding;

public class Media extends AppCompatActivity {
     private String j = Texti.ji;
    private String n = Texti.ni;
    MediaPlayer mp;
    private TextActivityBinding binding;
    public static Intent newInstance(Context context) {
        return new Intent(context, Media.class);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = TextActivityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.text.setText(j);
       int resID = getResources().getIdentifier(n, "raw", getPackageName());
        mp = MediaPlayer.create(this, resID);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                stopPlay();
            }
        });
        Button nexti = (Button) findViewById(R.id.button);
        nexti.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Texti.class);
                startActivity(intent);
                finish();
            }
        });
        binding.play.setOnClickListener(view -> play());
        binding.pause.setOnClickListener(view -> pause());
        binding.stop.setOnClickListener(view -> stop());

        binding.pause.setEnabled(false);
        binding.stop.setEnabled(false);
    }

        private void stopPlay(){
            mp.stop();
            binding.pause.setEnabled(false);
            binding.stop.setEnabled(false);
            try {
                mp.prepare();
                mp.seekTo(0);
                binding.play.setEnabled(true);
            }
            catch (Throwable t) {
                Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
        public void play(){
            mp.start();
            binding.play.setEnabled(false);
            binding.pause.setEnabled(true);
            binding.stop.setEnabled(true);
        }
        public void pause(){
            mp.pause();
            binding.play.setEnabled(true);
            binding.pause.setEnabled(false);
            binding.stop.setEnabled(true);
        }
        public void stop(){
            stopPlay();
        }
        @Override
        public void onDestroy() {
            super.onDestroy();
            if (mp.isPlaying()) {
                stopPlay();
            }
        }

}
