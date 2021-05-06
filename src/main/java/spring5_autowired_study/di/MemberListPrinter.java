package spring5_autowired_study.di;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberListPrinter {
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	public MemberListPrinter() {
	}
	
	@Autowired
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}

	@Autowired
	@Qualifier("printer2")
	public void setPrinter(MemberPrinter memberPrinter) {
		this.printer = memberPrinter;
	}

	public void printAll() {
		Collection<Member> members = memberDao.selectAll();
		members.forEach(m-> printer.print(m));
	}
	
}
