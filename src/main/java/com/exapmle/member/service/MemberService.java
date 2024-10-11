package com.exapmle.member.service;

import com.exapmle.member.dto.MemberDTO;
import com.exapmle.member.entity.MemberEntity;
import com.exapmle.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO) {
        memberRepository.save(MemberEntity.toSaveEntity(memberDTO));
    }

    public MemberDTO login(MemberDTO memberDTO) {
        /*
            1. 회원이 입력한 이메일로 DB에서 조회함.
            2. DB에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단
        */
        Optional<MemberEntity> byMemberEmail = memberRepository.findByMemberEmail(memberDTO.getMemberEmail());
        if(byMemberEmail.isPresent()){
            // 조회 결과가 있다.
            // 해당 이메일을 가진 회원 정보가 있다.
            MemberEntity memberEntity = byMemberEmail.get();
            if(memberEntity.getMemberPassword().equals(memberDTO.getMemberPassword())){
                // 비밀번호 일치
                // entity -> dto 변환 후 리턴
                return MemberDTO.toMemberDTO(memberEntity);
            }else{
                // 비밀번호 불 일치
                return null;
            }
        } else {
            // 조회 결과가 없다.
            // 해당 이메일이 없다.
            return null;
        }
    }
}
