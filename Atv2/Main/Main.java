package Atv2.Main;

import Atv2.Classe.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //questao1();
        //questao2();
    }

    public static void questao1() {
        Scanner scan = new Scanner(System.in);
        Funcionario pessoa = new Funcionario("Pejota");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Informe o Salario da pessoa: ");
        pessoa.setSalario(scan.nextDouble());

        System.out.println("Salario do funcionario apos o aumento: " + pessoa.aumentarSalario(50));
        scan.close();
}
    public static void questao2() {
        Macaco monkey1 = new Macaco("DK");
        Macaco monkey2 = new Macaco("bubbles");
        
        monkey1.comer("banana");
        monkey1.comer("maçã");
        monkey1.comer("pizza");
        monkey1.verEstomago();

        monkey2.comer("laranja");
        monkey2.comer("melancia");
        monkey2.verEstomago();
        monkey2.comer("lasanha");
        monkey2.verEstomago();

        System.out.println("Mds, " + monkey2.getNome() + " olhou para a lua cheia e virou um ozaaru");
        monkey2.comer(monkey1.getNome());
        monkey2.verEstomago();
    }
    public static void questao3() {
        Alimento food1 = new Alimento("Banana", 89);
        Alimento food2 = new Alimento("Maçã", 52);
        Alimento food3 = new Alimento("Pizza", 266);

        System.out.println(food1);
        System.out.println(food2);
        System.out.println(food3);
    }}