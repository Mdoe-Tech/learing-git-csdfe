package com.mdoe;

public class Car {
       public PetroEngine engine;
       private String issa;

       public Car(String issa){
           engine = new PetroEngine();
           this.issa = issa;
        }

        public void startCar(){
           engine.start();
        }

        public void stopCar(){
           engine.stop();
        }
}