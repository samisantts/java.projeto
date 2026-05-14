package Metodos;
import java.util.Scanner;
public class MassaCorporal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
     
		double altura ;
		double peso;
		
		
		
		System.out.print("Qual sua altura");
		  altura = sc.nextDouble();
		  System.out.print("Qual seu peso?"); 
		   peso = sc.nextDouble();
		   
		   double resultado = calcularIMC(peso,altura);
		   System.out.println("calculo imc: " + resultado);
		   String result = classificacao (resultado);
				   System.out.print("resultado " + result);
;		   
	}	
		
			
	
	public static double calcularIMC (double peso, double altura){
		double result;
	  result = peso/(altura * altura);
	   return result ;
	   
	}
	
	   public static String classificacao (double imc) {
		   
		   String result = "sem classificacao"; 
		        if (imc < 18.5) {
		            result =  "Baixo peso";
		        } else if (imc < 25.0) {
		        	result =  "Peso normal";
		        } else if (imc < 30.0) {
		        	result =  "Sobrepeso";
		        }
		        
		        return result;
		    }

		 
		 sc.close(); 
		   
	}

