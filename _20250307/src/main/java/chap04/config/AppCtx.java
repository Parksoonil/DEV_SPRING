package chap04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import chap04.spring.ChangePasswordService;
import chap04.spring.MemberDao;
import chap04.spring.MemberInfoPrinter;
import chap04.spring.MemberListPrinter;
import chap04.spring.MemberPrinter;
import chap04.spring.MemberRegisterService;

@Configuration
public class AppCtx {

	@Bean
	public MemberDao memberDao() {
		return new MemberDao();
	}
	
	@Bean
	public MemberRegisterService memberRegSvc() {
		return new MemberRegisterService();
	}
	
	@Bean
	public ChangePasswordService changePwdSvc() {
		return new ChangePasswordService();
	}
	
	@Bean
	public MemberPrinter memberPrinter() {
		return new MemberPrinter();
	}
	@Bean
	public MemberListPrinter listPrinter() {
		return new MemberListPrinter();
	}
	
	@Bean
	public MemberInfoPrinter infoPrinter() {
		MemberInfoPrinter infoPrinter = new MemberInfoPrinter();
		return infoPrinter;
	}
}
