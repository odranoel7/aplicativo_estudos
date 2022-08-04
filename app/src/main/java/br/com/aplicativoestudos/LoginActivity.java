package br.com.aplicativoestudos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText edtLogin123 = findViewById(R.id.edtLogin);
        final EditText edtSenha123 = findViewById(R.id.edtSenha);

        Button btnLogar = findViewById(R.id.btnAutenticar);

        btnLogar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Login digitado: "+edtLogin123.getText(), Toast.LENGTH_LONG).show();


                Snackbar.make(findViewById(R.id.activity_login),
                        "Senha digitada: "+edtSenha123.getText(),
                        Snackbar.LENGTH_LONG).setAction("Ação", new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Snackbar.make(findViewById(R.id.activity_login), "acao desfeita", Snackbar.LENGTH_SHORT)
                                .show();
                            }
                        })
                        .show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_pesquisar:
                Toast.makeText(this, "pesquisar", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_settings:
                Toast.makeText(this, "cnfiguracoes", Toast.LENGTH_SHORT).show();
                break;

            case R.id.action_sair:
                finish();
                break;
        }
        return true;
    }
}