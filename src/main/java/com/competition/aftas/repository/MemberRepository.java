package com.competition.aftas.repository;
import com.competition.aftas.domain.Competition;
import com.competition.aftas.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
