package com.zj;

import com.zj.creature.Person;
import com.zj.transport.Airship;

public class Main {

    public static void main(String[] args) {
        Person tom=new Person();
        tom.setName("tom");
        Airship airship=new Airship();
        tom.driveTransport(airship);
    }
}
