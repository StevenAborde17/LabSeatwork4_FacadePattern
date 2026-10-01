public class HomeInterface {
    private Light light;
    private AirConditioning airConditioning;
    private TV tv;

    public HomeInterface() {
        light = new Light();
        airConditioning = new AirConditioning();
        tv = new TV();
    }
    
    public void turnOnAll() {
        light.turnOn();
        airConditioning.turnOn();
        tv.turnOn();
    } 
    
    public void turnOffAll() {
        light.turnOff();
        airConditioning.turnOff();
        tv.turnOff();
    }
}