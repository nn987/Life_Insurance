package SEGURADORA;


/**
 * class auxiliar que testa os metodos da class Seguros.
 * 
 * @author (RND) 
 * @version (2010)
 */

import java.util.*;

public class TestesSeguros {


 
 public static void main(String args[]){
 //  Vector vect=new Vector();
     String titular;            
      
     Veiculos car = new Veiculos("Ricardo",
                                 123,
                                 "fid",
                                 "Ligeiro",
                                 "Braga",
                                  7786262,
                                  00310123,
                                  "12341",
                                 "amarelo" );
                                                               
                                 
    Veiculos car2 = new Veiculos("Guilherme",
                                  123,
                                 "fid",
                                 "Ligeiro",
                                 "Braga",
                                  7786262,
                                  00310123,
                                  "12341",
                                 "amarelo" );                             
   
   
  //insercao de dados no Vector (estrutura de dados usada) 
    Seguros vect=new Seguros(car);
      
    vect.setTitular(car); 
    vect.setTitular(car2); 
    
    System.out.println(vect.toString());
 
     
 //total de seguros
	System.out.println("Numero de Seguros="+vect.segurosVeiculo());
    System.out.println("===================\n");
    
              
   Vector v = new Vector();
  

  // System.out.println(vect.lstSeguro(vect)); 
 //  System.out.println(vect.getTitular());
  // System.out.println(car.getTitular());
  
  
         
  }	
 }          

