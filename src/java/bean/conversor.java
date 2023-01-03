package bean;

import jakarta.faces.bean.ManagedBean;

@ManagedBean
public class conversor {
    double celsius;
    double fahrenheit;
    boolean naocalculado = true;
    
    public conversor(){
        
    }
    
    public void converterCpF(){
        fahrenheit = (celsius * 9/5) + 32;
        naocalculado = false;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public boolean isNaocalculado() {
        return naocalculado;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void setNaocalculado(boolean naocalculado) {
        this.naocalculado = naocalculado;
    }
    
   
}
