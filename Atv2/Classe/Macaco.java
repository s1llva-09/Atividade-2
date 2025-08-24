package Atv2.Classe;
import java.util.List;
import java.util.ArrayList;

public class Macaco {
    private String nome;
    private List<String> estomago;

    public Macaco(String nome) {
        this.nome = nome;
        this.estomago = new ArrayList<>();
    }
    public void comer(String comida) {
        estomago.add(comida);
        System.out.println(nome + " comeu: " + comida);
    }
    public void verEstomago() {
        System.out.println("Estomago de " + nome + ": " + estomago);
    }
    public void digerir() {
        if (!estomago.isEmpty()) {
            String alimento = estomago.remove(0);
            System.out.println(nome + "digiriu: " + alimento);
        }else {
            System.out.println(nome + "estomago vazio.");
        }
    }
    public String getNome() {
        return nome;
    }
}
