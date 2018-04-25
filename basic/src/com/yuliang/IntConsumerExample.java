package com.yuliang;

import java.util.function.IntConsumer;

public class IntConsumerExample {
    public static void main(String[] args) {
        IntConsumer ic = number -> System.out.println(number);
        IntConsumer ic2 = number -> System.out.println(number * 2);

        ic.andThen(ic2).accept(5);
    }
}
