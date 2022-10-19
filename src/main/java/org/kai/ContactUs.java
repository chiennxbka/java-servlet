package org.kai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kai.mail.EmailService;

/**
 * Servlet implementation class ContactUs
 */
@WebServlet("/contact-us")
public class ContactUs extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ContactUs() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<head>																				");
		out.println("<meta charset=\"ISO-8859-1\">                                                      ");
		out.println("<title>Insert title here</title>                                                   ");
		out.println("<style>                                                                            ");
		out.println("body {                                                                             ");
		out.println("	background-color: #444442;                                                      ");
		out.println("	padding-top: 85px;                                                              ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("h1 {                                                                               ");
		out.println("	font-family: 'Poppins', sans-serif, 'arial';                                    ");
		out.println("	font-weight: 600;                                                               ");
		out.println("	font-size: 72px;                                                                ");
		out.println("	color: white;                                                                   ");
		out.println("	text-align: center;                                                             ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("h4 {                                                                               ");
		out.println("	font-family: 'Roboto', sans-serif, 'arial';                                     ");
		out.println("	font-weight: 400;                                                               ");
		out.println("	font-size: 20px;                                                                ");
		out.println("	color: #9b9b9b;                                                                 ");
		out.println("	line-height: 1.5;                                                               ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("/* ///// inputs /////*/                                                            ");
		out.println("input:focus ~ label, textarea:focus ~ label, input:valid ~ label,                  ");
		out.println("	textarea:valid ~ label {                                                        ");
		out.println("	font-size: 0.75em;                                                              ");
		out.println("	color: #999;                                                                    ");
		out.println("	top: -5px;                                                                      ");
		out.println("	-webkit-transition: all 0.225s ease;                                            ");
		out.println("	transition: all 0.225s ease;                                                    ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println(".styled-input {                                                                    ");
		out.println("	float: left;                                                                    ");
		out.println("	width: 293px;                                                                   ");
		out.println("	margin: 1rem 0;                                                                 ");
		out.println("	position: relative;                                                             ");
		out.println("	border-radius: 4px;                                                             ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("@media only screen and (max-width: 768px) {                                        ");
		out.println("	.styled-input {                                                                 ");
		out.println("		width: 100%;                                                                ");
		out.println("	}                                                                               ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println(".styled-input label {                                                              ");
		out.println("	color: #999;                                                                    ");
		out.println("	padding: 1.3rem 30px 1rem 30px;                                                 ");
		out.println("	position: absolute;                                                             ");
		out.println("	top: 10px;                                                                      ");
		out.println("	left: 0;                                                                        ");
		out.println("	-webkit-transition: all 0.25s ease;                                             ");
		out.println("	transition: all 0.25s ease;                                                     ");
		out.println("	pointer-events: none;                                                           ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println(".styled-input.wide {                                                               ");
		out.println("	width: 650px;                                                                   ");
		out.println("	max-width: 100%;                                                                ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("input, textarea {                                                                  ");
		out.println("	padding: 30px;                                                                  ");
		out.println("	border: 0;                                                                      ");
		out.println("	width: 100%;                                                                    ");
		out.println("	font-size: 1rem;                                                                ");
		out.println("	background-color: #2d2d2d;                                                      ");
		out.println("	color: white;                                                                   ");
		out.println("	border-radius: 4px;                                                             ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("input:focus, textarea:focus {                                                      ");
		out.println("	outline: 0;                                                                     ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("input:focus ~ span, textarea:focus ~ span {                                        ");
		out.println("	width: 100%;                                                                    ");
		out.println("	-webkit-transition: all 0.075s ease;                                            ");
		out.println("	transition: all 0.075s ease;                                                    ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("textarea {                                                                         ");
		out.println("	width: 100%;                                                                    ");
		out.println("	min-height: 15em;                                                               ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println(".input-container {                                                                 ");
		out.println("	width: 650px;                                                                   ");
		out.println("	max-width: 100%;                                                                ");
		out.println("	margin: 20px auto 25px auto;                                                    ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println(".submit-btn {                                                                      ");
		out.println("	float: right;                                                                   ");
		out.println("	padding: 7px 35px;                                                              ");
		out.println("	border-radius: 60px;                                                            ");
		out.println("	display: inline-block;                                                          ");
		out.println("	background-color: #4b8cfb;                                                      ");
		out.println("	color: white;                                                                   ");
		out.println("	font-size: 18px;                                                                ");
		out.println("	cursor: pointer;                                                                ");
		out.println("	box-shadow: 0 2px 5px 0 rgba(0, 0, 0, 0.06), 0 2px 10px 0                       ");
		out.println("		rgba(0, 0, 0, 0.07);                                                        ");
		out.println("	-webkit-transition: all 300ms ease;                                             ");
		out.println("	transition: all 300ms ease;                                                     ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println(".submit-btn:hover {                                                                ");
		out.println("	transform: translateY(1px);                                                     ");
		out.println("	box-shadow: 0 1px 1px 0 rgba(0, 0, 0, 0.10), 0 1px 1px 0                        ");
		out.println("		rgba(0, 0, 0, 0.09);                                                        ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("@media ( max-width : 768px) {                                                      ");
		out.println("	.submit-btn {                                                                   ");
		out.println("		width: 100%;                                                                ");
		out.println("		float: none;                                                                ");
		out.println("		text-align: center;                                                         ");
		out.println("	}                                                                               ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("input[type=checkbox]+label {                                                       ");
		out.println("	color: #ccc;                                                                    ");
		out.println("	font-style: italic;                                                             ");
		out.println("}                                                                                  ");
		out.println("                                                                                   ");
		out.println("input[type=checkbox]:checked+label {                                               ");
		out.println("	color: #f00;                                                                    ");
		out.println("	font-style: normal;                                                             ");
		out.println("}                                                                                  ");
		out.println("</style>                                                                           ");
		out.println("</head>                                                                            ");
		out.println("<body>                                                                             ");
		out.println("	<div class=\"container\">                                                         ");
		out.println("		<div class=\"row\">                                                           ");
		out.println("			<h1>contact us</h1>                                                     ");
		out.println("		</div>                                                                      ");
		out.println("		<div class=\"row\">                                                           ");
		out.println("			<h4 style=\"text-align: center\">We'd love to hear from you!</h4>         ");
		out.println("		</div>                                                                      ");
		out.println("       <form method=\"post\">");
		out.println("		<div class=\"row input-container\">                                           ");
		out.println("			<div class=\"col-xs-12\">                                                 ");
		out.println("				<div class=\"styled-input wide\">                                     ");
		out.println(
				"					<input type=\"text\" name = \"name\" required /> <label>Name</label>              ");
		out.println("				</div>                                                              ");
		out.println("			</div>                                                                  ");
		out.println("			<div class=\"col-md-6 col-sm-12\">                                        ");
		out.println("				<div class=\"styled-input\">                                          ");
		out.println(
				"					<input type=\"text\" name = \"email\" required /> <label>Email</label>             ");
		out.println("				</div>                                                              ");
		out.println("			</div>                                                                  ");
		out.println("			<div class=\"col-md-6 col-sm-12\">                                        ");
		out.println("				<div class=\"styled-input\" style=\"float: right;\">               ");
		out.println(
				"					<input type=\"text\" name=\"phone\" required> <label>Phone Number</label>      ");
		out.println("				</div>                                                              ");
		out.println("			</div>                                                                  ");
		out.println("			<div class=\"col-xs-12\">                                                 ");
		out.println("				<div class=\"styled-input wide\">                                     ");
		out.println(
				"					<textarea name=\"message\" required></textarea>                                  ");
		out.println("					<label>Message</label>                                          ");
		out.println("				</div>                                                              ");
		out.println("			</div>                                                                  ");
		out.println("			<div class=\"col-xs-12\">                                                 ");
		out.println("				<button class=\"btn-lrg submit-btn\" type=\"submit\">Send Message</button>");
		out.println("			</div>                                                                  ");
		out.println("		</div>                                                                      ");
		out.println("		</form>                                                                      ");
		out.println("	</div>                                                                          ");
		out.println("</body>                                                                            ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// xu ly send email
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		EmailService.sendMail(email, "Demo send mail with servlet",
				"Demo tinh nang gui email den ban " + name + ", So dien thoai la: " + phone);
		response.sendRedirect("city-tour?name=" + name + "&email=" + email + "&phone=" + phone);
	}
}
