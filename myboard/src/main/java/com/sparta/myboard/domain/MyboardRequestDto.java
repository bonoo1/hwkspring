package com.sparta.myboard.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MyboardRequestDto {

    private String title;
    private String name;
    private String text;
}
