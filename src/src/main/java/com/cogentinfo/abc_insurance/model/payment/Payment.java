package com.cogentinfo.abc_insurance.model.payment;

import com.cogentinfo.abc_insurance.model.UserLogin;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
public abstract class Payment {
    @Id
    @Getter @Setter private String id;
    @Getter @Setter private UserLogin userLogin;
    public Payment()
    {
        this.id= UUID.randomUUID().toString();
    }
}
