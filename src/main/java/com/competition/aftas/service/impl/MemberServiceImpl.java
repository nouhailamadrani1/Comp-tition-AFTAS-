package com.competition.aftas.service.impl;

import com.competition.aftas.domain.Member;
import com.competition.aftas.repository.MemberRepository;
import com.competition.aftas.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberRepository memberRepository;

    @Override
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    @Override
    public Member getMemberByNum(Integer num) {
        Optional<Member> optionalMember = memberRepository.findById(num);
        return optionalMember.orElse(null);
    }

    @Override
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    @Override
    public Member updateMember(Integer num, Member updatedMember) {
        Optional<Member> optionalMember = memberRepository.findById(num);
        if (optionalMember.isPresent()) {
            Member existingMember = optionalMember.get();
            existingMember.setName(updatedMember.getName());
            existingMember.setFamilyName(updatedMember.getFamilyName());
            existingMember.setAccessionDate(updatedMember.getAccessionDate());
            existingMember.setNationality(updatedMember.getNationality());
            existingMember.setIdentityDocument(updatedMember.getIdentityDocument());
            existingMember.setIdentityNumber(updatedMember.getIdentityNumber());

            return memberRepository.save(existingMember);
        }
        return null;
    }

    @Override
    public void deleteMember(Integer num) {
        memberRepository.deleteById(num);
    }
}
