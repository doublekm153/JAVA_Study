package chap_09;

public class NestedClassExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        /*Tire 클래스는 Car 클래스 내부에 있기 때문에
        * Car 클래스의 인스턴스가 있어야만 Tire 클래스의 인스턴스를 생성할 수 있다.
        * Car 클래스의 myCar 라는 변수를 통해 Tire 클래스의 인스턴스를 생성할 수 있다.
        * */
        Car.Tire tire = myCar.new Tire();

        /*
        * Engine 클래스는 Car 클래스의 정적 멤버 클래스이기 때문에
        * Car 클래스의 인스턴스 없이도 Engine 클래스의 인스턴스를 생성할 수 있다.
        * */
        Car.Engine engine = new Car.Engine();
    }
}
