public class MainControle {
    public static void main(String[] args) {
        ControleTV comando = new ControleTV();

        comando.setCanal(10);
        comando.aumentarVolume(25);

        System.out.println("Canal: " + comando.getCanal());
        System.out.println("Volume: " + comando.getVolume());

        comando.reduzirVolume(10);

        System.out.println("Novo Volume: " + comando.getVolume());
    }
}