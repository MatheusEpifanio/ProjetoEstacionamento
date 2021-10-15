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
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    CarroProprio cp1;
    
    cp1 = new CarroProprio(456546,"fba-1619",2020,"Porche",500000,"19/09");
    cp1.imprimeDados();
    System.out.println("Veículo esta disponível->" + (cp1.disponivel() ? "Sim":"Não")); 
    System.out.println("Oferta foi aceita ->" + (cp1.oferta(600000)?"Sim":"Não") + "\n");
    cp1.venderCarro("Jorge", 600000);
    cp1.imprimeDados();
    
     
     CarroTerceiro ct1;
     ct1 = new CarroTerceiro(454564,"fwe-2649",1976,"Fusca","Paulo",15000);
     ct1.imprimeDados();
     System.out.println("Veículo esta disponível->" + (ct1.disponivel() ? "Sim":"Não")); 
     System.out.println("Oferta foi aceita ->" + (ct1.oferta(15800)?"Sim":"Não") + "\n");
     ct1.venderCarro("Roberta", 15800);
     ct1.imprimeDados();
    }
    
}
