package com.exapmle.member.service;

import com.exapmle.member.dto.MemberDTO;
import com.exapmle.member.entity.MemberEntity;
import com.exapmle.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        memberRepository.save(MemberEntity.toSaveEntity(memberDTO));
    }
}
