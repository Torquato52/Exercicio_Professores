package models;

public class ProfessorHorista extends Professor{

    private int totalHoras;
    private double valorHoraAula;

    public ProfessorHorista(String nome, double salario, int totalHoras, double valorHoraAula) {
        super(nome, salario);
        this.totalHoras = totalHoras;
        this.valorHoraAula = valorHoraAula;
        // Salário é a multiplicação do total de horas pelo valor da hora aula
        this.setSalario(this.totalHoras * this.valorHoraAula);
    }

    public int getTotalHoras() {
        return this.totalHoras;
    }

    public double getValorHoraAula() {
        return this.valorHoraAula;
    }


}
