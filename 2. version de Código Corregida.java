/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    
	    // codigo corregido
	    // usando System.out.println para verificacion adicional
	    
	    int[] numeros = {5,8,12,20,7};
	    int suma = 0;
	    
	   try{
	       
	      System.out.println("Suma Actual: "+suma);
	    System.out.print("Lista de numeros: ");
	    for (int i= 0 ;i< numeros.length;i++){
	        if(i== 4 ){
	            System.out.println(numeros[i]);
	        }else{
	            System.out.print(numeros[i]+",");
	        }
	        
	    } 
	   }catch(Exception e){
	       
	       System.out.println("error 01");
	   } 
	    
	    
	    
	    //accion 1 : observar la accion inicial
	    
	    try{for (int i= 0 ;i< numeros.length;i++){
	        suma+= numeros[i];
	        //accion 2: Inspeccionar el valor de cada suma en cada Interaccion
	        System.out.println("Interaccion :"+i+1+" . suma parcial: "+suma);
	    }
	        
	    }catch(Exception e){System.out.println("error 02");}
	    
	    
	    
	    try{double promedio = calcularPromedio(suma,numeros.length);
	    // accion 3 : revisar el valor de promedio 
	    System.out.println("Promedio = "+promedio);
	        
	    }catch(Exception e){System.out.println("error 03");}
	    
	    
	    
	    
	    try{int mayor = encontrarMayor(numeros);
	    // accion 4: encontrar el valor mayor
	    
	    System.out.println("Numero Mayor = " + mayor);
	        
	    }catch(Exception e){System.out.println("error 04");}
	    
	    
	    
	    try{// accion 5 : confirmar el resultado final
	    
	    System.out.println("Resultados finales -> Suma: "+suma+" .Promedio: "+promedio+" .Mayor: "+mayor);
	        
	    }catch(Exception e){System.out.println("error 05");}
	    
	    
	}
	
	public static double calcularPromedio(int suma, int cantidad){
	    try{return (double) suma / cantidad;}catch(Exception e){System.out.println("error 06");}
	    
	}
	
	
	public static int encontrarMayor(int[] arreglo){
	    try{int mayor = arreglo[0];
	    
	    for (int num : arreglo){
	        if(num > mayor){
	            mayor = num;
	        }
	    }
	    
	    
	    
	    return mayor;}catch(Exception e){
	        System.out.println("error 07");
	    }
	    
	}
	
	
	
	
	
}