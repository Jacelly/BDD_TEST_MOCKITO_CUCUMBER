package Calculadora_PracticaTotal;
import java.util.Scanner;


public class InterfazCalculadora {
	private static Scanner sm;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calculadora=new Calculadora();
        sm = new Scanner(System.in);
        boolean salir = false;
        while(!salir){
            System.out.println("***BIENVENIDO***");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. Salir");
            System.out.println("Escribe una de las opciones:\t");
            String opcion = sm.next();
            if(isNumeric(opcion)){
                switch(Integer.parseInt(opcion)){
                    case 1:
                    	sm = new Scanner(System.in);
                        System.out.println("SUMA");
                        Boolean bandera=true;
                        System.out.println("Ingrese un valor: ");
                        String valor1 = sm.next();
                        while(bandera) {
                            if(isDouble(valor1)){
                            	bandera=false;
                            }
                        }
                        System.out.println("Ingrese segundo valor: ");
                        String valor2 = sm.next();
                        while(bandera) {
                            if(isDouble(valor2)){
                            	bandera=false;
                            }
                        }
                        Double resultado=calculadora.getSuma(Double.parseDouble(valor1), Double.parseDouble(valor2));
                        System.out.println("El resultado es: "+resultado);
                        break;
                    case 2:
                        System.out.println("RESTA");
                        sm = new Scanner(System.in);
                        Boolean bandera1=true;
                        System.out.println("Ingrese un valor: ");
                        String valor3 = sm.next();
                        while(bandera1) {
                            if(isDouble(valor3)){
                            	bandera1=false;
                            }
                        }
                        System.out.println("Ingrese segundo valor: ");
                        String valor4 = sm.next();
                        while(bandera1) {
                            if(isDouble(valor4)){
                            	bandera1=false;
                            }
                        }
                        Double resultado1=calculadora.getResta(Double.parseDouble(valor3), Double.parseDouble(valor4));
                        System.out.println("El resultado es: "+resultado1);
                        break;
                    case 3:
                    	System.out.println("Multiplicación");
                        sm = new Scanner(System.in);
                        Boolean bandera2=true;
                        System.out.println("Ingrese un valor: ");
                        String valor5 = sm.next();
                        while(bandera2) {
                            if(isDouble(valor5)){
                            	bandera2=false;
                            }
                        }
                        System.out.println("Ingrese segundo valor: ");
                        String valor6 = sm.next();
                        while(bandera2) {
                            if(isDouble(valor6)){
                            	bandera2=false;
                            }
                        }
                        Double resultado2=calculadora.getMultiplicacion(Double.parseDouble(valor5), Double.parseDouble(valor6));
                        System.out.println("El resultado es: "+resultado2);
                        break;
                    case 4:
                        salir=true;
                        break;
                     default:
                        System.out.println("Solo numeros entre 1 y 4");
                }
            }else{
                System.out.println("Solo numeros entre 1 y 4");
            }

        }

	}
	private static boolean isNumeric(String cadena){
	        try {
	                Integer.parseInt(cadena);
	                return true;
	        } catch (NumberFormatException nfe){
	                return false;
	        }
	}
	
	private static boolean isDouble(String cadena){
        try {
                Double.parseDouble(cadena);
                return true;
        } catch (NumberFormatException nfe){
                return false;
        }

	}

}
