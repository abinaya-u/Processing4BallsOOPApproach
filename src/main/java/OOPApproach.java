import processing.core.PApplet;


public class OOPApproach extends PApplet {
    private final int WIDTH = 640;
    private final int HEIGHT = 640;
    private final int DIAMETER = 25;

    private final BallProducer ballProducer[] = new BallProducer[4];


    public OOPApproach() {
        for (int iterator = 0; iterator < 4; iterator++)
            ballProducer[iterator] = new BallProducer(iterator);

    }

    public static void main(String[] args) {
        PApplet.main("OOPApproach", args);
    }

    @Override
    public void settings() {
        super.settings();
        setWindowSize();
    }

    private void setWindowSize() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void draw() {
        for (int iterator = 0; iterator < 4; iterator++)
            ellipse(ballProducer[iterator].getXCoordinate(), HEIGHT * (iterator + 1) / 5, DIAMETER, DIAMETER);
        moveBallBasedOnTheSpeed();
    }

    private void moveBallBasedOnTheSpeed() {
        for (int iterator = 0; iterator < 4; iterator++)
            ballProducer[iterator].moveXCoordinate(iterator + 1);

    }

}

