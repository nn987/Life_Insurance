package SEGURADORA;


/**
 * Classe abstracta que implementa todas as caracteristicas comuns
 * dos seguros
 * 
 * @author (RND)
 * @version (2010)
 */

import java.util.*;
import java.lang.*;

public class Seguros {
    
    
     
    //variaveis de instancia
      private String titular;
      private int bi,nif,codigo;
       
      private Vector inforCasa;
      private Vector inforSaude;
      private Vector vectorVeic;
   
 
  //CONSTRUTORES

    /** Construtor simples de Seguros */
    public Seguros() {
          this.titular="";
      //  this.bi=0;
      //  this.nif=0;
      //  this.codigo=0;               
          this.vectorVeic = new Vector();      
     }
    
    
    /** 
     * Construtor com parâmetros
     *
     * infVei
     * @param Veiculos, Casa, Saude. 
     **/
     public Seguros(Veiculos infVei) {       
        this.vectorVeic= new Vector(); 
          for (int i=0; i<vectorVeic.size(); i++)
          vectorVeic.addElement(infVei.clone());
     }
            
         
  //Metodos de instancia 
  
    /**
     * Saber o número do BI.
     * 
     * @return bi
     */
     public int getBI() {
        return this.bi;
     }
         
    /**
     * Saber o titular.
     * 
     * @return titular
     */
      public String getTitular() {
        return this.titular;
      }
    
     
   //   public Vector getTitular() {
   //     return (Vector) vectorVeic.clone();
   //   }
  
    /**
     * Criar titular de um seguro
     * 
     * @param veiculo 
     */
      public void setTitular(Veiculos veiculo) { 
         vectorVeic.addElement(veiculo);
      }
     
     //nao usei
      public void insereTitular(String titular) {
        vectorVeic.addElement(titular);
      }
            
    
    /**
    * Total seguros de veiculo.
    * 
    * @return seguros
    **/
     public int segurosVeiculo() { 
        return vectorVeic.size();
     }
       
        
    
    //[ko] nao estou a usar
    /** 
     * Lista os dados contidos no vector.
     * 
     * @return res   
     **/
     public Vector getSeguros() {
        Vector res = new Vector();
           for(int i=0; i < this.vectorVeic.size(); i++)
             res.add(this.vectorVeic.elementAt(i));
           return res;
     }
     
          
    /**
	* 
	*                  
	* 
	**/
 
	
   
     
    /**
    * seguros de veiculo.
    * 
    * @return seguros
    **/
    public Vector lstSeguro(Seguros s) {
        return (Vector) vectorVeic.clone(); 
    }
     
    /*
    //ta mal
    public Vector carteiraASeguros (Vector s,String titular) {        
        Vector tmp = new Vector();
        Object temp;
        for(Iterator it = s.iterator(); it.hasNext();) {
            temp = it.next();
            if( (temp instanceof Veiculos) && 
                 (vectorVeic.contains.getTitular() 
                       vectorVeic.add.getTitular();
        }
        return s;
    } */
    
    //teste
   // public Vector listTitular (Vector s,String titular) {
    //  return vectorVeic.add( (Veiculos).getTitular());
   // }
    
    /*
     public Vector carteiraASeguros (Vector s,String titular) {
        Object temp;
        for(Iterator it = s.iterator(); it.hasNext();) {
            temp = it.next();
            if( (temp instanceof Veiculos) && 
                 !(vectorVeic.contains(((Seguros) temp).getTitular())) )
                       vectorVeic.add(((Seguros)temp).getTitular(), temp);
        }
        return temp;
    }
    */



   /**
	* existe titular  
	*                  
	* @return boolean	
	**/   
    public boolean existeTitular (String titular) {     
        return vectorVeic.contains(titular);                     
    }
    
    
    
			
    
  //INTERFACE STANDART
    
    /** clone */
   public Object clone() {
         Seguros copia = new Seguros(); 
     return copia;
    }      
    

    /**toString */  
    public String toString() {
      StringBuffer sb = new StringBuffer();       
       
       Enumeration enume=vectorVeic.elements();
		while(enume.hasMoreElements()){
			Veiculos veic=(Veiculos)enume.nextElement();  
	 		sb.append(veic.toString());
		}      
      return sb.toString();
     }
    
    /** equals */
  //public boolean equals(Object x);

  
/*      
   	public String toString () {
		StringBuffer sb = new StringBuffer();
		StringBuffer aux;

		sb.append(this.getSeguros());
		aux = new StringBuffer(this.getSeguros().toString());
					
		for (int i=0; i<aux.length(); i++)
			if (aux.charAt(i)==',')
				aux.setCharAt(i, ';');
		sb.append(aux.toString());
		return sb.toString();
	}


	
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append(this.vectorVeic);       
       return s.toString();
    }    

*/    
 }
