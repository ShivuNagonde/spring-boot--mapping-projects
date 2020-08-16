package com.project.springbootjpamanytomanymapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springbootjpamanytomanymapping.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long>{

}
