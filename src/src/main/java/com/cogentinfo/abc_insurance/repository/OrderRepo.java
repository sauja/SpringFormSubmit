package com.cogentinfo.abc_insurance.repository;

import com.cogentinfo.abc_insurance.model.order.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends CrudRepository<Orders,String> {
        }


