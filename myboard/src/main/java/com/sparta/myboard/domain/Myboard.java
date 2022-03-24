package com.sparta.myboard.domain;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Myboard extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String text;

    public Myboard(MyboardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.name = requestDto.getName();
        this.text = requestDto.getText();
    }

    public void update(MyboardRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.text = requestDto.getText();
    }
}
