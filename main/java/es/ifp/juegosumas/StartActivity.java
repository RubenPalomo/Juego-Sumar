package es.ifp.juegosumas;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity {

    protected TextView label2;
    protected Button boton1;
    protected Button boton2;
    protected Button boton3;

    private MediaPlayer mp;

    private int num1;
    private int num2;
    private int res;
    private int lugarRes;

    public int random(){
        int random = (int) (Math.random() * ((10 + 1) - 1)) + 1;
        return random;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        label2 = (TextView) findViewById(R.id.label2_start);
        boton1 = (Button) findViewById(R.id.button1_start);
        boton2 = (Button) findViewById(R.id.button2_start);
        boton3 = (Button) findViewById(R.id.button3_start);

        num1 = random();
        num2 = random();

        label2.setText(num1 + " + " + num2);

        res = num1 + num2;

        lugarRes = (int) (Math.random() * ((3 + 1) - 1)) + 1;

        switch (lugarRes){
            case 1:
                boton1.setText("" + res);
                boton2.setText("" + (res+random()));
                boton3.setText("" + (res+random()));
                break;
            case 2:
                boton1.setText("" + (res+random()));
                boton2.setText("" + res);
                boton3.setText("" + (res+random()));
                break;
            case 3:
                boton1.setText("" + (res+random()));
                boton2.setText("" + (res+random()));
                boton3.setText("" + res);
                break;
        }

        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringBoton = boton1.getText().toString();
                int numeroBoton = Integer.parseInt(stringBoton);

                if(numeroBoton==res){
                    mp = MediaPlayer.create(StartActivity.this, R.raw.acierto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    Toast.makeText(StartActivity.this, "¡Has acertado!", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }

                else{
                    mp = MediaPlayer.create(StartActivity.this, R.raw.fallo);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();
                }
            }
        });

        boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringBoton = boton2.getText().toString();
                int numeroBoton = Integer.parseInt(stringBoton);

                if(numeroBoton==res){
                    mp = MediaPlayer.create(StartActivity.this, R.raw.acierto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    Toast.makeText(StartActivity.this, "¡Has acertado!", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }

                else{
                    mp = MediaPlayer.create(StartActivity.this, R.raw.fallo);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();
                }
            }
        });

        boton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String stringBoton = boton3.getText().toString();
                int numeroBoton = Integer.parseInt(stringBoton);

                if(numeroBoton==res){
                    mp = MediaPlayer.create(StartActivity.this, R.raw.acierto);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();
                    Toast.makeText(StartActivity.this, "¡Has acertado!", Toast.LENGTH_SHORT).show();
                    finish();
                    startActivity(getIntent());
                }

                else{
                    mp = MediaPlayer.create(StartActivity.this, R.raw.fallo);
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.stop();
                        }
                    });
                    mp.start();
                }
            }
        });
    }
}