public class BoardModel {
    private int lastIndex;  //Will hold the index of the last box that was edited
    private int counter;
    private int[] buttonVal;   //Holds the value of the button, 1 for player 1, 2 for player 2

    public BoardModel(int counter, int lastIndex, int[] buttonVal) {
        this.counter = counter;
        this.lastIndex = lastIndex;
        this.buttonVal = buttonVal;
    }

    public int getCounter() {
        return counter;
    }

    public int[] getButtonVal() {
        return buttonVal;
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void add(int i, int n) {
        buttonVal[i] = n;
    }

}