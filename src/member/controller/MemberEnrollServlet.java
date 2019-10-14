package member.controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.vo.Member;

/**
 * Servlet implementation class MemberEnrollServlet
 */
@WebServlet("/enroll")
public class MemberEnrollServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberEnrollServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//회원 가입 처리용 컨트롤러
		request.setCharacterEncoding("UTF-8");
		
		Member member = new Member();
		
		member.setUserId(request.getParameter("userid"));
		member.setTypeNumber(Integer.parseInt(request.getParameter("typenumber")));
		member.setUserName(request.getParameter("username"));
		member.setUserPwd(request.getParameter("username"));
		member.setPhone(request.getParameter("phone"));
		member.setEmail(request.getParameter("email"));
		member.setGender(request.getParameter("gender"));
		
	/*	String birthStr = request.getParameter("birth");
		SimpleDateFormat birthForm = new SimpleDateFormat("yyyy-MM-dd");
		Date birth = (Date) birthForm.parse(birthStr);
		member.setBirth(birth);*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
