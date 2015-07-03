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
@WebServlet({ "/Home"})
public class CalculPrixKilo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CalculPrixKilo() {
        super();
    }

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
		System.out.println("appel de la methode post home");
		String prix = request.getParameter("prix");
		String poids = request.getParameter("poids");
		String quantite = request.getParameter("quantite");
		
		System.out.println("le prix = " + prix + " et le poids = " + poids + " et la quantité = " + quantite);
		
		double prixFinal = Integer.parseInt(prix) * Integer.parseInt(poids);
		if(Integer.parseInt(quantite) > 10){
			prixFinal -= (prixFinal * 10 / 100);
		}
		
		String message = "le prix final = " + prixFinal;
		request.setAttribute("message", message);
		getServletContext().getRequestDispatcher("/calcul.jsp").forward(request, response);
			
	}

}
