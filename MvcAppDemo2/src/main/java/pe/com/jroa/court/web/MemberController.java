package pe.com.jroa.court.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pe.com.jroa.court.domain.Member;
import pe.com.jroa.court.service.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	private MemberService memberService;
	
	@Autowired
	public MemberController(MemberService memberService){
		this.memberService = memberService;
	}
	
	@RequestMapping("add")
	public String addMember(Model model){
		model.addAttribute("members", new Member());
		model.addAttribute("guests", memberService.list());
		return "memberList";
	}
	
	@RequestMapping(value={"remove","delete"}, method= RequestMethod.GET)
	public String removeMember(@RequestParam("memberName") String memberName){
		memberService.remove(memberName);
		return "redirect:";
	}
	
	@RequestMapping("display/{user}")
	public String removeMember(
			@RequestParam("memberName") String memberName,
			@PathVariable("user") String user
			){
		return "";
	}
	
	@RequestMapping
	public void memberList(){
		
	}
	
	public void memberLogic(String memberName){
		
	}
	
	@RequestMapping(value="processUser", method= RequestMethod.POST)
	public String submitForm(@ModelAttribute("member") Member member,
								BindingResult result,
								Model model){
		return "";
	}
}

