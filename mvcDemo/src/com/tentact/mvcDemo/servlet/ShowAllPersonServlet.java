package com.tentact.mvcDemo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tentact.mvcDemo.service.PersonService;

/**
 * Servlet implementation class ShowAllPerson
 */
@WebServlet("/ShowAllPersonServlet")
public class ShowAllPersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PersonService service = new PersonService();      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllPersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		request.setAttribute("elist", service.getAllPerson());
		request.getRequestDispatcher("success.jsp").forward(request, response);
	}

}
