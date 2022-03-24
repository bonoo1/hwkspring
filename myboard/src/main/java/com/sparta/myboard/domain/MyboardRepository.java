package com.sparta.myboard.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyboardRepository extends JpaRepository<Myboard, Long> {
    List<Myboard> findAllByOrderByModifiedAtDesc();
}
