package com.sparta.myboard.service;

import com.sparta.myboard.domain.Myboard;
import com.sparta.myboard.domain.MyboardRepository;
import com.sparta.myboard.domain.MyboardRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class MyboardService {
    private final MyboardRepository myboardRepository;

    @Transactional
    public Long update(Long id, MyboardRequestDto requestDto){
        Myboard myboard = myboardRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("글이 존재 하지 않다.")

        );
        myboard.update(requestDto);
        return myboard.getId();

    }
}
