package com.example.demo.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.postEntity;
import com.example.demo.repository.postRepository;

@RestController
@RequestMapping("/api")
public class apiController {

    @Autowired
    private postRepository pRepository;

    @GetMapping("/getPost")
    public List<postEntity> getPost() {
        List<postEntity> post = pRepository.findAll();
        return post;
    }
    
}
