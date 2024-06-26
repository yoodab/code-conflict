package kr.sparta.practiceconflict.repository;

import kr.sparta.practiceconflict.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
