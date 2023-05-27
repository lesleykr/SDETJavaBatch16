package class17;

public class Laptop {
    String make;
    String model;
    double batteryLife;
    int storage;
    boolean camera;
    boolean touchpad;
    boolean touchscreen;

    Laptop(String make, String model, double batteryLife, int storage,boolean camera, boolean touchpad, boolean touchscreen){
        this.make=make;
        this.model=model;
        this.batteryLife=batteryLife;
        this.storage=storage;
        this.camera=camera;
        this.touchpad=touchpad;
        this.touchscreen=touchscreen;
    }
}
