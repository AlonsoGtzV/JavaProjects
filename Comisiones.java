import java.util.Scanner;
public class Comisiones{
	public static void main(String[] args){
		double sumaT=0;
		
		try (Scanner valor = new Scanner(System.in)) {
			for(int i=1; i<=4; i++){
				System.out.println("ingrese el valor del artículo "+i);
				double artN = valor.nextDouble();
				sumaT = sumaT+(artN*0.09);
							
			}
		}
		sumaT = sumaT+200;
		System.out.println("Los ingresos semanales fueron: "+sumaT);	

	}
}