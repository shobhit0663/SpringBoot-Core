package com.itvedant.commerce.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface userjpa extends JpaRepository<usersignup,Integer>{

}
