package SEGURADORA;


/**
 * Write a description of class Teste here.
 * 
 * @author RND 
 * @version 2010
 */


import java.util.*;
import java.io.*;
import java.lang.*;

public class Teste {

    static String titular,empresa,categVeiculo,
                   moradaTitular,precoAnual,descObje,nomeficheiro;
    static int codigo,biTitular,nifTitular;
        
    private static Seguros vect=new Seguros();
    private static Seguradora segurd = new Seguradora();    
    private static Ficheiros fich = new Ficheiros();
    
    
        
    public static void main(String args[]) {
       
    int opção;          
        System.out.println("Empresa Seguradora");
        do {
            opção = menu();
            executa(opção);
        } while (opção !=0);
        System.out.println("fim!");
    }

    private static int menu() {
    int op;

    System.out.println(" ** Opções **");
    System.out.println("1 -  CRIAR TITULAR");
    System.out.println("2 -  TOTAL DE SEGUROS");
    System.out.println("3 -  LISTAR TODOS OS SEGUROS");
    System.out.println("4 -  CONSULTA TITULAR");
    System.out.println("5 -  ABRIR FICHEIRO");
    System.out.println("6 -  GRAVAR FICHEIRO");
    System.out.println("0 -  SAIR");
    
    do {
         op = Console.readInt("Opção: ");
         System.out.println("\n");
        } while (op<0 || 6<op);
        
        return op;
    }
    
    private static void executa(int op) {
  
                                          
        switch(op) {
            case 1:                                  
                    titular=Console.readString("titular -->");                    
                    codigo=Console.readInt("codigo --> ");
                    empresa=Console.readString("empresa --> ");
                    categVeiculo=Console.readString("categVeiculo -->");
                    moradaTitular=Console.readString("moradaTitular -->");
                    biTitular=Console.readInt("biTitular --> ");
                    nifTitular=Console.readInt("nifTitular --> ");
                    precoAnual=Console.readString("precoAnual -->");
                    descObje=Console.readString("descObje -->"); 
                    
                     
                    Veiculos car = new Veiculos(titular,codigo,empresa,categVeiculo,
                                                 moradaTitular,biTitular,nifTitular,
                                                 precoAnual,descObje);                                                                                                
                    
                   // Seguros vect=new Seguros(car);
                   // segurd.registaTitular(vect,car);
                    //vect.setTitular(car);
                    segurd.registaTitular(vect);
                    
                                                   //isto serve para limpar o ecran
                 
                    for (int i = 0; i <10; i++) {
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    }
                                                              
                    break;
                                                                                                                  
            case 2:                                                                                 
                    System.out.println("Total de seguros:"+segurd.totalSeguros(vect));                    
                    System.out.println("\n\n\n\n\n\n\n\n");
                    
                    break;
            
            case 3:                     
                    System.out.println("\n\n\n\n\n\n");                
                    System.out.println(segurd.lstSeguros(vect));
                                        
                    break; 
                    
            case 4: 
                  //  titular=Console.readString("titular -->");                   
                  //  System.out.println(segurd.consultaTitular(titular));
                 
                    
                    break;         
                    
            case 5: 
                    Seguradora tmp = new Seguradora(); 
                    nomeficheiro=Console.readString("ficheiro -->");
                    try {
                    tm=fich.le_fich(nomeficheiro);                     
                    System.out.println("[ok]");  
                    } catch (IOException e) 
                        { System.out.println("[erro]");
                    }
                    catch(ClassNotFoundException e)
                        { System.out.println("[erro]");
                    }
                    
                    break;
                    
            case 6: 
                    nomeficheiro=Console.readString("ficheiro -->");
                    try {
	                fich.guarda_fich(segurd,nomeficheiro);  	               
                    System.out.println("[ok]");  
                    } catch (IOException e) 
                        { System.out.println("[erro]");
                    }                                                                     
                    
                    break;      
                    
                }
    }
}
