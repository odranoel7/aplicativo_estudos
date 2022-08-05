package br.com.aplicativoestudos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        String msg = getIntent().getStringExtra("msg");
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();

        Button botaoAbrirSite = (Button)findViewById(R.id.btnAbrirUrl);
        botaoAbrirSite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText edtSite = findViewById(R.id.edtSite);
                Uri uri = Uri.parse(edtSite.getText().toString());
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


        Button botaoLigar = (Button) findViewById(R.id.btnLigar);
        botaoLigar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText tel = findViewById(R.id.edtLigar);
                Uri uri = Uri.parse("tel:"+tel.getText().toString());
                Intent intent = new Intent(Intent.ACTION_CALL, uri);
                startActivity(intent);
            }
        });

        Button botaoCamera = (Button) findViewById(R.id.btnCamera);
        botaoCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fotoIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivity(fotoIntent);
            }
        });
    }
}