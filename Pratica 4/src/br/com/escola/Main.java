package br.com.escola;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Lucas");
        aluno1.setRa("124578");
        aluno1.setNotaAv1(40);
        aluno1.setNotaAv2(50);

        System.out.println("Aluno1: "+ aluno1.getNome()+ "\n");

        Aluno aluno2 = new Aluno("Ana","123444");

        System.out.println("Aluno2: "+aluno2.getNome()+"\n"+aluno2.getNome());

        Aluno aluno3 = new Aluno("João","7363636",40.5f,30.7f);

        System.out.println("Aluno3: "+aluno3.getNome()+"\n"+aluno3.getNome()+"\n"+(aluno3.getNotaAv2()+aluno3.getNotaAv1()));
    }



}
