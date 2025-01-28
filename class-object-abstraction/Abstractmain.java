abstract class Light
{
    abstract void turnOn();
    abstract void turnOff();
}

class LightOnorOff extends Light
{
    @Override
    void turnOn()
    {
        System.out.println("Light is on");
    }
    @Override
    void turnOff()
    {
        System.out.println("Light is off");
    }
}

class Abstractmain
{
    public static void main(String[] args)
    {
        Light light =  new LightOnorOff();
        light.turnOn();
        light.turnOff();
    }
}