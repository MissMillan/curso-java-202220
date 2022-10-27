package curso.java.math;

import java.util.Arrays;
import java.util.Scanner;

import curso.java.funciones.Utils;

public class EjercicioDados {

	  public static void main(String[] args) {
		    
		    int numCaras =6;
		  
		    int numTiradas = Integer.parseInt(Utils.pideValor("Cuantas veces debo tirar el dado ? "));
		    int[] tiradasDado = new int[numTiradas];
		    int numAlto =0;
		    int numBajo=0;
		    int total =0;
		    
		    for(int i =0; i < tiradasDado.length;i++) {
		    	int tirada = tirarDado(numTiradas);
		    	tiradasDado[i] = tirada;
		    	total += tirada;
		    	numAlto = Math.max(tirada, numAlto);
		    	numBajo = Math.min(tirada, numBajo);
		    }
		    //le paso el array que quiero visualizar y lo convierto a string
			 System.out.println(Arrays.toString(tiradasDado));
		     System.out.println("El numero mas alto : "+ numAlto);
		     System.out.println("El numero mas bajo : "+ numBajo);
		     System.out.println("La media es : "+ (total/numTiradas));
			
			//-------------------------------------------------

			
	  }
	  
	  //------------------------------------------------------------------------
	  static int tirarDado(int numCaras) {
		  //Aqui he tirado los dados y he sacado los numeros obtenidos
		 double random = Math.random();
		 System.out.println("esto es el random" + random);
		 int tirada = (int)Math.ceil((numCaras * random));
			System.out.println( "esto es el  math con el ceil " +  (int)Math.floor( Math.random()));
		  
		  return tirada;
	  }
}
