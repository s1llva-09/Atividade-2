public class Retangulin {
    public int base;
    public int altura;

    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int calcularArea(int base, int altura) {
        this.base = base;
        this.altura = altura;
        return base * altura;
    }
}