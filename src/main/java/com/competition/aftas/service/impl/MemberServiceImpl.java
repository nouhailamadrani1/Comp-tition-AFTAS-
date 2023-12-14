package com.competition.aftas.service.impl;

import com.competition.aftas.DTO.MemberDTO;
import com.competition.aftas.domain.Member;
import com.competition.aftas.repository.MemberRepository;
import com.competition.aftas.service.MemberService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public MemberDTO createMember(MemberDTO memberDTO) {
        Member member = new Member();
        BeanUtils.copyProperties(memberDTO, member);
        memberRepository.save(member);
        return memberDTO;
    }

    @Override
    public MemberDTO getMemberById(Integer num) {
        Member member = memberRepository.findById(num)
                .orElseThrow(() -> new RuntimeException("Member not found with num: " + num));

        MemberDTO memberDTO = new MemberDTO();
        BeanUtils.copyProperties(member, memberDTO);
        return memberDTO;
    }

    @Override
    public List<MemberDTO> getAllMembers() {
        List<Member> members = memberRepository.findAll();
        return members.stream()
                .map(this::convertEntityToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public MemberDTO updateMember(Integer num, MemberDTO memberDTO) {
        Member existingMember = memberRepository.findById(num)
                .orElseThrow(() -> new RuntimeException("Member not found with num: " + num));

        BeanUtils.copyProperties(memberDTO, existingMember);
        existingMember = memberRepository.save(existingMember);

        BeanUtils.copyProperties(existingMember, memberDTO);
        return memberDTO;
    }

    @Override
    public void deleteMember(Integer num) {
        memberRepository.deleteById(num);
    }

    private MemberDTO convertEntityToDTO(Member member) {
        MemberDTO memberDTO = new MemberDTO();
        BeanUtils.copyProperties(member, memberDTO);
        return memberDTO;
    }
}
