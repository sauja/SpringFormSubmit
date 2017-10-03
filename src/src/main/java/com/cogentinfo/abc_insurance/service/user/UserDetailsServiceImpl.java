package com.cogentinfo.abc_insurance.service.user;

import com.cogentinfo.abc_insurance.model.UserDetails;
import com.cogentinfo.abc_insurance.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{

    @Autowired
    private UserDetailsRepo userDetailsRepo;
    @Override
    public void updateUserDetails(UserDetails userDetails) {
        userDetailsRepo.save(userDetails);
    }
}
