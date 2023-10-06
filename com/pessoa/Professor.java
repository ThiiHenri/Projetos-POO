package br.com.pessoa;

public class Professor extends Pessoa{

    private float salarioHora;
    private int horasAulas;

    public Professor(String nome, String email, String senha, float salarioHora, int horasAulas) {
        super(nome, email, senha);
        this.salarioHora = salarioHora;
        this.horasAulas = horasAulas;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAulas() {
        return horasAulas;
    }

    public void setHorasAulas(int horasAulas) {
        this.horasAulas = horasAulas;
    }

    public float calculaSalario(){
        return getSalarioHora() * getHorasAulas();
    }

    public String mostraProfessor(){
        return "\n Nome: " + getNome() +
                "\n Email: " + getEmail() +
                "\n Calculo do Salario: " + calculaSalario();
    }

}
