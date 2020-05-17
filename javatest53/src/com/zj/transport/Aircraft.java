package com.zj.transport;

import sun.rmi.transport.Transport;

/**
 * @description:
 * @author: zj
 * @date: Created in 2020/5/17 11:41
 * @version:
 * @modified By:
 */
public class Aircraft extends Airtransport{

    @Override
    public void driveMethod() {
        System.out.println("Aircraft driving");
    }
}
