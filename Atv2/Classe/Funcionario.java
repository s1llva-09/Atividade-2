package Atv2.Classe;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double percentualDeAumento) {
        return salario + (percentualDeAumento / 100) * salario;
    }
}
