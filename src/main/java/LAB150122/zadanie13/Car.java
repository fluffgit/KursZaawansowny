package LAB150122.zadanie13;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Car implements Comparable<Car>{

    private String name;
    private String model;
    private int productionDate;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;
    private double price;

    public Car(String name, String model, int productionDate, List<Manufacturer> manufacturerList, EngineType engineType, double price) {
        this.name = name;
        this.model = model;
        this.productionDate = productionDate;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o instanceof Car) {
            Car car = (Car) o;
            return Objects.equals(name, car.name)
                    && Objects.equals(model, car.model)
                    && Objects.equals(productionDate, car.productionDate)
                    && Objects.equals(manufacturerList, car.manufacturerList)
                    && engineType == car.engineType;
        }else return false;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(int productionDate) {
        this.productionDate = productionDate;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void setManufacturerList(List<Manufacturer> manufacturerList) {
        this.manufacturerList = manufacturerList;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, productionDate, manufacturerList, engineType);
    }

    @Override
    public String toString() {
        return "[name: "+name+", "+model+", data prod.:"+productionDate+"]";
    }

    @Override
    public int compareTo(Car o) {
        return name.compareTo(o.getName());
    }
}
