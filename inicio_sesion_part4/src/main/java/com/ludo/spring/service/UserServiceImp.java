package com.ludo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ludo.spring.dao.UserDao;
import com.ludo.spring.model.User;

@Service("userDetailsService")
public class UserServiceImp implements UserDetailsService {

  @Autowired
  private UserDao userDao;

  @Transactional(readOnly = true)
  @Override
  public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

    User user = userDao.findUserByUsername(name);
    UserBuilder builder = null;
    if (user != null) {
      
      builder = org.springframework.security.core.userdetails.User.withUsername(name);
      builder.disabled(!user.isEnabled());
      builder.password(user.getPassword());
      String[] authorities = user.getRoles()
          .stream().map(a -> a.getAuthority()).toArray(String[]::new);

      builder.authorities(authorities);
    } else {
      throw new UsernameNotFoundException("Usuario no encontrado.");
    }
    return builder.build();
  }
}
