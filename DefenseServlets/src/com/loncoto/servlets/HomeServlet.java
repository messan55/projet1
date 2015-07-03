package com.loncoto.servlets;

import java.io.IOException;
import java.io.PipedWriter;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet({ "/Home", "/Index" })
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public int compteur;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        compteur = 0;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("appel de la methode");
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><head><title>bonjour</title></head>");
		pw.println("<body><h2> bonjour nous sommes le" + new Date() + "</h2></body></html>");
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		compteur++;
		System.out.println("appel de la methode post home : compteur = " + compteur);
		String nom = request.getParameter("nom");
		String mdp = request.getParameter("mdp");
		
		System.out.println("j'ai recu le login = " + nom + " avec mdp " + mdp);
		
		if(mdp.length() < 4){
			getServletContext().getRequestDispatcher("/error.jsp").forward(request, response);;
		}
		else{
			String message = "bienvenue " + nom;
			request.setAttribute("message", message);
			getServletContext().getRequestDispatcher("/bienvenue.jsp").forward(request, response);
		}	
	}

}
