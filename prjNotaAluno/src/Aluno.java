/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Aluno {
   private int RA;
   private double NtPrv1, NtPrv2, NtTrab1, NtTrab2, MediaProva, MediaTrab;
   private double MediaFinal;
   
    public void setRa(int ra){
        RA = ra ;
    }
    
    public int getRA(){
        return (RA);
    }
   
    public void setNtPrv1(double np1){
        NtPrv1 = np1;
    }
    
    public double getNtPrv1(){
        return (NtPrv1);
    }
    
    public void setNtPrv2(double np2){
        NtPrv2 = np2;
    }
    
    public double getNtPrv2(){
        return (NtPrv2);
    }
    
    public void setNtTrab1(double nt1){
        NtTrab1 = nt1;
    }
    
    public double getNtTrab1(){
        return (NtTrab1);
    }
    
    public void setNtTrab2(double nt2){
        NtTrab2 = nt2;
    }
    
    public double getNtTrab2(){
        return (NtTrab2);
    }
    
    
    public void setMediaProva(double mp){
        MediaProva = mp;
    }
    
    public double getMediaProva(){
        return (MediaProva);
    }
    
    public void setMediaTrab(double mt){
        MediaTrab = mt;
    }
    
    public double getMediaTrab(){
        return (MediaTrab);
    }
    
    public double calcMediaProva(){
        return  0.75 * ((NtPrv1 + 2 * NtPrv2) / 3);
    }
    
    public double calcMediaTrab(){
        return 0.25 *((NtTrab1 + NtTrab2) / 2) ;
    }
    
    public double calcMediaFinal(){
        return calcMediaProva() + calcMediaTrab();
    }
    
}
