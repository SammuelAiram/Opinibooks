package com.example.aluno.opinibooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Entrar extends AppCompatActivity {
EditText Login;
EditText Senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrar);
        Login = findViewById(R.id.login);
        Senha = findViewById(R.id.senha);

    }

    public void conectar(View view) {
        String login = Login.getText().toString();
        String senha = Senha.getText().toString();
        String msg = "";

        if (login.equals("sammuel") && senha.equals("sammuel")){
            Intent intent = new Intent(this, Livros.class);
            startActivity(intent);
        }else{
            int duracao = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(getApplicationContext(), "Login e/ou senha invalidas!", duracao);
            toast.show();
        }

    }
}
