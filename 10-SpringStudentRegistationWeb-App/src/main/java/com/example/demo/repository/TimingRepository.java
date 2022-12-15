package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Timing;

public interface TimingRepository extends JpaRepository<Timing, Serializable> {

}
