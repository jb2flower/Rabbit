package dealim.cs.siren;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dealim.cs.siren.bean.TestBean;
import dealim.cs.siren.sevice.TestService;

public class IdDuplicationController {

	@Inject
	TestService service;
	//����� service�� inject(����)
	@RequestMapping(value="/login",method = RequestMethod.GET)//value�� ����Ʈ �ּ� /test �Է½� �̵�
	public String test(Model model) throws Exception {
		List<TestBean> list;		
		list = service.user_db();	
		model.addAttribute("list",list);	
		//DB���� �ҷ��� ���� Model�� ��´�.
		return "login";
	}
}
