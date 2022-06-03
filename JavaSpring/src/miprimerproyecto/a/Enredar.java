package miprimerproyecto.a;

public class Enredar {

	public static void main(String[] args) {
		int num = 0;
		String palabra = "Una phrase con vocales";
		System.out.println(palabra.indexOf('a'));
		System.out.println(palabra.indexOf('e'));
		System.out.println(palabra.indexOf('i'));

		for (int x = 0; x < palabra.length(); x++) {
			if ((palabra.charAt(x) == 'a')) {
				num++;
			}
		}
		
		System.out.println("Número de A" + num);num = 0; 
		for (int x = 0; x < palabra.length(); x++) {
			if ((palabra.charAt(x) == 'e')) {
				num++;
			}
		}
		System.out.println("Número de E" + num);
//
//		int comp[] = new int[6];
//
//	
//		
//			switch (mot.charAt(i)) {
//			case 'a':
//				comp[0]++;
//				break;
//			case 'A':
//				comp[0]++;
//				break;
//			case 'e':
//				comp[1]++;
//				break;
//			case 'E':
//				comp[1]++;
//				break;
//			case 'i':
//				comp[2]++;
//				break;
//			case 'I':
//				comp[2]++;
//				break;
//			case 'o':
//				comp[3]++;
//				break;
//			case 'O':
//				comp[3]++;
//				break;
//			case 'u':
//				comp[4]++;
//				break;
//			case 'U':
//				comp[4]++;
//				break;
//			case 'y':
//				comp[5]++;
//				break;
//			case 'Y':
//				comp[5]++;
//				break;
//			}
//		}
//		System.out.println(comp[0] + " fois la lettre a");
//		System.out.println(comp[1] + " fois la lettre e");
//		System.out.println(comp[2] + " fois la lettre i");
//		System.out.println(comp[3] + " fois la lettre o");
//		System.out.println(comp[4] + " fois la lettre u");
//		System.out.println(comp[5] + " fois la lettre y");
	}

}
