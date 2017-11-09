package com.demo.camera;

public class PhotoCamera implements WriteListener {

    ImageSensor sensor;
    Card card;
    boolean on;


    public PhotoCamera(ImageSensor sensor, Card card){
        this.sensor=sensor;
        this.card=card;
    }

    public void turnOn() {
        sensor.turnOn();
        on =true;
    }

    public void turnOff() {
        sensor.turnOff();
        on =false;
    }

    public void pressButton() {
        if(on){
            card.write(sensor.read());
        }
    }

    @Override
    public void writeCompleted() {

    }
}

