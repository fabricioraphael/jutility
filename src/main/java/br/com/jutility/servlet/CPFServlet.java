package br.com.jutility.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jutility.util.CPFUtil;

/**
 * Servlet implementation class CPFServlet
 */
@WebServlet(name="/CPFServlet", urlPatterns={"/jsp/cpf.do"})
public class CPFServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CPFServlet() {
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
		String cpf, msg, jspDestination = "/jsp/validateCPF.jsp";
		CPFUtil cpfService = new CPFUtil();
		
		cpf = request.getParameter("cpf");
		
		if(cpfService.validateCPF(cpf)){
			msg = "CPF v‡lido!";
		}else
			msg = "CNPJ inv‡lido!";
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher(jspDestination).forward(request, response);
	}

}
