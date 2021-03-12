package br.com.treinamento.radix.projetofinal.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import br.com.treinamento.radix.projetofinal.R;

public class BuscaUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_busca_usuario);

        startActivity(new Intent(BuscaUsuarioActivity.this,
                ListaRepositoryActivity.class));
    }
}