package SEGURADORA;


/**
 * Classe que grava e le de ficheiros.
 * 
 * @author (RND) 
 * @version (2010)
 */

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

 public class Ficheiros {

/** Escrever em ficheiro de texto */
	public void outText(String fn) throws IOException {
		PrintWriter pr = new PrintWriter(new BufferedWriter(new FileWriter(fn)));
		
		pr.println(this.toString());
		pr.close();
	}

	/** Ler de ficheiro de texto */
	public static SGC inText(String fn) throws IOException, SGCException {
		SGC res = new SGC();
		BufferedReader br = new BufferedReader(new FileReader(fn));
		StringTokenizer st, staux;
		String s = br.readLine();  
		Comprador c;		

		if (!s.equals("SGC:"))
			throw new SGCException("Ficheiro "+fn+"[erro]!");

		s = br.readLine();
		res.setTotalGasto(Float.valueOf(s).doubleValue());

		s = br.readLine();
		res.setPreço(Float.valueOf(s).doubleValue());

		s = br.readLine();
		st = new StringTokenizer(s, "{,=}");
		br.close();    
			
		while (st.hasMoreTokens()) {
			st.nextToken();    			// avançar chave
			try {
				c = Comprador.valueOf(st.nextToken());
				res.registaComprador(c);
			}
			catch (NoSuchMethodException e) {}
			catch (IllegalAccessException e) {}
			catch (ClassNotFoundException e) {}
			catch (InvocationTargetException e) {}
		}
		return res;
	}
}