package com.project.springbootjpamanytomanymapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springbootjpamanytomanymapping.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
