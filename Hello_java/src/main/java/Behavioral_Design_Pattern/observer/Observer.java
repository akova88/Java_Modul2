package Behavioral_Design_Pattern.observer;


abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
