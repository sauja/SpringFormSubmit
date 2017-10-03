package com.cogentinfo.abc_insurance.service.user;

import com.cogentinfo.abc_insurance.model.UserLogin;

import java.util.List;


public interface UserService {
    public UserLogin checkLogin(String email,String password);
    public UserLogin addUserLogin(String email, String password);
    public void modifyUserLogin(UserLogin userLogin);
    public List<UserLogin> findByEmail(String email);

}
