/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] numeros = {5,8,12,20,7};
	    int suma = 0;
	    
	    //accion 1 : observar la accion inicial
	    
	    for (int i= 0 ;i< numeros.length;i++){
	        suma+= numeros[i];
	        //accion 2: Inspeccionar el valor de cada suma en cada Interaccion
	        System.out.println("Interaccion :"+i+" . suma parcial: "+suma);
	    }
	    
	    double promedio = calcularPromedio(suma,numeros.length);
	    // accion 3 : revisar el valor de promedio 
	    System.out.println("Promedio = "+promedio);
	    
	    
	    int mayor = encontrarMayor(numeros);
	    // accion 4: encontrar el valor mayor
	    
	    System.out.println("Numero Mayor = " + mayor);
	    
	    // accion 5 : confirmar el resultado final
	    
	    System.out.println("Resultados finales -> Suma: "+suma+" .Promedio: "+promedio+" .Mayor: "+mayor);
	    
	}
	
	public static double calcularPromedio(int suma, int cantidad){
	    return (double) suma / cantidad;
	}
	
	
	public static int encontrarMayor(int[] arreglo){
	    
	    int mayor = arreglo[0];
	    
	    for (int num : arreglo){
	        if(num > mayor){
	            mayor = num;
	        }
	    }
	    
	    
	    
	    return mayor;
	}
	
	
	
	
	
}