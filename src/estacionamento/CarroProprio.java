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
public class CarroProprio extends Carro{
    protected  float valorpago; 
    protected String datacompra; 
    
    
    public CarroProprio(){
    super();
    datacompra = " ";
    }
    
    public CarroProprio(int codigo, String placa, int anofabr, String modelo,
                        float valorpago, String datacompra){
    super(codigo,placa, anofabr, modelo);
    this.valorpago = valorpago;
    this.datacompra = datacompra;
        }
    
    
    
    
    
    @Override 
          
    public void imprimeDados(){
    
    
    
        if(status == false){
            System.out.println("CARRO INDISPONÍVEL\n" + "Vendido por:" + vendedor + "\n");
        }
        else{
            System.out.println("Codigo do carro:"  + codigo + "\n" + "Placa do carro:" + 
                           placa + "\n"+ "Ano do carro:" + anofabr + "\n" +  
                           "Modelo:" + modelo + "\n" + "Valor pago:" + valorpago
                            + "\n" + "Data da compra:" + datacompra + "\n");
        }  
    
    }
    
    
    
    
  @Override
  public boolean oferta(double valor){
    if(valor > this.valorpago+(this.valorpago*0.1)){
    return true;
    }    
  
  return false;
  }

  
  
  
  
  
  
  
  @Override
  public boolean venderCarro(String Vendedor, double valorVenda){
  if(getStatus() == false || oferta(valorVenda) == false){
      System.out.println("Oferta não aceita ou carro indisponível");
      return false;
  }
      
  else if(getStatus() == true && oferta(valorVenda) == true)  
  super.vendedor = Vendedor;
  super.status = false;
System.out.println("Carro vendido com sucesso\n" + "Vendido por:"+ vendedor +"\n"+
                  "Valor da venda:" + valorVenda + "\n");
        return true;
  
  } 

  
  
  
  
  
  
    public float getValorpago() {
        return valorpago;
    }

    public void setValorpago(float valorpago) {
        this.valorpago = valorpago;
    }

    public String getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(String datacompra) {
        this.datacompra = datacompra;
    }
  
  

  
    




}
