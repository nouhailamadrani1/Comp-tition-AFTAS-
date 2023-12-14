package com.competition.aftas.controller;

import com.competition.aftas.DTO.MemberDTO;
import com.competition.aftas.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/members")
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping
    public ResponseEntity<MemberDTO> createMember(@RequestBody MemberDTO memberDTO) {
        MemberDTO createdMember = memberService.createMember(memberDTO);
        return new ResponseEntity<>(createdMember, HttpStatus.CREATED);
    }

    @GetMapping("/{num}")
    public ResponseEntity<MemberDTO> getMemberById(@PathVariable Integer num) {
        MemberDTO memberDTO = memberService.getMemberById(num);
        return ResponseEntity.ok(memberDTO);
    }

    @GetMapping
    public ResponseEntity<List<MemberDTO>> getAllMembers() {
        List<MemberDTO> members = memberService.getAllMembers();
        return ResponseEntity.ok(members);
    }

    @PutMapping("/{num}")
    public ResponseEntity<MemberDTO> updateMember(@PathVariable Integer num, @RequestBody MemberDTO memberDTO) {
        MemberDTO updatedMember = memberService.updateMember(num, memberDTO);
        return ResponseEntity.ok(updatedMember);
    }

    @DeleteMapping("/{num}")
    public ResponseEntity<Void> deleteMember(@PathVariable Integer num) {
        memberService.deleteMember(num);
        return ResponseEntity.noContent().build();
    }
}
