package pe.com.jroa.court.service;

import java.util.List;

import pe.com.jroa.court.domain.Member;

public interface MemberService {
	public void add(Member member);
	public void remove(String memberName);
	public List<Member> list();
}
