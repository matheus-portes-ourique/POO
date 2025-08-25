/**
 *
 * @author Matheus Portes Ourique
 */
public class Retangulo {
    private double altura;
    private double base;
    
    public void setAltura(double a){
        altura = a;
    }
    public double getAltura(){
        return (altura);
    }
    
    public void setBase (double b){
        base = b;
    }
    public double getBase (){
        return (base);
    }
    
    public double calcArea(){
        return(altura * base);
    }
    
    public double calcPerimetro(){
        return((altura + base) * 2);
    }
    
    public double calcDiagonal(){
        return(Math.sqrt(Math.pow(altura,2) + Math.pow(base,2)));
            
    }
}