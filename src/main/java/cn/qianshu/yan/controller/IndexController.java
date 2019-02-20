package cn.qianshu.yan.controller;

import java.security.Principal;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.qianshu.yan.entity.User;

@Controller
public class IndexController {
	
	protected Log log = LogFactory.getLog(getClass());
	
    @RequestMapping("/hello")
    public String index() {
        return "Index";
    }
    
    @RequestMapping("/")
    public String index1(Principal user,Authentication authentication){
    	log.info("principle user:" + user.getName());
    	User userDetails = (User)authentication.getPrincipal();

        log.info("principle get user:" + userDetails.getUsername()+":authorities size:"+userDetails.getAuthorities().size()+""+userDetails.getRoles().size());
        
        return "my";
    }
    
    @RequestMapping("/deny")
    public String deny(){
        return "deny";
    }
    
    @RequestMapping("/test")
    public String test(){
        return "deny";
    }
}