package estacionamento;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author epifa
 */
public abstract class Carro  {
    protected int codigo;
    protected String placa; 
    protected int anofabr;
    protected String modelo;
    protected boolean status;
    protected String vendedor;
    
    public Carro(){
     status = true;
     vendedor = " ";
     modelo = " ";
     placa = " ";
     
    }
     public Carro(int codigo, String placa, int anofabr, String modelo){
     this.codigo = codigo;
     this.placa = placa;
     this.anofabr = anofabr;
     this.modelo = modelo;
     this.status = true;
     this.vendedor = " ";
     
     }
     
     
     
     
    
    
    
    
        public boolean disponivel(){
    if (getStatus() == true ){
       return true;
    }
    else{
    
        return false;
    }
    }
    
        
    public abstract void imprimeDados();
    
        
  
        
        
    
    public abstract boolean oferta(double valor);
    
    
    
    public abstract boolean venderCarro(String Vendedor,double valorVenda);
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnofabr() {
        return anofabr;
    }

    public void setAnofabr(int anofabr) {
        this.anofabr = anofabr;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getStatus() {
        return status;
    }



    public String getVendedor() {
        return vendedor;
    }

   
    
    
}
