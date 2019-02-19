package com.example.aluno.opinibooks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Cadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar);
    }

    public void cadastrar(View view) {
        Intent intent = new Intent(this, Livros.class);
        startActivity(intent);
    }
}
