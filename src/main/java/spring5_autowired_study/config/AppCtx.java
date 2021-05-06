package spring5_autowired_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring5_autowired_study.di.ChangePasswordService;
import spring5_autowired_study.di.MemberDao;
import spring5_autowired_study.di.MemberInfoPrinter;
import spring5_autowired_study.di.MemberListPrinter;
import spring5_autowired_study.di.MemberPrinter;
import spring5_autowired_study.di.MemberRegisterService;
import spring5_autowired_study.di.VersionPrinter;

@Configuration
public class AppCtx {
	
	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	
	@Bean
	public VersionPrinter versionPrinter() {
		VersionPrinter versionPrinter = new VersionPrinter();
		versionPrinter.setMajorVersion(5);
		versionPrinter.setMinorVersion(0);
		return versionPrinter;
	}
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter( );
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		return  new MemberInfoPrinter();
		}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}
	@Bean
	public ChangePasswordService changePwdSvc() {
		return new ChangePasswordService() ;
	}
	
}
