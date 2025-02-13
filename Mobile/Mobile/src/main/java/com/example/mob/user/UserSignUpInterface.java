package com.example.mob.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserSignUpInterface extends JpaRepository<UserSignUp,Integer>{

}
