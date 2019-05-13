package SEGURADORA;


/**
 * Classe para todas as categorias de seguros de veiculos : 
 * Particulares,Publicos ou de Carga. 
 * 
 * @author (RND) 
 * @version (2010)
 */

import java.util.*;
import java.lang.*;

 public class Veiculos {
    
   //variaveis de classe
    private static int totalSeguros;  
  
   //variaveis de instancia
    
    private int codigo;        //codigo do titular
    private String empresa;       //fidelidade,bonanca,acoreana ...
    private String categVeiculo;
    private String titular;       //nome do cliente
    private String moradaTitular;
    private int biTitular,nifTitular;
    private String precoAnual; 
    private String descObje;     //descricao de objecto.
    
    
        
 //Construtores

    /** Construtor simples */
    public Veiculos() {
     this.incSeguros();   
     this.titular="";
     this.codigo=0;
     this.empresa="";
     this.categVeiculo="";     
     this.moradaTitular="";
     this.biTitular=0;
     this.nifTitular=0;
     this.precoAnual="";
     this.descObje=""; 
    }
    
    /** Construtor com parãmetros */
    public Veiculos(String nomeCl,int cod,String emp,String catVei,String morCl,
            int biCl,int nifCl,String prAn,String desOb) {   
     this.incSeguros();
     this.titular=nomeCl;
     this.codigo = cod;
     this.empresa=emp;
     this.categVeiculo=catVei;     
     this.moradaTitular=morCl;
     this.biTitular=biCl;
     this.nifTitular=nifCl;
     this.precoAnual=prAn;
     this.descObje=desOb;
    }
    
    
   //Métodos de classe
    protected static void incSeguros(){
        totalSeguros++;
    }
    
    protected static void decSeguros(){
        totalSeguros--;
    }
    
    protected static int getTotalSeguros(){
        return totalSeguros;
    }
 
    
    
   //Métodos de instância
 
    /**
     * Saber o codigo de um titular
     * 
     * @return   o codigo do seguro de um titular
     **/
     public int getCodigo() {
        return this.codigo;
     }
     
     /**
     * Saber o nome da empresa
     * 
     * @return     o codigo do seguro de um titular
     **/
     public String getEmpresa() {
        return this.empresa;
     }
     
    /**
     * Saber a categoria de veiculo 
     * 
     * @return     a categoria de veiculo
     **/     
     public String getCategVeiculo() {
        return this.categVeiculo;
     }
         
     /**
     * Saber o nome de um titular
     * 
     * @return   nome de um titular
     **/     
     public String getTitular() {
        return this.titular;
     } 
        
     /**
     * Saber a morada de um titular
     * 
     * @return     a morada de um titular
     **/
     public String getMoradaTitular() {
        return this.moradaTitular;
     }
          
     /**
     * Saber BI de um titular
     * 
     * @return     o BI de um titular
     **/
     public int getBITitular() {
        return this.biTitular;
     }
     
     /**
    * Criar o codigo do seguro de um titular
    *
    * @return codigo
    */  
    public int getCod() {
     return this.codigo;    
    }
     
     /**
     * Saber NIF de um titular
     * 
     * @return     o NIF de um titular
     **/
     public int getNifTitular() {
        return this.nifTitular;
     }
     
          
     /**
     * Saber preco anual a pagar pelo titular
     * 
     * @return     o preco anual a pagar pelo titular
     **/
     public String getPrecoAnual() {
        return this.precoAnual;
     }     
     
     
     /**
     * Saber descricao do objecto do seguro
     * 
     * @return     descricao do objecto do seguro
     **/
     public String getDescObje() {
        return this.descObje;
     }
 
     
 //Modificadores 
     
     public void titular(String nome){ 
        this.empresa=nome; 
     } 
 
 
 
           
 //Implementação da interface Standard
    
    /** clone */
   /* public Object clone() {
        Veiculos veic = new Veiculos(this.getTitular(),        
                                     this.getCod(),
                                     this.getEmpresa(), 
                                     this.getCategVeiculo(),                                    
                                     this.getMoradaTitular(),
                                     this.getBITitular(),
                                     this.getNifTitular(),
                                     this.getPrecoAnual(),
                                     this.getDescObje()); 
        return veic;
    }*/
    
    
    public Object clone() {
        Veiculos veic = new Veiculos(this.titular,
                                     this.codigo,
                                     this.empresa,
                                     this.categVeiculo,
                                     this.moradaTitular,
                                     this.biTitular,
                                     this.nifTitular,
                                     this.precoAnual,
                                     this.descObje);
        return veic;
    }
        
    
    
    
   /** ToString */             
     public String toString() {
      StringBuffer accaoTxt = new StringBuffer();
      accaoTxt.append("\n");
      accaoTxt.append("TITULAR:\t");
      accaoTxt.append(titular + "\n");
      accaoTxt.append("CODIGO:\t\t");
      accaoTxt.append(codigo + "\n");
      accaoTxt.append("EMPRESA:\t");
      accaoTxt.append(empresa + "\n");    
      accaoTxt.append("CategVEICULO:\t");
      accaoTxt.append(categVeiculo + "\n");
      accaoTxt.append("MORADA:\t\t");
      accaoTxt.append(moradaTitular + "\n");
      accaoTxt.append("BI:\t\t");
      accaoTxt.append(biTitular + "\n");
      accaoTxt.append("NIF:\t\t");
      accaoTxt.append(nifTitular + "\n");
      accaoTxt.append("PRECO ANUAL:\t");
      accaoTxt.append(precoAnual + "\n");
      accaoTxt.append("DESCRICAO:\t");
      accaoTxt.append(descObje + "\n");
     // accaoTxt.append("\n\n");
      
      return accaoTxt.toString();
   }
     
         
   /** equals*/    
   public boolean equals(Object param) {
          if( (param == null) || !(param instanceof Veiculos) )
           return false;
         else 
           return (this.toString()).equals(param.toString());
     }     
 }
   
   
            
 