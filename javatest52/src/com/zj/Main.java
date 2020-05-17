package com.zj;

import com.zj.creature.Person;
import com.zj.transport.Steamer;

public class Main {

    public static void main(String[] args) {
        Person tom=new Person();
        tom.setName("tom");
        Steamer steamer=new Steamer();
        tom.driveTransport(steamer);
    }
}
