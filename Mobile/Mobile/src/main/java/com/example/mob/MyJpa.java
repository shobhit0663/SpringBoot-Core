package com.example.mob;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyJpa extends JpaRepository<MobileB,Integer>{

}
