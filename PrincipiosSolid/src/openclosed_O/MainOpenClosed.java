package openclosed_O;

import java.util.ArrayList;
import java.util.Arrays;

import solid_S.Impresiones;

public class MainOpenClosed {

	/**
	 * Este principio establece que una entidad de software (clase, módulo, función,
	 * etc) debe quedar abierta para su extensión, pero cerrada para su
	 * modificación.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * S OpenClosed L I D
		 * 
		 * Con abierta para su extensión, nos quiere decir que una entidad de software
		 * debe tener la capacidad de adaptarse a los cambios y nuevas necesidades de
		 * una aplicación, pero con la segunda parte de “cerrada para su modificación”
		 * nos da a entender que la adaptabilidad de la entidad no debe darse como
		 * resultado de la modificación del core de dicha entidad si no como resultado
		 * de un diseño que facilite la extensión sin modificaciones.
		 * 
		 * Las ventajas que nos ofrece diseñar el código aplicando este principio es un
		 * software más fácil de mantener al minimizar los cambios en la base de código
		 * de la aplicación y de ampliar funcionalidades sin modificar partes básicas de
		 * la aplicación probadas, a su vez evita generar nuevos errores en
		 * funcionalidades que ya estaban desarrolladas, probadas y funcionando
		 * correctamente.
		 * 
		 * También vemos las ventajas a la hora de implementar test unitarios en nuestro
		 * software, el aplicar este principio nos ayudará a no tener que modificar
		 * dichos tests cada vez que se mejore y amplíe el código, mejorando la
		 * fiabilidad de nuestra base de código, y solo teniendo que crear nuevos test
		 * para las nuevas funcionalidades implementadas.
		 * 
		 * Para afianzar estos conceptos veamos a continuación un ejemplo en código
		 * sobre cómo aplicar este principio.
		 * 
		 * Tenemos una clase Calculos que se encarga de devolvernos el cálculo
		 * del área de un polígono, el método getArea recibe como parámetro un objeto de
		 * tipo Polygono. Polygono es la clase padre de la que extienden todos los
		 * polígonos en nuestra aplicación y tiene una propiedad type que nos diferencia
		 * el tipo de polígono que es para realizar un cálculo del área apropiado, en
		 * este ejemplo utilizaremos el cuadrado y el círculo.
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
