package W1.Obiektowosc;

public class CarIterator implements Car.myIterator<Car> {

    @Override
    public Car next(){
        return null;
    }

    @Override
    public Car prevoius() {
        return null;
    }


    @Override
    public boolean hasNext(){
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }


}
