package UI;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.login.CustomerDao;
import domain.login.CustomerDaoImpl;


public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public Menu() {}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		CustomerDao customerDao = new CustomerDaoImpl();
		String choice = request.getParameter("choice");
		String submitType = request.getParameter("submit");
		if(submitType.equals("choose") && choice!=null ){
			if(choice.contentEquals("1")) {
				request.setAttribute("message", "Hello ");
			}
		
		}
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	
}
}