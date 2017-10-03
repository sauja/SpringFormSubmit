package com.cogentinfo.abc_insurance.repository;

import com.cogentinfo.abc_insurance.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepo extends CrudRepository<Cart,String> {
}
