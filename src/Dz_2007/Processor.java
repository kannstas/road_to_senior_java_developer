package Dz_2007;

public class Processor implements Cloneable {
    private int hertz;

    public Processor(int hertz) {
        this.hertz = hertz;
    }

    public int getHertz() {
        return hertz;
    }

    public void setHertz(int hertz) {
        this.hertz = hertz;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Processor(hertz);
    }
}
