package inheritance;

import java.util.ArrayList;

public class PF extends Funcionario{
    private String cpf;

    public PF() {
        this.beneficios = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public double getSalarioLiquido() {
        return this.getSalario() - (getSalario() * 0.1);
    }

    @Override
    public void getBeneficios() {
        System.out.printf("Benefícios: %s", String.join(",", this.beneficios));
    }
}
