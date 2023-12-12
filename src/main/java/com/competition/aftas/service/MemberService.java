package com.competition.aftas.service;

import com.competition.aftas.domain.Member;

import java.util.List;

public interface MemberService {
    Member saveMember(Member member);
    Member getMemberByNum(Integer num);
    List<Member> getAllMembers();
    Member updateMember(Integer num, Member updatedMember);
    void deleteMember(Integer num);
}
