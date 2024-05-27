package com.mdoe;

public class Car {
       public PetroEngine engine;

       public Car(){
           engine = new PetroEngine();
        }

        public void startCar(){
           engine.start();
        }

        public void stopCar(){
           engine.stop();
        }
}