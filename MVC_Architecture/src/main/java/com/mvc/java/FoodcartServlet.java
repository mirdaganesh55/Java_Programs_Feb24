package com.mvc.java;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodcartServlet
 */
public class FoodcartServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    public FoodcartServlet() {
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			FoodDAOImpl dao = new FoodDAOImpl();
			try {
				List<Food> foodList =dao.getFoodList();
				request.setAttribute("fooditems", foodList);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RequestDispatcher d = request.getRequestDispatcher("showFood.jsp");
			d.include(request, response);
	}

}
