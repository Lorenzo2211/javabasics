package javaoopadvanced.oopadvanced._2;

public class Guitar extends Instrument{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public boolean play(boolean play) {
        return play;
    }

}
