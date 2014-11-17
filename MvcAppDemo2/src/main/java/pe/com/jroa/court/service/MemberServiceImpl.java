package pe.com.jroa.court.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import pe.com.jroa.court.domain.Member;

public class MemberServiceImpl implements MemberService {

	private Map<String, Member> members = new TreeMap<String, Member>();
	
	@Override
	public void add(Member member) {
		members.put(member.getName(), member);
	}

	@Override
	public void remove(String memberName) {
		members.remove(memberName);
	}

	@Override
	public List<Member> list() {
		return new ArrayList<Member>(members.values());
	}

}
