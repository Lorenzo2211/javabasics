package javaoopadvanced.oopadvanced._2;

public class Piano extends Instrument{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public boolean play(boolean play) {
        return play;
    }
}
