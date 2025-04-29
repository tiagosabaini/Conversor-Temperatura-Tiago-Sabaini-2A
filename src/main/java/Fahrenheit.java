public class Fahrenheit extends Temperatura {
    
    public Fahrenheit(double valorGraus){
        super(valorGraus);
    }
    
    //METODO QUE CONVERTE FAHRENHEIT PARA CELSIUS
    public double paraCelsius(){
        return(getGraus()-32)*5/9;
    }
    
    //METODO QUE CONVERTE FAHRENHEIT PARA KELVIN 
    public double paraKelvin(){
        return paraCelsius()+273;
    }
}
