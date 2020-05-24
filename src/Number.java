public class Number {

    private final int number;
    private int counter;

    public Number(int number) {
        this.number = number;
        counter = 1;
    }

    public void count() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

    public int getNumber() {
        return number;
    }

    public boolean equals(int number) {
        return this.number == number;
    }

}
