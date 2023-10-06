package br.com.pessoa;

public class main {
    public static void main(String[] args){

        Professor prf = new Professor("Adão","Adao@gmail.com","joaozinhonewton",125,36);
        System.out.println("Dados do Professor: " + prf.mostraProfessor());

        Aluno aln = new Aluno("Thiago","thiagohenrique","thiago2023",4,5);
        System.out.println("Dados do Aluno: " + aln.mostraAluno());

    }
}
