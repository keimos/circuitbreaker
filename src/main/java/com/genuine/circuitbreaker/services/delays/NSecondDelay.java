package com.genuine.circuitbreaker.services.delays;

public class NSecondDelay implements IDelay {
    int delayInSeconds;

    /*public NSecondsDelay(int delayInSeconds) {
        this.delayInSeconds = delayInSeconds;
    }*/

    @Override
    public void delay() {
        try {
            Thread.sleep(delayInSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
