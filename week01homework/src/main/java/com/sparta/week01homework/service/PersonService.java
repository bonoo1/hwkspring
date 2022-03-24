package com.sparta.week01homework.service;

import com.sparta.week01homework.domain.Person;
import com.sparta.week01homework.domain.PersonRepository;
import com.sparta.week01homework.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service // 스프링에게 이 클래스는 서비스임을 명시
public class PersonService {

    // final: 서비스에게 꼭 필요한 녀석임을 명시
    private final PersonRepository personRepository;

    // 생성자를 통해, Service 클래스를 만들 때 꼭 Repository를 넣어주도록
    // 스프링에게 알려줌
//    }

    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, PersonRequestDto requestDto) {
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person.update(requestDto);
        return person.getId();
    }
}
