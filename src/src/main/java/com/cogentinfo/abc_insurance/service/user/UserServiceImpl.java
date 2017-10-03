package com.cogentinfo.abc_insurance.service.user;

import com.cogentinfo.abc_insurance.exception.LoginException;
import com.cogentinfo.abc_insurance.model.Cart;
import com.cogentinfo.abc_insurance.model.UserDetails;
import com.cogentinfo.abc_insurance.model.UserLogin;
import com.cogentinfo.abc_insurance.repository.CartRepo;
import com.cogentinfo.abc_insurance.repository.UserDetailsRepo;
import com.cogentinfo.abc_insurance.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserLoginRepository userLoginRepository;
    @Autowired
    UserDetailsRepo userDetailsRepo;
    @Autowired
    CartRepo cartRepo;
    @Override
    public UserLogin checkLogin(String email, String password) {
        List<UserLogin> userLogins= userLoginRepository.findByEmail(email);
        if(userLogins!=null&&userLogins.size()>0)
            return userLogins.get(0);
        throw new LoginException("User Not Found");
    }

    @Override
    public UserLogin addUserLogin(String email, String password) {
        List<UserLogin> userLogins= userLoginRepository.findByEmail(email);
        if(userLogins!=null&&userLogins.size()>0)
            throw new LoginException("User already exists");
        UserLogin userLogin=new UserLogin();
        userLogin.setEmail(email);
        userLogin.setPassword(password);
        UserDetails userDetails=userDetailsRepo.save(new UserDetails());
        userLogin.setUserDetails(userDetails);
        userLogin.setCart(cartRepo.save(new Cart()));
        userLoginRepository.save(userLogin);
        return userLogin;
    }

    @Override
    public void modifyUserLogin(UserLogin userLogin) {
        userLoginRepository.save(userLogin);
        userDetailsRepo.save(userLogin.getUserDetails());
    }

    @Override
    public List<UserLogin> findByEmail(String email) {
        List<UserLogin> userLogins= userLoginRepository.findByEmail(email);
        return userLogins;
    }

}
