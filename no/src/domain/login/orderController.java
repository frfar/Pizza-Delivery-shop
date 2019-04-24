package domain.login;
//import package UI;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.StringUtils;


 

@WebServlet("/orderController")
public class orderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public orderController() {}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PizzaDao PizzaDao = new PizzaDao();
		Pizza p = new Pizza();
		
		String submitType = request.getParameter("submitt");
		//if(submitType.equals("order")) {
		String numbah = request.getParameter("ordah1");
		String numbah2 = request.getParameter("ordah2");
		String numbah3 = request.getParameter("ordah3");
		//request.getRequestDispatcher("Checkout.jsp").forward(request, response);
		//if(numbah != null) {
		
		int x = isANumber(numbah);
		int x1 = isANumber(numbah2);
		int x2 = isANumber(numbah3);
		
		
		p.setPepp(x);
		p.setM(x1);
		p.setV(x2);
		
		PizzaDao.order(p);
		
		double y = calcPrice(x, x1, x2);
		System.out.println(y);
		System.out.println("Hello");
	//	String theOrder = request.getParameter("ord");
		//if(submitType.equals("ProceedToCheckout")){
		
		request.setAttribute("message", "$"+y);
		request.getRequestDispatcher("Checkout.jsp").forward(request, response);
		//}
		String message = successMessage(request.getParameter("submit") != null);
		request.setAttribute("message", message);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}
	
	protected double calcPrice(int x, int y, int z) {
		double price = ((x * 10) + (y * 9) + (z * 9));
		price = price * 1.0825;
		return price;
	}
	
	protected String successMessage(boolean submit) {
		if (submit) {
			return "Order confirmed!";
		}
		else {
			return "Order failed!";
		}
	}
	
	protected int isANumber(String x) {
		if (StringUtils.isStrictlyNumeric(x)) {
			return Integer.parseInt(x);
		}
		else {
			return 0;
		}
	}
	
}

