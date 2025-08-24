public class ControleTV {
    public int canal;
    public int volume;

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }
    public int getVolume() {
        return volume;
    }
    public void aumentarVolume(int volume) {
        this.volume = volume++;
    }
    public void reduzirVolume(int volume) {
        this.volume = volume--;
    }
}
