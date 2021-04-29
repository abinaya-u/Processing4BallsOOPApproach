import processing.core.PApplet;

public class OOPApproach extends PApplet {
    private final int WIDTH = 640;
    private final int HEIGHT = 640;


    public static void main(String[] args) {
        PApplet.main("OOPApproach",args);
    }

    @Override
    public void settings() {
        super.settings();
        setWindowSize();
    }

    private void setWindowSize() {
        size(WIDTH,HEIGHT);
    }
}
