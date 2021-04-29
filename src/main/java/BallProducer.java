
public class BallProducer {

    private int xCoordinate;

    public BallProducer(int speed) {
        this.xCoordinate = speed;
    }

    public int getXCoordinate() {
        return this.xCoordinate;
    }

    public void moveXCoordinate(int xCoordinate) {
        this.xCoordinate += xCoordinate;
    }
}
