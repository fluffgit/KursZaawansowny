package LAB150122.zadanie12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class zad12 {
    public static void main(String[] args) {

        Manufacturer A = new Manufacturer("FactoryA",new Date(2000,12,12),"Poland");
        Manufacturer B = new Manufacturer("FactoryA",new Date(2000,12,12),"Poland");
        Manufacturer C = new Manufacturer("FactoryA",new Date(2000,10,12),"Poland");

        List<Manufacturer> lista = new ArrayList<>(List.of(A,B));

        Car opel = new Car("Opel","insignia",new Date(2020,10,15),lista,EngineType.S4);
        Car opel2 = new Car("Opel","insignia",new Date(2020,10,15),lista,EngineType.S4);

        System.out.println(A.equals(opel));

        System.out.println(opel.equals(opel2));
        System.out.println(opel.hashCode());
        System.out.println(opel2.hashCode());

        System.out.println();
        System.out.println(A.hashCode());
        System.out.println(B.hashCode());
        System.out.println(C.hashCode());
        System.out.println(A.equals(B));
        System.out.println(A.equals(C));

    }
}
