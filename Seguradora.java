package SEGURADORA;


/**
 * Gestao de Seguros de uma Empresa Seguradora.
 * Esta classe implementa a base de dados, da Seguradora usando
 * uma Hashtable.
 * 
 * @author (RND) 
 * @version (2010)
 */

 import java.util.*;
 import java.io.*;
 import java.lang.*;
 import java.lang.reflect.*;
 
 public class Seguradora {
     
 //variáveis de instância
     private String titular;       
     private HashMap bdEmpresas;     
  
     
 
 //CONSTRUTORES
    public Seguradora() { 
       this.titular="";  
       this.bdEmpresas = new HashMap();
    }    
  
    public Seguradora(Seguros seg) {
       bdEmpresas = new HashMap();
       bdEmpresas.put(seg.getTitular(),seg);
    }
   
    
      
 //Métodos de instância
            
    /**[ok]
     * Regista um titular.     
     * 
     * @param  seguros
     **/     
       
       public void registaTitular(Seguros s) {                
        this.bdEmpresas.put(s.getTitular(),s.clone());
       }
     
     
     //[ko] ta mal 
    /**
     * Consultar seguros de um titular
     *
     * @return Seguros        
     **/     
     public Vector consultaTitular(String titular) throws SegurosException {
         Vector se = new Vector();  
         Seguros c = (Seguros) this.bdEmpresas.get(titular);
           Vector res;
           try {
            res = c.getSeguros();
               }
         catch (NullPointerException e) {
            throw new SegurosException("titular nao existe!");
              }
        return res;
       }
     
         
     //[ko] tá mal   
     /**
     * consulta titular
     *
     * @return vector        
     **/
    // public boolean haTitular(Seguros s,String titular) {  
    //   return s.existeTitular(titular); 
    // }
     
      
    
        
    
     
     
     /**[ok]
     * lista seguros na hashtable
     *
     * @return Seguros        
     **/
     public Vector lstSeguros(Seguros s) {
       return s.getSeguros();
     }
     
        
     /**[ok]
     * Total de seguros na hashtable
     *
     * @return         
     **/ 
     public int totalSeguros(Seguros s) { 
        return s.segurosVeiculo();
     }
     
     
     /**
      *  
      *  
      **/  
    //ta mal  
    public Seguros get_titular(String titular)  {
        Seguros prod;
        
        prod = (Seguros) bdEmpresas.get(titular);
        return (Seguros) prod;
    }  
   
   //ta mal
   public void remove_titular(String titular) {
        get_titular(titular);
        bdEmpresas.remove(new String(titular));
    }
    
    
     
     
    /**
     * Ler ficheiro
     *
     * @return ficheiro        
     **/  
     
    
    
    
 
    
    
    
   
    
          
 //Interface Standard
    
  /** clone */  
 /* public Object clone() {
         Seguradora copia = new Seguradora(); 
         return copia;
  }    
  
 */
 
  public Object clone() {
        return (Object) new Seguradora();
    }
    
 
  /** ToString */ 
  public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append(this.bdEmpresas.toString());
        return sb.toString();
    }
     
 }  
 
    
/*  
 public String toString() {
    String tmp=new String("Seguradora: "+ "\n");
    Enumeration e=bdEmpresas.element();
    Enumeration c=bdEmpresas.keys();
    while(e.hasMoreElements()) {
                        Object t=e.nextElement();
                        Object k=c.nextElement();
   tmp=tmp+new String("Chave: " + k.toString() + "-> " 
                                + t.toString()+" \n ");
                }
   return tmp;
   }  
 
  
  public String toString() {
       StringBuffer sb = new StringBuffer("SEGURADORA:");
       
       sb.append(this.bdEmpresas.toString());
       return sb.toString();
  }
 
  
   public String toString() {
      String sb = new String("Seguradora"); 
      
     //sb=this.vectorVeic.toString();
      
       Enumeration enume=bdEmpresas.elements();
        while(enume.hasMoreElements()){
            Veiculos veic=(Veiculos)enume.nextElement();        
            System.out.println(veic.toString());            
        }      
      return sb.toString();
    }

     
  public String toString() {
    Seguros s;
    StringBuffer fichaTxt = new StringBuffer();
   
    for(Iterator i = bdEmpresas.values().iterator(); i.hasNext();) {
        s = (Seguros) i.next();
        fichaTxt.append(s.toString());
    }
    return fichaTxt.toString();
  }
 
      
  public String toString() {
    String tmp=new String("Seguradora: "+ "\n");
    Enumeration e=bdEmpresas.element();
    Enumeration c=bdEmpresas.keys();
    while(e.hasMoreElements()) {
                        Object t=e.nextElement();
                        Object k=c.nextElement();
   tmp=tmp+new String("Chave: " + k.toString() + "-> " 
                                + t.toString()+" \n ");
                }
   return tmp;
   }
 
 
  public String toString() {
    StringBuffer sb=new StringBuffer("Seguradora:");
   
    sb.append(this.bdEmpresas.toString());
    return sb.toString(); 
  }

*/  
   
  