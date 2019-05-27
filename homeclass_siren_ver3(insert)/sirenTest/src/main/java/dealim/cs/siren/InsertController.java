<<<<<<< HEAD
package dealim.cs.siren;

import javax.inject.Inject;


import dealim.cs.siren.bean.TestBean;
import dealim.cs.siren.sevice.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertController {
    
    @Inject
    TestService service;
    
    @RequestMapping(value = "/insert",method = RequestMethod.POST )
    public String insertControllerPost(TestBean test, Model model) throws Exception{
        System.out.println("/siren/insert/ POST방식");
        System.out.println(test.toString());
        
        service.user_insert(test);//오류
        
        model.addAttribute("result", "성공");
        
        return "/succes";
    }
    
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    	public void insertControllerGet(TestBean test, Model model) throws Exception{
        System.out.println("/siren/insert/ GET방식");
       
    }
    
    
=======
package dealim.cs.siren;

import javax.inject.Inject;


import dealim.cs.siren.bean.TestBean;
import dealim.cs.siren.sevice.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class InsertController {
    
    @Inject
    TestService service;
    
    @RequestMapping(value = "/insert",method = RequestMethod.POST )
    public String insertControllerPost(TestBean test, Model model) throws Exception{
        System.out.println("/siren/insert/ POST방식");
        System.out.println(test.toString());
        
        service.user_insert(test);//오류
        
        model.addAttribute("result", "성공");
        
        return "/succes";
    }
    
    @RequestMapping(value = "/insert",method = RequestMethod.GET)
    	public void insertControllerGet(TestBean test, Model model) throws Exception{
        System.out.println("/siren/insert/ GET방식");
       
    }
    
    
>>>>>>> 3d7f0d00237b3cbfd5e754bbf7676b2b0da9e90c
}