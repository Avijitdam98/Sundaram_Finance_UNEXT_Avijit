package OOPS.Inheritence.Basic;

public class Main {

    public static void main(String[] args) {
        Car car=new Car();
//        car.go();

        Bicycle bike=new Bicycle();
//        bike.stop();

        System.out.println(car.speed);
        System.out.println(car.doors);
        System.out.println(car.wheels);
        System.out.println(bike.pedals);
        System.out.println(bike.wheels);

    }

}
