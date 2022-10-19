package org.kai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JspServlet
 */
@WebServlet("/city-tour")
public class JspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public JspServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(1);
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<head>");
		out.println("<title>CSS Template</title>");
		out.println("<meta charset=\"/utf-8\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		out.println("<style>");
		out.println("* {");
		out.println("  box-sizing: border-box;");
		out.println("}");
		out.println("");
		out.println("body {");
		out.println("  font-family: Arial, Helvetica, sans-serif;");
		out.println("}");
		out.println("");
		out.println("/* Style the header */");
		out.println("header {");
		out.println("  background-color: #666;");
		out.println("  padding: 30px;");
		out.println("  text-align: center;");
		out.println("  font-size: 35px;");
		out.println("  color: white;");
		out.println("}");
		out.println("");
		out.println("/* Create two columns/boxes that floats next to each other */");
		out.println("nav {");
		out.println("  float: left;");
		out.println("  width: 30%;");
		out.println("  height: 300px; /* only for demonstration, should be removed */");
		out.println("  background: #ccc;");
		out.println("  padding: 20px;");
		out.println("}");
		out.println("");
		out.println("/* Style the list inside the menu */");
		out.println("nav ul {");
		out.println("  list-style-type: none;");
		out.println("  padding: 0;");
		out.println("}");
		out.println("");
		out.println("article {");
		out.println("  float: left;");
		out.println("  padding: 20px;");
		out.println("  width: 70%;");
		out.println("  background-color: #f1f1f1;");
		out.println("  height: 300px; /* only for demonstration, should be removed */");
		out.println("}");
		out.println("");
		out.println("/* Clear floats after the columns */");
		out.println("section::after {");
		out.println("  content: ;");
		out.println("  display: table;");
		out.println("  clear: both;");
		out.println("}");
		out.println("");
		out.println("/* Style the footer */");
		out.println("footer {");
		out.println("  background-color: #777;");
		out.println("  padding: 10px;");
		out.println("  text-align: center;");
		out.println("  color: white;");
		out.println("}");
		out.println("");
		out.println(
				"/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */");
		out.println("@media (max-width: 600px) {");
		out.println("  nav, article {");
		out.println("    width: 100%;");
		out.println("    height: auto;");
		out.println("  }");
		out.println("}");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("");
		out.println("<h2>CSS Layout Float " + name + "</h2>");
		out.println(
				"<p>In this example, we have created a header, two columns/boxes and a footer. On smaller screens, the columns will stack on top of each other.</p>");
		out.println(
				"<p>Resize the browser window to see the responsive effect (you will learn more about this in our next chapter - HTML Responsive.)</p>");
		out.println("");
		out.println("<header>");
		out.println("  <h2>Cities " + email + "</h2>");
		out.println("</header>");
		out.println("");
		out.println("<section>");
		out.println("  <nav>");
		out.println("    <ul>");
		out.println("      <li><a href=\"#\">London</a></li>");
		out.println("      <li><a href=\"#\">Paris</a></li>");
		out.println("      <li><a href=\"#\">Tokyo</a></li>");
		out.println("    </ul>");
		out.println("  </nav>");
		out.println("  ");
		out.println("  <article>");
		out.println("    <h1>London</h1>");
		out.println(
				"    <p>London is the capital city of England. It is the most populous city in the  United Kingdom, with a metropolitan area of over 13 million inhabitants.</p>");
		out.println(
				"    <p>Standing on the River Thames, London has been a major settlement for two millennia, its history going back to its founding by the Romans, who named it Londinium.</p>");
		out.println("  </article>");
		out.println("</section>");
		out.println("<footer>");
		out.println("  <p>Footer " + phone + "</p>");
		out.println("</footer>");
		out.println("");
		out.println("</body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
