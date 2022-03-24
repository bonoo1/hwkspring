package com.sparta.week01homework.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Setter
@Entity
public class Person extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String job;

    @Column(nullable = false)
    private int age;

    public Person(String name, String address, String job, int age) {
        this.name = name;
        this.address = address;
        this.job = job;
        this.age = age;
    }

    public Person(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
        this.job = requestDto.getJob();
        this.age = requestDto.getAge();
    }

    public void update(PersonRequestDto requestDto) {
        this.name = requestDto.getName();
        this.address = requestDto.getAddress();
        this.job = requestDto.getJob();
        this.age = requestDto.getAge();
    }



}

