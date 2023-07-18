package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmpDao;
import Model.Employee;

/**
 * Servlet implementation class EmpController
 */
@WebServlet("/EmpController")
public class EmpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String action = request.getParameter("action");
		
		if (action.equalsIgnoreCase("register")) {
			Employee emp = new Employee();
			emp.setName(request.getParameter("name"));
			emp.setContact(Long.parseLong(request.getParameter("contact")));
			emp.setEmail(request.getParameter("email"));
			emp.setPassword(request.getParameter("password"));
			emp.setAddress(request.getParameter("address"));
			emp.setGender(request.getParameter("gender"));
			System.out.println(emp);
			EmpDao.insertEmp(emp);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
