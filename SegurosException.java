package SEGURADORA;



 /**
 * Excep��es de Seguradora
 * 
 * @author RND
 */
public class SegurosException extends Exception {
	
	// Construtores

	/** Construtor simples */
	public SegurosException() { 
		super();
	}

	/** Construtor com mensagem */
	public SegurosException(String s) { 
		super(s);
	}
}

