package edu.sdsu.cs160l.methodrefrence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ImmutabilityOfStreams {
    private final List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 6, 7, 4, 1, 12, 5, 10));

    public static void main(String[] args) {
        ImmutabilityOfStreams immutability = new ImmutabilityOfStreams();
        immutability.forEachExpression();
        immutability.regularForLoop();
    }

    public void regularForLoop() {
        int i = 0;
        for (int number : numbers) {
            System.out.println("Regular Value at index " + i + " is " + number);
            i++;
        }
    }

    public void forEachExpression() {
        AtomicInteger i = new AtomicInteger(0);
        numbers.forEach(number -> System.out.println("ForEach Value at index " + i.getAndIncrement() + " is " + number));
    }
}
