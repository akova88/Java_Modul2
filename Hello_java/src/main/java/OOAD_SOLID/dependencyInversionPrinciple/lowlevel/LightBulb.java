package OOAD_SOLID.dependencyInversionPrinciple.lowlevel;

import OOAD_SOLID.dependencyInversionPrinciple.highlevel.Switchable;

public class LightBulb implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Light Bulb: Bulb turn on...");
    }

    @Override
    public void turnOff() {
        System.out.println("Light Bulb: Bulb turn off...");
    }
}
