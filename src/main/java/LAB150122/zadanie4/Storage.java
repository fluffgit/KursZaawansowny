package LAB150122.zadanie4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage implements StorageInterface {

    private Map<String, List<String>> mapa;

    public Storage(Map<String, List<String>> mapa) {
        this.mapa = mapa;
    }




    @Override
    public void addToStorage(String key, String value) {
        List<String> lista = new ArrayList<>();
        if (mapa.containsKey(key)) {
            mapa.get(key).add(value);
        } else {
            lista.add(value);
            mapa.put(key, new ArrayList<>(List.of(value)));
        }


    }

    @Override
    public void printValues(String key) {
        System.out.println(mapa.get(key));
    }

    @Override
    public void findValues(String values) {
        System.out.println(mapa.entrySet().stream()
                .filter(k -> k.getValue().contains(values))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
        );
    }

    @Override
    public String toString() {
        return "Storage{" +
                "mapa=" + mapa +
                '}';
    }
}
