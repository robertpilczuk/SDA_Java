package ps.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class Garage {

    private String name;
    private int capacity;
    private ArrayList<Car> cars;


    public Garage() {
        this.cars = new ArrayList<Car>();
    }

    public Garage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cars = new ArrayList<Car>(capacity);
    }

    @Override
    public String toString() {
        return "Garage " +
                "name: " + name +
                ", capacity: " + capacity;
    }

    public boolean removeCar(int slot) {
        if (cars.size() >= slot) {
            this.cars.remove(slot - 1);
            System.out.println("car at slot " + slot + " was removed");
            return true;
        } else {
            System.out.println("no car found in slot " + slot);
            return false;
        }
    }

    public void addCar(String model, double engineSize, int modelYear, String color) {
            this.cars.add(new Car(model, engineSize, modelYear, color));
            System.out.println(modelYear + " " + color + " " + model + " added to " + this.name);
    }


    public void printCars() {
        ListIterator<Car> listIterator = cars.listIterator();
        int index = 1;
        if(cars.isEmpty()) {
            System.out.println("no cars in " + getName());
        } else {
            System.out.println(getName() + " garage car, list:");
            while(listIterator.hasNext()) {
                System.out.println(index + ". " + listIterator.next().toString());
                index++;
            }
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    //=================== inner class =======================
    private class Car {
        private String model;
        private double engineSize;
        private int modelYear;
        private String color;

        public Car(String model, double engineSize, int modelYear, String color) {
            this.model = model;
            this.engineSize = engineSize;
            this.modelYear = modelYear;
            this.color = color;
        }

        @Override
        public String toString() {
            return this.color + " " + modelYear + " " + model + ", engine size " + engineSize;
        }

        public String getModel() {
            return model;
        }

        public double getEngineSize() {
            return engineSize;
        }

        public int getModelYear() {
            return modelYear;
        }

        public String getColor() {
            return color;
        }
    }
    //==================inner class===========================
}
