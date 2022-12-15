package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Genders;

public interface GendersRepository extends JpaRepository<Genders, Serializable> {

}
