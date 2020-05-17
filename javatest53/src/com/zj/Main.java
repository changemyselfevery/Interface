package com.zj;

import com.zj.creature.Person;
import com.zj.transport.Airship;
import com.zj.transport.Airtransport;

public class Main {

    public static void main(String[] args) {
        Person per=new Person();
        per.setName("per");
        Airship airship=new Airship();
        per.driveMethod(airship);
    }
}
