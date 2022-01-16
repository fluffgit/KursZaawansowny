package LAB150122.zadanie3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class zad3 {
    public static void main(String[] args) {
        Map<String,Integer> mapa = new TreeMap<>();
        mapa.put("asd",1);
        mapa.put("qwe",3);
        mapa.put("zxc",15);
        mapa.put("qaz",5);

        mapowanie(mapa);
    }


    public static void mapowanie(Map<String,Integer> mapa){
        Iterator<Map.Entry<String, Integer>> iterator = mapa.entrySet().iterator();
        //mapa.forEach((key, value) -> System.out.println("Klucz: "+key + ", Wartość: " + value+","));
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();

            System.out.printf("Key: %s, value \"%d\"%s\n",next.getKey(),next.getValue(),iterator.hasNext()?",":".");


        }

    }
}
