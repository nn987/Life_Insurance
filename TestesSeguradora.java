package SEGURADORA;


/**
 * class de testes para a classe Seguradora.
 * 
 * @author (RND) 
 * @version (2010)
 */

import java.util.*;
import java.io.*;

public class TestesSeguradora {
    
    

    public static void main(String args[]){        
        
       Veiculos car = new Veiculos("Ricardo",
                                    123,
                                    "fid",
                                    "Ligeiro",
                                    "Braga",
                                    7786262,
                                    00310123,
                                    "12341",
                                    "Veiculo azul" );
                                 
       Veiculos car2 = new Veiculos("Guilherme",
                                    1235,
                                    "fid",
                                    "Ligeiro",
                                    "Braga",
                                    7786262,
                                    00310123,
                                    "12341",
                                    "amarelo" );
                                    
       Veiculos car3 = new Veiculos("Ricardo",
                                    1233,
                                    "fid",
                                    "Pesados de mercadorias",
                                    "Braga",
                                    7786262,
                                    00310123,
                                    "12341",
                                    "veiculo branco " );                                    
                                    
                                                                        
  //hash.registaSeguro(titular,seguro)                                   
                                    
   System.out.println("hastable" + "\n");  
       
   Seguros vect=new Seguros();
   Seguradora segurd = new Seguradora(vect);  
   
  // vect.setTitular(car); 
  // vect.setTitular(car2);
  // vect.setTitular(car3);
   
  // Seguradora segurd = new Seguradora(vect);     

  
    
    segurd.registaTitular(vect);
    
   //segurd.registaTitular(vect);
   //segurd.registaTitular(vect);
   //segurd.registaTitular(vect,car3);
    
    System.out.println(segurd.toString());

        
  //System.out.println("Seguros criados = "+car.getTotalSeguros()+"\t");
    
   //total de seguros na hashtable
   System.out.println("Numero de Seguros="+segurd.totalSeguros(vect));
   System.out.println("======================");   
    
               
   //Seguros na hashtable 
   //  System.out.println(segurd.lstSeguros(vect));
   //  Vector v = new Vector();
     
     
   //---------------------------  
   //Gravar ficheiro 
    Fich fich = new Fich();    
   
   String nomeficheiro="myfi";
                    try {
	                fich.guarda_fich(segurd,nomeficheiro);  	               
                    System.out.println("[ok]");  
                    } catch (IOException e) 
                        { System.out.println("[erro]");
                    }    
     
  //--------------------------
   //Ler ficheiro        
                    try {
                    segurd=fich.le_fich(nomeficheiro);                     
                    System.out.println("[ok]");  
                    } catch (IOException e) 
                        { System.out.println("[erro]");
                    }
                    catch(ClassNotFoundException e)
                        { System.out.println("[erro]");
                    }  
   //-------------------------
                    
   
                    
  //-------------------------- 
  
                    
 //    
  }
 }
  

     
   
 
        
    

