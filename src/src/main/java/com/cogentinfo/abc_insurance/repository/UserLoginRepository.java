package com.cogentinfo.abc_insurance.repository;

import com.cogentinfo.abc_insurance.model.UserLogin;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLoginRepository extends CrudRepository<UserLogin,String> {

    @Query("select u from UserLogin u where u.email=?1")
    List<UserLogin> findByEmail(String email);
}
