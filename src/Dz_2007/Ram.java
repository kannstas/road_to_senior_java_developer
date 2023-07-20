package Dz_2007;

public class Ram implements Cloneable{
    private int volumeMemory;

    public Ram(int volumeMemory) {
        this.volumeMemory = volumeMemory;
    }

    public int getVolumeMemory() {
        return volumeMemory;
    }

    public void setVolumeMemory(int volumeMemory) {
        this.volumeMemory = volumeMemory;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Ram(volumeMemory);
    }
}
