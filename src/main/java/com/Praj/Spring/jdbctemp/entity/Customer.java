package com.Praj.Spring.jdbctemp.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {
   private Long id;
   private Long accountno;
  private String  customername;
  private Integer mobileno;
  private String email;
   private String address;


}
