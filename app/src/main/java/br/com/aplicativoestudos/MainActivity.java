package br.com.aplicativoestudos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d ("categoria", "mensagem de debug");
        Log.i ("categoria", "mensagem de informação");
        Log.w ("categoria", "mensagem de aviso");
        Log.e ("categoria", "mensagem de erro");
        Log.d ("categoria", "mensagem de erro", new RuntimeException("erro"));
    }
}