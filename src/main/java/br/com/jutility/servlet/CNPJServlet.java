package br.com.jutility.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jutility.util.CNPJUtil;

/**
 * Servlet implementation class CNPJServlet
 */
@WebServlet(name="/CNPJServlet", urlPatterns={"/jsp/cnpj.do"})
public class CNPJServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CNPJServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cnpj, msg, jspDestination = "/jsp/validateCNPJ.jsp";
		CNPJUtil cnpjService = new CNPJUtil();
		
		cnpj = request.getParameter("cnpj");
		
		if(cnpjService.validatesCNPJ(cnpj))
			msg = "CNPJ v‡lido!";
		else
			msg = "CNPJ inv‡lido!";
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher(jspDestination).forward(request, response);
	}

}
