package poo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccesoBdd
 */
@WebServlet("/AccesoBdd")
public class AccesoBdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccesoBdd() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * PARA REALIZAR UNA PRUEBA DE CONEXIÓN A BASES DE DATOS TENGO QUE CREAR EL
		 * SERVLET INDICANDO EL NOMBRE DE LA CLASE ME POSICIONO EN EL MÉTODO DOGET Y
		 * INDICO LOS DATOS DE CONEXIÓN JDBC, USER, PASSWORD Y DRIVER EN TEORÍA SI USO
		 * LA VERSIÓN 8 DEL JDBC, TENGO QUE INDICAR com.mysql.cj.jdbc.Driver CON LA D
		 * MAYUSCULA SI NO INDICO com.mysql.jdbc.Driver EN UN TRY INTENTO CONECTARME SI
		 * LO CONSIGO IMPRIMO UN MENSAJE DE INFORMACIÓN SI NO CAPTURA EL ERROR
		 */

		PrintWriter out = null;
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		String jdbc = "jdbc:mysql://localhost:3306/biblioteca_2022";
		String user = "root";
		String password = "";
		String driver = "com.mysql.cj.jdbc.Driver"; // para versión 8 de JDBC
		// String driver = "com.mysql.jdbc.Driver"; //para viejas versiones
		try {
			out = response.getWriter();

			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(jdbc, user, password);
			out.println("Conectado");
			conexion.close();

		} catch (ClassNotFoundException e) {
			out = response.getWriter();
			out.print("No se encuentra la clase Driver.\nEs probable que lo hayas escrito mal. No olvides poner la D en mayúscula." + driver +"\nError:" + e);
		} catch (SQLException e) {
			out.print("No se ha podido conectar con la BDD " + jdbc + "\nAcceso denegado con estos credenciales.\nError: " + e);
		} catch (Exception e) {
			out.print("Problema desconocido " + e);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
