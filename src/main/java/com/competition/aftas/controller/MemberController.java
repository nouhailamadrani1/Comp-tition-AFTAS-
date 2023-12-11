package com.competition.aftas.controller;

import com.competition.aftas.domain.Member;
import com.competition.aftas.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping
    public Member saveMember(@RequestBody Member member) {
        return memberService.saveMember(member);
    }


}
