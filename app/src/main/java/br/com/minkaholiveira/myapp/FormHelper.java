package br.com.minkaholiveira.myapp;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.minkaholiveira.myapp.model.Aluno;

/**
 * Created by minkah on 15/04/17.
 */

public class FormHelper {
    private final EditText campoNome;
    private final EditText campoSobrenome;
    private final EditText campoEndereco;
    private final EditText campoSite;
    private final RatingBar campoNota;

    public FormHelper(FormActivity activity) {

        campoNome = (EditText) activity.findViewById(R.id.form_nome);
        campoSobrenome = (EditText) activity.findViewById(R.id.form_sobrenome);
        campoEndereco = (EditText) activity.findViewById(R.id.form_endereco);
        campoSite = (EditText) activity.findViewById(R.id.form_site);
        campoNota = (RatingBar) activity.findViewById(R.id.form_rating_bar);

    }
        public Aluno getAluno() {
        Aluno aluno = new Aluno();
        aluno.setNome(campoNome.getText().toString());
        aluno.setSobrenome(campoSobrenome.getText().toString());
        aluno.setEndereco(campoEndereco.getText().toString());
        aluno.setSite(campoSite.getText().toString());
        aluno.setNota(Double.valueOf(campoNota.getProgress()));

        return aluno;
        }
}
