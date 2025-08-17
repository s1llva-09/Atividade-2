public class Retangulo {
    public static void main(String[] args) {
        Retangulin r = new Retangulin();

        int area = r.calcularArea(5,3);

        System.out.println("Base: " + r.getBase());
        System.out.println("Altura: " + r.getAltura());
        System.out.println("Área: " + area);
    }
}
