/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.controladores;

import com.sinensia.modelo.Persona;
import com.sinensia.modelo.logica.ServicioPersona;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
public class ControladorPersonasServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nombre = request.getParameter("nombre"); // Name del INPUT
		//String edad = request.getParameter("edad");
		
		Persona p = ServicioPersona.getInstancia().getPersona(nombre);
		request.getSession().setAttribute("resultadoBusq", p);
		request.getRequestDispatcher("resultados_busq.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) // PARA AÑADIR
			throws ServletException, IOException {
		//request.getSession().setMaxInactiveInterval(60);
		String nombre = request.getParameter("nombre"); // Name del INPUT
		String edad = request.getParameter("edad");
		
		try{
			Persona p = ServicioPersona.getInstancia().addPersonas(nombre, edad);

			if(p == null){
				request.getRequestDispatcher("error.jsp").forward(request, response);
			}else
				request.getRequestDispatcher("exito.jsp").forward(request, response);
		} catch(NumberFormatException ex){
			request.getSession().setAttribute("mensajeError","Error numerico " + ex.getMessage());
			request.getRequestDispatcher("error.jsp").forward(request, response);			
		} catch(IllegalArgumentException ex){
			request.getSession().setAttribute("mensajeError","Error en campo " + ex.getMessage());
			request.getRequestDispatcher("error.jsp").forward(request, response);	
		} catch(Exception ex){
			request.getSession().setAttribute("mensajeError","Error generico " + ex.getMessage());
			request.getRequestDispatcher("error.jsp").forward(request, response);	
		}
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Short description";
	}// </editor-fold>

}
