package cn.qianshu.yan.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import cn.qianshu.yan.entity.User;
import cn.qianshu.yan.repository.UserRepository;

@Component
public class CustomUserService implements UserDetailsService {
	
protected Log log = LogFactory.getLog(getClass());
	
    @Autowired
    UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		log.info("登录用户user:" + username);
		User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        
        log.info("登录用户user:" + user.getUsername());
        log.info("登录用户user:" + user.getRoles());
        return user;
    }

}
