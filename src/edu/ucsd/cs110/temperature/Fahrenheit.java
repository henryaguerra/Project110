package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float temp = (float) ((this.getValue() - 32) / 1.8);
        Celsius cel = new Celsius(temp);
        return cel;
    }

    @Override
    public Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}
