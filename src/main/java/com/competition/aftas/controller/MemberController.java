package com.competition.aftas.controller;

import com.competition.aftas.domain.Member;
import com.competition.aftas.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Member saveMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }

    @GetMapping("/{num}")
    public Member getMemberByNum(@PathVariable Integer num) {
        return memberService.getMemberByNum(num);
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @PutMapping("/{num}")
    public Member updateMember(@PathVariable Integer num, @RequestBody Member updatedMember) {
        return memberService.updateMember(num, updatedMember);
    }

    @DeleteMapping("/{num}")
    public void deleteMember(@PathVariable Integer num) {
        memberService.deleteMember(num);
    }
}
