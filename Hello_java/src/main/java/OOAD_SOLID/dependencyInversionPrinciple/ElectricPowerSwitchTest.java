package OOAD_SOLID.dependencyInversionPrinciple;

import OOAD_SOLID.dependencyInversionPrinciple.highlevel.ElectricPowerSwitch;
import OOAD_SOLID.dependencyInversionPrinciple.highlevel.Switch;
import OOAD_SOLID.dependencyInversionPrinciple.highlevel.Switchable;
import OOAD_SOLID.dependencyInversionPrinciple.lowlevel.Fan;
import OOAD_SOLID.dependencyInversionPrinciple.lowlevel.LightBulb;

public class ElectricPowerSwitchTest {
    public static void main(String[] args) {
        Switchable switchableBulb = new LightBulb();

        Switch bulbPowerSwitch = new ElectricPowerSwitch(switchableBulb);

        bulbPowerSwitch.press();

        bulbPowerSwitch.press();

        Switchable switchableFan = new Fan();

        Switch fanPowerSwitch = new ElectricPowerSwitch(switchableFan);

        fanPowerSwitch.press();

        fanPowerSwitch.press();

    }
}
