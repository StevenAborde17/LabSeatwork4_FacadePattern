public class TV implements HomeService {
    @Override 
    public void turnOn() {
        System.out.println("The television is turning on.");
    }

    @Override 
    public void turnOff() {
        System.out.println("The television is turning off.\n");
    }
}