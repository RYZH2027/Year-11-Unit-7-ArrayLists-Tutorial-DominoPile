public class Domino {
    private int top;
    private int bottom;

    public Domino(){
        this.top = 0;
        this.bottom = 0;
    }
    public Domino(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    // Getter for top value
    public int getTop() {
        return top;
    }

    // Getter for bottom value
    public int getBottom() {
        return bottom;
    }

    // Setter for top value
    public void setTop(int top) {
        this.top = top;
    }

    // Setter for bottom value
    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    // Flips the domino by swapping top and bottom
    public void flip() {
        int temp = top;
        top = bottom;
        bottom = temp;
    }
    // Settles the domino so smaller number is on top
    public void settle() {
        if (top > bottom) {
            flip();
        }
    }

    // Compares based on total weight (sum of top and bottom)
    @Override
    public int compareTo(Domino other) {
        int thisWeight = this.top + this.bottom;
        int otherWeight = other.top + other.bottom;

        if (thisWeight > otherWeight) return 1;
        if (thisWeight < otherWeight) return -1;
        return 0;
    }

    // Additional comparison method for weight
    public int compareToWeight(Domino other) {
        int thisWeight = this.top + this.bottom;
        int otherWeight = other.top + other.bottom;
        return Integer.compare(thisWeight, otherWeight);
    }

    // Checks if this domino can connect to another
    public boolean canConnect(Domino other) {
        return this.top == other.top ||
                this.top == other.bottom ||
                this.bottom == other.top ||
                this.bottom == other.bottom;
    }

}
