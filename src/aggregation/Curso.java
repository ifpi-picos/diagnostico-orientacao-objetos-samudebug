package aggregation;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    List<Disciplina> disciplinas;

    public Curso() {
        this.disciplinas = new ArrayList<>();
    }

    public void removeDisciplina(int ch) {
        Disciplina toDelete = disciplinas.stream().filter(disciplina -> ch == disciplina.getCh()).findAny().orElse(null);
        if (toDelete != null) {
            disciplinas.remove(toDelete);
        }
    }

    public void adicionaDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
