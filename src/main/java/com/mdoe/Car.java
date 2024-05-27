package com.mdoe;

public class Car {
       public PetroEngine engine;
       private String issa;

       public Car(String issa){
           engine = new PetroEngine();
           this.issa = issa;
        }

        public void startCar(){
            System.out.println("I add new Code");
           engine.start();
        }

        public void stopCar(){
           engine.stop();
        }
}