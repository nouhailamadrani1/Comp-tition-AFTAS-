package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Member;
import com.competition.aftas.repository.MemberRepository;
import com.competition.aftas.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }


}
