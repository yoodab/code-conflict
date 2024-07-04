package kr.sparta.practiceconflict.controller;

import kr.sparta.practiceconflict.entity.Member;
import kr.sparta.practiceconflict.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/{id}")
    public ResponseEntity<Member> getMember(@PathVariable Long id) {
        // 회원 조회 로직 추가
        Member member = memberService.findById(id);
        return ResponseEntity.ok(member);
    }
}
