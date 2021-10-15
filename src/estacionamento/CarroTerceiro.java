/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamento;

/**
 *
 * @author epifa
 */
public class CarroTerceiro extends Carro{
    protected String proprietario;
    protected float valordesejado;
    
    
    
    public CarroTerceiro(){
    super();
   proprietario = " ";
    }
    
    
    public CarroTerceiro(int codigo, String placa, int anofabr, String modelo,
                        String proprietario,float valordesejado){
    
    super(codigo,placa,anofabr,modelo);
    this.proprietario = proprietario;
    this.valordesejado = valordesejado;
    }
    
    
    
    
    
    
      @Override
  public boolean oferta(double valor){
    if(valor > this.valordesejado+(this.valordesejado*0.05)){
    return true;
    }    
  
  return false;
  }


  
  
  
    
  @Override
  public boolean venderCarro(String Vendedor, double valorVenda){
  if(getStatus() == false || oferta(valorVenda) == false){
       System.out.println("Oferta não aceita ou carro indisponível" );
     return false;
  }
      
  else{  
  super.vendedor = Vendedor;
  super.status = false;
System.out.println("Carro vendido com sucesso\n" + "Vendido por:" + vendedor + "\n" +
                  "Valor da venda:" + valorVenda + "\n");
        return true;
  }
  }
  
  
  
  
  
  
         @Override
    public void imprimeDados(){
    
     
    
        if(status == false){
            System.out.println("CARRO INDISPONÍVEL\n" + "Vendido por:" + vendedor + "\n");
        }
      
        else{
           System.out.println("Codigo do carro:"  + codigo + "\n" + "Placa do carro:" + 
                           placa + "\n"+ "Ano do carro:" + anofabr + "\n" +  
                           "Modelo:" + modelo +"\n" + "Proprietario do carro:" + 
                            proprietario + "\n" + "Valor desejado:" + valordesejado + "\n");
        }
    }
  
  
    

    
    
    
    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public float getValordesejado() {
        return valordesejado;
    }

    public void setValordesejado(float valordesejado) {
        this.valordesejado = valordesejado;
    }
    

}