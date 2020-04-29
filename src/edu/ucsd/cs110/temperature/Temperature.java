package edu.ucsd.cs110.temperature;
public abstract class Temperature {
    public Temperature(float v)
    {
        float value = v;
    }
    public final float getValue()
    {
        float value = 0;
        return value;
    }
    public abstract Temperature toCelsius();
    public abstract Temperature toFahrenheit();
}