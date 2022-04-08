package com.ecommerce.cjss.Ecommerce.registration;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.List;

public class Customer {
    @Id
    private Integer customerId;
    private String email;
    private Long phone;
    private String name;
    private String password;
    @OneToOne
    private CustomerAddress customerAddress;

    private List<>
}
