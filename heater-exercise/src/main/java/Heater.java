public class Heater{
    public double temperature;
    public double min;
    public double max;
    public double increment;

    Heater(double min, double max){
        this.temperature = 15.0;
        this.increment = 5.0;
        this.min = min;
        this.max = max;
    }

    public void setIncrement(double increment){this.increment=increment;}
    public void warmer(){
        if (max >= (temperature+increment))
            this.temperature = this.temperature + increment;
    }
    public void coler(){
        if (min <= (temperature-increment))
            this.temperature = this.temperature - increment;
    }
}