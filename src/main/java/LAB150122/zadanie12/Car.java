package LAB150122.zadanie12;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Car {

    private String name;
    private String model;
    private Date productionDate;
    private List<Manufacturer> manufacturerList;
    private EngineType engineType;

    public Car(String name, String model, Date productionDate, List<Manufacturer> manufacturerList, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.productionDate = productionDate;
        this.manufacturerList = manufacturerList;
        this.engineType = engineType;
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

    @Override
    public int hashCode() {
        return Objects.hash(name, model, productionDate, manufacturerList, engineType);
    }
}
