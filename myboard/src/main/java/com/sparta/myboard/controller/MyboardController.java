package com.sparta.myboard.controller;

import com.sparta.myboard.domain.Myboard;
import com.sparta.myboard.domain.MyboardRepository;
import com.sparta.myboard.domain.MyboardRequestDto;
import com.sparta.myboard.service.MyboardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MyboardController {
    private final MyboardRepository myboardRepository;
    private final MyboardService myboardService;

    @PostMapping("/api/myboards")
    public Myboard createBoard (@RequestBody MyboardRequestDto requestDto){
        Myboard myboard = new Myboard(requestDto);
        return myboardRepository.save(myboard);
    }

    @GetMapping("/api/myboards")
    public List<Myboard> getBoard() {
        return myboardRepository.findAllByOrderByModifiedAtDesc();
    }

    @DeleteMapping("/api/myboards/{id}")
    public Long deleteBoard (@PathVariable Long id){
        myboardRepository.deleteById(id);
        return id;
    }

    @PutMapping("/api/myboards/{id}")
    public Long updateBoard(@PathVariable Long id, @RequestBody MyboardRequestDto requestDto){
        return myboardService.update(id, requestDto);
    }
}
