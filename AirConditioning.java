public class AirConditioning implements HomeService {
    @Override 
    public void turnOn() {
        System.out.println("The airconditioning is turning on.");
    }

    @Override 
    public void turnOff() {
        System.out.println("The airconditioning is turning off.");
    }
}