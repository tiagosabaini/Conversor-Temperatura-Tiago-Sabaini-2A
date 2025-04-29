public class Celsius extends Temperatura {
    public Celsius(double valorGraus){
        //
        super(valorGraus);
    }
    
    //CRIANDO OS METODOS PARA CONVERÇÂO
    public double paraFarenheit(){
        return (getGraus()*9/5)+32;
        
    }
    
    //CRIANDO METODOS DE CELCIUSPRA KELVIN
    public double paraKelvin(){
        return getGraus()+273;
    }
}
