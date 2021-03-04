package br.com.treinamento.radix.agenda;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView aluno = new TextView(this);
        aluno.setText("Ezequiel T. Cruz");
        setContentView(aluno);
    }
}