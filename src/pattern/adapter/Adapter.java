package pattern.adapter;

/**
 * 适配器
 */
public class Adapter implements Target{
    private Adaptee adaptee = null;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void playMusic() {
        adaptee.makeVoice();
    }
}
