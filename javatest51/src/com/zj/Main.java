package com.zj;

import com.zj.creature.Person;
import com.zj.transport.Airship;

public class Main {

    public static void main(String[] args) {
        Person tomy = new Person();
        tomy.setName("tomy");
        Airship airship=new Airship();
        airship.setDescription("airship");
        System.out.print(tomy.getName() +" ");
        tomy.driveTransport(airship);

    }
}
