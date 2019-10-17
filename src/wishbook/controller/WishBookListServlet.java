package wishbook.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import wishbook.model.service.WishBookService;
import wishbook.model.vo.WishBook;

/**
 * Servlet implementation class WishBookListServlet
 */
@WebServlet("/wblist")
public class WishBookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WishBookListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//신청도서 목록 페이징 포함 처리 컨트롤러
		int currentPage = 1;
		if(request.getParameter("page") != null) {
			currentPage = Integer.parseInt(request.getParameter("page"));
		}
		
		int limit = 5;  //한 페이지에 출력할 목록 갯수
		WishBookService wservice = new WishBookService();
		int listCount = wservice.getListCount(); //테이블의 전체 목록 갯수 조회
		//총 페이지수 계산
		int maxPage = listCount / limit;
		if(listCount % limit > 0)
			maxPage++;
		
		//currentPage가 속한 페이지그룹의 시작페이지숫자와 끝숫자 계산
		//예? 현재 34페이지이면 31~40이 됨 (페이지그룹의 수를 10개로 한 경우)
		int beginPage = (currentPage / limit) * limit + 1;
		int endPage = beginPage + (limit - 1); //+ 9
		if(endPage > maxPage)
			endPage = maxPage;
		
		//currentPage에 출력할 목록의 조회할 행 번호 계산
		int startnum = (currentPage * limit) - 4;
		int endnum = currentPage * limit;
		
		//조회할 목록의 시작행과 끝행 번호 전달하고 결과받기
		ArrayList<WishBook> list = wservice.selectWishBookList(startnum, endnum);
		RequestDispatcher view = null;
		if(list.size() > 0) {
			view = request.getRequestDispatcher("views/boardwishbook/wishbookListView.jsp");
			request.setAttribute("list", list);
			request.setAttribute("maxPage", maxPage);
			request.setAttribute("currentPage", currentPage);
			request.setAttribute("beginPage", beginPage);
			request.setAttribute("endPage", endPage);
			view.forward(request, response);	
		}else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", "도서 신청 전체 목록  조회 실패!");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
