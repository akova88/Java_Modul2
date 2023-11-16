package OOAD_SOLID.dependencyInversionPrinciple.lowlevel;

import OOAD_SOLID.dependencyInversionPrinciple.highlevel.Switchable;

public class Fan implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Fan: Fan turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Fan: Fan turn off...");
    }
}
