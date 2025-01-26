package singleinheritance.smarthomedevices;

public class ControlClass {
    public static void main(String[] args) {

        Thermostat thermo= new Thermostat(22,123,"on");
        thermo.displayStatus();

    }
}
