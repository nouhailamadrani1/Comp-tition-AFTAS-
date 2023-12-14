package com.competition.aftas.service;

import com.competition.aftas.DTO.MemberDTO;
import com.competition.aftas.domain.Member;

import java.util.List;

public interface MemberService {
    MemberDTO createMember(MemberDTO memberDTO);
    MemberDTO getMemberById(Integer num);
    List<MemberDTO> getAllMembers();
    MemberDTO updateMember(Integer num, MemberDTO memberDTO);
    void deleteMember(Integer num);
}