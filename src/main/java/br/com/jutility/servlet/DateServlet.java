package br.com.jutility.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jutility.util.DateUtil;

/**
 * Servlet implementation class DateServlet
 */
@WebServlet(name="/DateServlet", urlPatterns={"/jsp/date.do"})
public class DateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DateServlet() {
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
		String date, msg, jspDestination = "/jsp/validateDate.jsp";
		DateUtil dateService = new DateUtil();
		
		date = request.getParameter("date");
		
		if(dateService.validateDate(date)){
			msg = "Date v‡lida!";
		}else{
			System.out.println("Date Inv‡lida!!!!/n");
			msg = "Date inv‡lida!";
		}
		
		request.setAttribute("msg", msg);
		request.getRequestDispatcher(jspDestination).forward(request, response);
	}

}
