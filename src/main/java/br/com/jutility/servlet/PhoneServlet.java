package br.com.jutility.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jutility.util.PhoneUtil;

/**
 * Servlet implementation class PhoneServlet
 */
@WebServlet(name="/PhoneServlet", urlPatterns={"/jsp/phone.do"})
public class PhoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PhoneServlet() {
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
		String phone, msg, jspDestination = "/jsp/validatePhone.jsp";
		PhoneUtil phoneService = new PhoneUtil();
		
		phone = request.getParameter("phone");
		
		if(phoneService.validatePhone(phone))
			msg = "Phone V‡lido!";
		else
			msg = "Phone Inv‡lido!";
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher(jspDestination).forward(request, response);
	}

}	
