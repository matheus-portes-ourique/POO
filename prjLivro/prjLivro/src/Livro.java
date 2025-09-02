/**
 *
 * @author Matheus 
 */
public class Livro {
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro (int i, String t){
        identificacao = i;
        titulo = t;        
    }
    
    public void setvalMultaDiaria(double m){
        valMultaDiaria = m;
    }
    
    public int getIdentificacao(){
        return (identificacao);
    }
    
    public String getTitulo(){
        return (titulo);
    }
    
    public boolean getSituacao(){
        return(situacao);
    }
    
    public void emprestar(){
        situacao = true;
    }
    
    public double devolver (int d){
        situacao = false;
        return valMultaDiaria * dia; 
    }
}
