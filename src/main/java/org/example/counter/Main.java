package org.example.counter;

public class Main {
    public static void main(String[] args) {
        //Using constructor that sets start value of the counter to startValue
        Counter counter1 = new Counter(10);
        System.out.println("Counter Initial value = " + counter1.currentValue());

        counter1.increase();
        System.out.println("Counter Increment value = " + counter1.currentValue());

        counter1.increase(5);
        System.out.println("Counter Increment value by 5 = " + counter1.currentValue());

        counter1.decrease();
        System.out.println("Counter Decrement value = " + counter1.currentValue());


        counter1.decrease(3);
        System.out.println("Counter Decrement value by 3 = " + counter1.currentValue());

        // Using constructor that sets the start value of the counter to 0
        Counter counter2 = new Counter();
        System.out.println("Counter2 Initial value = " + counter2.currentValue());

        counter2.increase();
        System.out.println("Counter2 Increment value = " + counter2.currentValue());

        counter2.increase(7);
        System.out.println("Counter2 Increment value  by 7 = " + counter2.currentValue());

        counter2.decrease();
        System.out.println("Counter2 Decrement value = " + counter2.currentValue());

        counter2.decrease(2);
        System.out.println("Counter2 Decrement value by 2 = " + counter2.currentValue());

    }
}
