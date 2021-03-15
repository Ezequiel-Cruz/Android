package br.com.treinamento.radix.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import br.com.treinamento.radix.agenda.R;
import br.com.treinamento.radix.agenda.dao.AlunoDAO;
import br.com.treinamento.radix.agenda.model.Aluno;

public class ListaAlunosActivity extends AppCompatActivity {
    public static final String TITULO_APPBAR = "Lista de Alunos";
    private final AlunoDAO dao = new AlunoDAO();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        setTitle(TITULO_APPBAR);
        configuraFabNovoAluno();
        dao.salva(new Aluno("Ezequiel","999999999", "adm@adm.com"));
        dao.salva(new Aluno("Julio","999999999", "adm@adm.com"));
        dao.salva(new Aluno("Julia","999999999", "adm@adm.com"));
    }

    private void configuraFabNovoAluno() {
        FloatingActionButton botaoNovaAluno = findViewById(R.id.activity_lista_aluno_novo);
        botaoNovaAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abreFormularioAlunoActivity();
            }
        });
    }

    private void abreFormularioAlunoActivity() {
        startActivity(new Intent(this, FormularioAlunoActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        configuraLista();
    }

    private void configuraLista() {
        ListView listaDeAlunos = findViewById(R.id.activity_lista_alunos_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.todos()));

        listaDeAlunos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicao, long id) {
                Log.i("posicaoAluno" , "" + posicao);
            }
        });
    }
}