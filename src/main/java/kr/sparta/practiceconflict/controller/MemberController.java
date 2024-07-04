package kr.sparta.practiceconflict.controller;

import kr.sparta.practiceconflict.entity.Member;
import kr.sparta.practiceconflict.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @PostMapping("/{id}")
    public ResponseEntity<Member> addMember(@RequestBody Member member) {
        // 회원 추가 로직 구현
        Member savedMember = memberService.save(member);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMember);
    }
}