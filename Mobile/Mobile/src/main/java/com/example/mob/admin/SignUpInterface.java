package com.example.mob.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SignUpInterface extends JpaRepository<SignUp,Integer>{

}
