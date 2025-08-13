package org.example;

public class Quadcopter extends Drone implements VisualRecon{
    public Quadcopter(String callsign){
        super(callsign);
    }
    @Override
    public void fly(){
        System.out.println(getCallsign() + " is hovering with four rotors.");
    }

    @Override
    public void takePicture(){
        System.out.println(getCallsign() + " takes a picture with its " + SENSOR_TYPE);
    }

}
