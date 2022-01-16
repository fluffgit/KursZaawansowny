package TRENER2.Interfejsy.zadanie3;

public class Car {

   private String name;
   private String type;


    public Car(String name, String type) {
        this.name = name;
        this.type = type;
        Engine engine = new Engine();
        engine.setEngine(type);

        System.out.println(engine.getType());
    }

    @Override
    public String toString() {
        return name +" "+type;

    }

    public class Engine{
        String type;

        public String setEngine(String carType){
            if(carType.equals("Economic")){
                this.type = "disel";
            }else if(carType.equals("Luxury")){
                this.type = "electric";
            }else{
                this.type = "petroil";
            }
            return this.type;
        }

        public String getType() {
            return type;
        }

        @Override
        public String toString() {
            return type;
        }
    }

}
