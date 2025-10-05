package fatec.poo.model;

/**
 *
 * @author mathe
 */
public class Cliente extends Pessoa {
    public String cpf;
    public double peso, altura;
    
    
    public Cliente (String c, String n, String t){
            super (n, t);
            String cpf = c;
    }
    
   public void setPeso(double p){
        peso = p;
    }
   
   
   public void setAltura(double a){
       altura = a;
   }
   
   
   public String getCPF(){
       return cpf;
   }
    
    public double getPeso(){
        return peso;
    }
    
    public double getAltura(){
        return altura;
    }
    
    
    
    
}
    
