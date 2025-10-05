/**
 *
 * @author matheus
 */
public class Circulo {
    private double Raio;
    
   public void setRaio(double r){
        Raio = r;
    }
    public double getRaio(){
        return (Raio);
    }
    
     public double calcArea(){
        return(3.14 * Raio );
    }
    
    public double calcPerimetro(){
        return(2 * 3.14 * Raio);
    }
    
    public double calcDiametro(){
        return(2 * Raio);
    }
            
}