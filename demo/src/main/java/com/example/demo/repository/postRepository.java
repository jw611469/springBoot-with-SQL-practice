package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.postEntity;

public interface postRepository extends JpaRepository<postEntity,Integer>{
    
    
}
