package singleinheritance.smarthomedevices;

class Thermostat extends Device{

 int temperatureSetting;

 Thermostat(int temperatureSetting,int deviceId, String status ) {

         super(deviceId,status);
        this.temperatureSetting = temperatureSetting;

    }

@Override
 void displayStatus() {
           super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
