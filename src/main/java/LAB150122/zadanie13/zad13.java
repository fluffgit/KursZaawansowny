package LAB150122.zadanie13;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class zad13 {
    public static void main(String[] args) {

        Manufacturer A = new Manufacturer("FactoryA",new Date(2000,12,12),"Poland");
        Manufacturer B = new Manufacturer("FactoryA",new Date(2000,12,12),"Poland");
        Manufacturer C = new Manufacturer("FactoryA",new Date(2000,10,12),"Poland");

        List<Manufacturer> lista = new ArrayList<>(List.of(A));
        List<Manufacturer> lista10 = new ArrayList<>(List.of(C));
        List<Car> carList = new ArrayList<>();

        Car opel = new Car("Opela","insignia",19981012,lista10, EngineType.V12,120000);
        Car opel2 = new Car("Opelf","insignia",20201020,lista, EngineType.V12,10000);
        Car opel3 = new Car("Opelaa","insignia",20201020,lista, EngineType.V12,130000);
        Car opel4 = new Car("Opelz","insignia",20201020,lista, EngineType.V12,130000);

//        System.out.println(A.equals(opel));
//
//        System.out.println(opel.equals(opel2));
//        System.out.println(opel.hashCode());
//        System.out.println(opel2.hashCode());
//
//        System.out.println();
//        System.out.println(A.hashCode());
//        System.out.println(B.hashCode());
//        System.out.println(C.hashCode());
//        System.out.println(A.equals(B));
//        System.out.println(A.equals(C));

        Carservice carservice = new Carservice(carList);

        //carservice.printCarList();

        carservice.addCar(opel);
        carservice.addCar(opel2);
        carservice.addCar(opel3);
        carservice.addCar(opel4);
        //carservice.printCarList();
        //carservice.removeCar(opel);
        //carservice.printCarList();

//        carservice.getCarbyEngine(EngineType.V12);
//        carservice.getCarsProducedBeforeyear(19990101);
//        carservice.getMostExpensiveCar();
//        carservice.getLeastExpensiveCar();
//        carservice.getCarIfMoreThanThreeManufacturers();
//        carservice.getListSortedByParameter();

//        carservice.getListOfCarsByManufacturer(B);
//        System.out.println(carservice.getListSortedByParameter());
//        System.out.println(carservice.isInList(opel));

    }
}
