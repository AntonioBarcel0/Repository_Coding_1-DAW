package switchcases_ud3;

public class IMC {
	
	public static void main (String [] args) {
		int peso = 80;
		double estatura = 1.80;
		double IMC = peso/Math.pow(estatura, 2);
		
		System.out.println("La persona tiene un peso de " + peso + "kilogramos y estatura es igual a " + estatura + "metros");
		
		if (IMC < 16) {
			System.out.println("La persona tiene delgadez severa ");
		} else if (IMC < 17) {
			System.out.println("La persona tiene delgadez moderada ");
		}else if (IMC < 18.5) {
			System.out.println("La persona tiene delgadez leve ");
		}else if (IMC < 25) {
			System.out.println("La persona tiene peso normal");
		}else if (IMC < 30) {
			System.out.println("La persona tiene sobrepeso");
		}else if (IMC < 35) {
			System.out.println("La persona tiene obesidad leve");
		}else if (IMC < 40) {
			System.out.println("La persona tiene obesidad moderada");
		}else  {
			System.out.println("La persona tiene obesidad mórbida");
		}
			
	}

}
