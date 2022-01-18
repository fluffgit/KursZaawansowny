package LAB150122.zadanie13;

import java.util.*;
import java.util.stream.Collectors;

public class Carservice {

    private List<Car> lista;

    public Carservice(List<Car> lista) {
        this.lista = lista;
    }

    public void addCar(Car car){
        lista.add(car);
    }

    public void removeCar(Car car){
        lista.remove(car);
    }

    public void printCarList(){
        System.out.println(lista);
    }

    public void getCarbyEngine(EngineType engineType){
        List<Car> list = new ArrayList<>();
        for (Car car : lista) {
            if (car.getEngineType().equals(engineType)) {
                list.add(car);
            }
        }
        System.out.println(engineType+" "+list);
    }

    public void getCarsProducedBeforeyear(int year){
        List<Car> list = new ArrayList<>();
        for (Car car : lista) {
            if (car.getProductionDate() < year) {
                list.add(car);
            }
        }
        System.out.println(year+" "+list);

    }

    public void getMostExpensiveCar(){
        Car most = lista.get(0);
        Iterator<Car> iter = lista.iterator();
        while (iter.hasNext()){
            Car car = iter.next();
            if (car.getPrice() > most.getPrice()){
                most =car;
            }
        }
        System.out.println("most expensive: "+most+", price: "+most.getPrice());
    }

    public void getLeastExpensiveCar(){
        Car most = lista.get(0);
        Iterator<Car> iter = lista.iterator();
        while (iter.hasNext()){
            Car car = iter.next();
            if (car.getPrice() < most.getPrice()){
                most =car;
            }
        }
        System.out.println("Least expensive: "+most+", price: "+most.getPrice());
    }
    //9
    public List<Car> getListSortedByParameter(){
        return lista.stream().sorted().collect(Collectors.toList());
    }



    @Override
    public String toString() {
        return lista+"";
    }

    public void getCarIfMoreThanThreeManufacturers() {
        List<Car> list = new ArrayList<>();

        for (Car car : lista) {
            if (car.getManufacturerList().size() >= 3) {
                list.add(car);
            }
        }
        System.out.println("more than 3"+list);

    }

    public void getListOfCarsByManufacturer(Manufacturer manufacturer) {
        List<Car> list = new ArrayList<>();
        for(Car car : lista){
            if(car.getManufacturerList().contains(manufacturer)){
                list.add(car);
            }
        }
        System.out.println(list);

    }

    public boolean isInList(Car car){
        return lista.contains(car);
    }
}
