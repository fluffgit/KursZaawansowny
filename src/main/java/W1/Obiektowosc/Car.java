package W1.Obiektowosc;

public abstract class Car{
    private final String vin;

    public Car(String vin){
        this.vin = vin;
    }

    public String getVin(){
        return vin;
    }

    abstract void runEngine();

    //klasa wewnętrzna w metodzie - dziwoląg
    public void createdPair(String key,int value){
        class Pair{
            String key;
            int value;
        }
        Pair pair = new Pair();
        pair.key = key;
        pair.value = value;
    }

    interface myIterator<T>{
        T next();
        T prevoius();
        boolean hasNext();
        boolean hasPrevious();
    }



}

