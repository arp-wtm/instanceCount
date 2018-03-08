package com.example.antonella.instancecount;

/**
 * Created by francesco on 08/03/18.
 */

public class Person {
    public static int instanceCount;
    public int localCount;

    public Person() {
        instanceCount++;
        localCount++;
    }
}