public class Light implements HomeService {
    @Override 
    public void turnOn() {
        System.out.println("\nThe lights are turning on.");
    }

    @Override 
    public void turnOff() {
        System.out.println("the lights are turning off.");
    }
}