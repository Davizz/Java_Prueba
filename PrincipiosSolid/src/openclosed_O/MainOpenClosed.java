package openclosed_O;

import java.util.ArrayList;
import java.util.Arrays;

import solid_S.Impresiones;

public class MainOpenClosed {

	/**
	 * Este principio establece que una entidad de software (clase, m�dulo, funci�n,
	 * etc) debe quedar abierta para su extensi�n, pero cerrada para su
	 * modificaci�n.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * S OpenClosed L I D
		 * 
		 * Con abierta para su extensi�n, nos quiere decir que una entidad de software
		 * debe tener la capacidad de adaptarse a los cambios y nuevas necesidades de
		 * una aplicaci�n, pero con la segunda parte de �cerrada para su modificaci�n�
		 * nos da a entender que la adaptabilidad de la entidad no debe darse como
		 * resultado de la modificaci�n del core de dicha entidad si no como resultado
		 * de un dise�o que facilite la extensi�n sin modificaciones.
		 * 
		 * Las ventajas que nos ofrece dise�ar el c�digo aplicando este principio es un
		 * software m�s f�cil de mantener al minimizar los cambios en la base de c�digo
		 * de la aplicaci�n y de ampliar funcionalidades sin modificar partes b�sicas de
		 * la aplicaci�n probadas, a su vez evita generar nuevos errores en
		 * funcionalidades que ya estaban desarrolladas, probadas y funcionando
		 * correctamente.
		 * 
		 * Tambi�n vemos las ventajas a la hora de implementar test unitarios en nuestro
		 * software, el aplicar este principio nos ayudar� a no tener que modificar
		 * dichos tests cada vez que se mejore y ampl�e el c�digo, mejorando la
		 * fiabilidad de nuestra base de c�digo, y solo teniendo que crear nuevos test
		 * para las nuevas funcionalidades implementadas.
		 * 
		 * Para afianzar estos conceptos veamos a continuaci�n un ejemplo en c�digo
		 * sobre c�mo aplicar este principio.
		 * 
		 * Tenemos una clase Calculos que se encarga de devolvernos el c�lculo
		 * del �rea de un pol�gono, el m�todo getArea recibe como par�metro un objeto de
		 * tipo Polygono. Polygono es la clase padre de la que extienden todos los
		 * pol�gonos en nuestra aplicaci�n y tiene una propiedad type que nos diferencia
		 * el tipo de pol�gono que es para realizar un c�lculo del �rea apropiado, en
		 * este ejemplo utilizaremos el cuadrado y el c�rculo.
		 */
		
		Circulo circle = new Circulo(5);
		Cuadrado square = new Cuadrado(6);
		Triangulo triangle = new Triangulo(30, 50);
		
		Calculos responsableCalculos = new Calculos();
		Impresiones responsableImpresion = new Impresiones();
		
		ArrayList<Poligono> formas = new ArrayList<Poligono>(Arrays.asList(circle, square, triangle));
		double result;
		for(Poligono forma : formas) {
			result = responsableCalculos.getArea(forma);
			responsableImpresion.imprimeResultado(result);
		}

	}

}
