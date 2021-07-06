package inheritance;

import java.util.List;

public abstract class Funcionario {

    private String nome;
    private double salario;
    protected List<String> beneficios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    protected double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    protected void setBeneficios(List<String> beneficios) {
        this.beneficios = beneficios;
    }



    public abstract double getSalarioLiquido();
    public abstract void getBeneficios();
}
