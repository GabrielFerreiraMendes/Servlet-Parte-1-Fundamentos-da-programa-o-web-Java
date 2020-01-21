package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

@WebServlet(urlPatterns = "/oi")
public class OiMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {

		PrintWriter out = res.getWriter();

		out.println("<html>");
		out.println("<body>");
		out.println(" Oi mundo, parabens você escreveu o primeiro servlet!");
		out.println("</body>");
		out.println("</html>");

		System.out.println("O servlet OiMundoServlet foi chamado.");

	}

}
