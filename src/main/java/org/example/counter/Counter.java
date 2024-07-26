package org.example.counter;

public class Counter {
    private int value;

    // Constructor that sets the start value of the counter to startValue
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Constructor that sets the start value of the counter to 0
    public Counter() {
        this(0);

    }
    //method to return current value of counter
    public int currentValue() {
        return value;
    }
    public void increase() {
        value += 1;
    }
    //overload method that increases the value by increaseBy
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Method that decreases the value by 1
        public void decrease() {
        value -= 1;
    }
    // Overloaded method that decreases the value by decreaseBy
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}



