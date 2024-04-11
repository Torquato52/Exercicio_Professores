package view;

import models.ProfessorHorista;
import models.ProfessorTitular;

public class View {

    public static void criarProfessores() {
        // Criando um professor titular com 10 anos de instituição e salário inicial de R$5000
        ProfessorTitular profTitular = new ProfessorTitular("João", 5000, 10);
        System.out.println("Professor Titular: " + profTitular.getNome());
        System.out.println("Salário: R$" + profTitular.getSalario());
        System.out.println("Anos de Instituição: " + profTitular.getAnosInstituicao());

        // Criando um professor horista com 40 horas de trabalho e valor hora aula de R$50
        ProfessorHorista profHorista = new ProfessorHorista("Maria", 0, 40, 50);
        System.out.println("\nProfessor Horista: " + profHorista.getNome());
        System.out.println("Salário: R$" + profHorista.getSalario());
        System.out.println("Total de horas trabalhadas: " + profHorista.getTotalHoras());
        System.out.println("Valor da hora aula: R$" + profHorista.getValorHoraAula());
    }

}
