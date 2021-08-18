package com.oracle.springProject01.dao.ljwDao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.springProject01.model.AttachmentFile;
import com.oracle.springProject01.model.AttachmentFileVO;
import com.oracle.springProject01.model.Lhj_MemberVO;
import com.oracle.springProject01.model.Member;

@Repository("LjwDao")
public class MemberDaoImpl implements MemberDao {
	@Autowired
	private SqlSession session;

	@Override
	public List<Member> listMember(Member member) {
		List<Member> listMember = null;
		System.out.println("MemberDaoImpl Start listMember...");
		try {
			listMember = session.selectList("ljwListMember", member);
		} catch (Exception e) {
			System.out.println("MemberDaoImpl listMember Exception->" + e.getMessage());
		}
		return listMember;
	}

	@Override
	public int total() {
		int tot = 0;
		System.out.println("MemberDaoImpl Start total...");
		try {
			// session -> Mapper ID total 호출
			tot = session.selectOne("ljwTotal");
			System.out.println("MemberDaoImpl Start total...");
		} catch (Exception e) {
			System.out.println("MemberDaoImpl total Exception->" + e.getMessage());
		}
		return tot;
	}

	@Override
	public int masterauth(String m_id) {
		int tot = 0;
		System.out.println("MemberDaoImpl Start masterauth...");
		try {
			tot = session.update("ljwUpdate", m_id);
		} catch (Exception e) {
			System.out.println("MemberDaoImpl masterauth Exception->" + e.getMessage());
		}
		return tot;
	}

//	@Override
//	public List<AttachmentFileVO> test(String attachmentFileVO) {
//		List<AttachmentFileVO> list = null;
//		System.out.println("MemberDaoImpl Start test...");
//		try {
//			session.insert("ljwInsert", attachmentFileVO);
//		} catch (Exception e) {
//			System.out.println("MemberDaoImpl test Exception->" + e.getMessage());
//		}
//		return list;
//	}

//	@Override
//	public int test2(AttachmentFileVO attachmentFileTest) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public List<AttachmentFileVO> test(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int test2(AttachmentFile attachmentFileTest) {
		int test = 0;
		System.out.println("MemberDaoImpl Start test2...");
		try {
			test = session.insert("ljwInsert", attachmentFileTest);
		} catch (Exception e) {
			System.out.println("MemberDaoImpl test2 Exception->" + e.getMessage());
		}
		return test;
	}

	@Override
	public List<AttachmentFile> check(AttachmentFile attachmentFile) {
		List<AttachmentFile> check = null;
		System.out.println("MemberDaoImpl check test2...");
		try {
			check = session.selectList("ljwCheck", attachmentFile);
		} catch (Exception e) {
			System.out.println("AttachmentFileDaoImpl check Exception->" + e.getMessage());
		}
		return check;
	}

	@Override
	public int user_delete(String m_id) {
		int delete = 0;
		System.out.println("MemberDaoImpl user_delete Start");
		try {
			delete = session.update("ljwDelete", m_id);
		} catch (Exception e) {
			System.out.println("MemberDaoImpl user_delete Exception->" + e.getMessage());
		}
		return delete;
	}

	@Override
	public List<Member> auth_listMember(Member member) {
		System.out.println("MemberDaoImpl auth_listMember Start");
		List<Member> auth_listMember = null;
		try {
			auth_listMember = session.selectList("auth_listMember", member);
		} catch (Exception e) {
			System.out.println("MemberDaoImpl auth_listMember Exception->" + e.getMessage());
		}
		return auth_listMember;
	}

	@Override
	public int a_total() {
		System.out.println("MemberDaoImpl a_total Start");
		int a_total = 0;
		try {
			a_total = session.selectOne("ljwA_Total");
		} catch (Exception e) {
			System.out.println("MemberDaoImpl a_total Exception->" + e.getMessage());
		}
		return a_total;
	}

}
