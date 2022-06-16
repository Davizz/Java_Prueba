package com.David.crud.config;

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
 * Servlet implementation class PruebaConexión
 */
@WebServlet("/PruebaConexión")
public class PruebaConexión extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PruebaConexión() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = null;
		String jdbc = "jdbc:mysql://localhost:3306/biblioteca";
		String user = "root";
		String password = "";
		String driver = "com.mysql.cj.jdbc.Driver"; //Para versisones JDBC 8 O SUPERIOR
		//String driver = "com.mysql.jdbc.Driver"; Para versisones JDBC 8 O SUPERIOR

		
		try {
			out = response.getWriter();
			
			Class.forName(driver);
			Connection conexion = DriverManager.getConnection(jdbc, user, password);
			out.println("Conectado");
			
			conexion.close();
			
	}catch (ClassNotFoundException e) {
		out = response.getWriter();
		out.print("No se encuentra la clase Driver. \nEs posible que lo hayas escrito mal." + 
				"\nNo olvides poner la D en mayúscula." + driver + "\nerror" + e);
				
	}catch (SQLException e) {
		out.print("No se ha podido conectar con la BBDD." + jdbc + 
				"\nAcceso denegado con esos credenciales." + driver + "\nerror" + e);
	
		}catch (Exception e) {
			out.print("Problema desconocido" + e);
		
	}}

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
