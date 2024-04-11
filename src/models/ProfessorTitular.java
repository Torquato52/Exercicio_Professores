package models;

public class ProfessorTitular extends Professor{

    private int anosInstituicao;

    public ProfessorTitular(String nome, double salario, int anosInstituicao) {
        super(nome, salario);
        this.anosInstituicao = anosInstituicao;
        // Incremento de 5% para cada 5 anos de instituição
        this.setSalario(this.getSalario() + (this.anosInstituicao / 5) * (this.getSalario() * 0.05) );
    }

    public int getAnosInstituicao() {
        return this.anosInstituicao;
    }

}
