package br.com.jutility.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jutility.util.EmailUtil;

/**
 * Servlet implementation class EmailServlet
 */
@WebServlet(name="/EmailServlet", urlPatterns={"/jsp/email.do"})
public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailServlet() {
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
		String email, msg, jspDestination = "/jsp/validateEmail.jsp";
		EmailUtil emailService = new EmailUtil();
		
		email = request.getParameter("email");
		
		if(emailService.validateEmail(email))
			msg = "E-mail v‡lido!";
		else
			msg = "E-mail inv‡lido!";
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher(jspDestination).forward(request, response);
	}

}
