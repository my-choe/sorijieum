package quit.model.service;

import static common.JDBCTemplate.close;
import static common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import quit.model.dao.QuitDao;
import quit.model.vo.Quit;

public class QuitService {
	
	//의존성 주입
	public QuitDao qDao = new QuitDao();
	
	public QuitService() {}
	
	
	//관리자 서비스****************************************
	// 관리자 탈퇴회원 전체 조회용
	public ArrayList<Quit> selectAll(){
		Connection conn = getConnection();
		ArrayList<Quit> list = qDao.selectAll(conn);
		close(conn);
		return list;
	}
	
	// 관리자 탈퇴회원 검색 조회용
	public ArrayList<Quit> selectQuitMemberSearch(String membertype, String userid, String quittype){
		return null;
	}
	
	// 관리자 이용자 탈퇴회원 신규회원(Sysdate) 검색용
	public ArrayList<Quit> selectQuitUserSysdate(){
		Connection conn = getConnection();
		ArrayList<Quit> quitUList = qDao.selectQuitUserSysdate(conn);
		close(conn);
		return quitUList;
	}
	
// 관리자 제작자 탈퇴회원 신규회원(Sysdate) 검색용
	public ArrayList<Quit> selectQuitMakerSysdate(){
		Connection conn = getConnection();
		ArrayList<Quit> quitMList = qDao.selectQuitMakerSysdate(conn);
		close(conn);
		return quitMList;
	}

}
