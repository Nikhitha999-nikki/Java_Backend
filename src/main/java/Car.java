public class Car {
    private Engine engine;
    public Car(Engine engine) { this.engine = engine; }
    void drive() { engine.start(); }
}
