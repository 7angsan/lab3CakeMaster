package cs301.birthdaycake;

public class CakeModel {
    public boolean litCandle = true;
    public int numCandle = 2;
    public boolean hasFrost = true;
    public boolean hasCandle = true;

    public void changeLit() {
        if (litCandle) {
            litCandle = false;
        } else {
            litCandle = true;
        }
    }

    public void toggleCandles() {
        if(numCandle > 0) {
            numCandle = 0;
        } else {
            numCandle = 2;
        }
    }

    public void setCandles(int candles) {
        numCandle = candles;
    }

}
