package Fanfo;

public class RV implements  Vehicle, House{
    @Override
    public void start() {

    }

    @Override
    public void stop() {
        Vehicle.super.stop();
    }
  
}
