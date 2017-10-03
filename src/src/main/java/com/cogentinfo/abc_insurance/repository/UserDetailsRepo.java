package com.cogentinfo.abc_insurance.repository;

import com.cogentinfo.abc_insurance.model.UserDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsRepo extends CrudRepository<UserDetails,String> {
}
