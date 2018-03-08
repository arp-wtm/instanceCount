package com.example.antonella.instancecount;

import android.util.Log;

import java.util.logging.Logger;

/**
 * Created by antonella on 08/03/18.
 */

public class ProvaAvvio {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        // Print the values of both counters to the Log console
        Log.v("(" + person4.localCount + "," + Person.instanceCount + ")");
    }
}
