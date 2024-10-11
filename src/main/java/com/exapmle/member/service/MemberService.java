package com.exapmle.member.service;

import com.exapmle.member.dto.MemberDTO;
import com.exapmle.member.entity.MemberEntity;
import com.exapmle.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;
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

    public List<MemberDTO> findAll() {
        List<MemberEntity> memberEntityList = memberRepository.findAll();
        List<MemberDTO> memberDTOList = new ArrayList<>();
        for(MemberEntity memberEntity : memberEntityList) {
            memberDTOList.add(MemberDTO.toMemberDTO(memberEntity));
        }
        return memberDTOList;
    }

    // member 상세 조회 service
    public MemberDTO findById(Long id) {
        Optional<MemberEntity> optionalMemberEntity = memberRepository.findById(id);
        if(optionalMemberEntity.isPresent()) {
            return MemberDTO.toMemberDTO(optionalMemberEntity.get());
        } else {
            return null;
        }
    }

    // member 수정 Form
    public MemberDTO updateForm(String myEmail) {
        Optional<MemberEntity> optionalMemberEntity = memberRepository.findByMemberEmail(myEmail);
        if(optionalMemberEntity.isPresent()){
            return MemberDTO.toMemberDTO(optionalMemberEntity.get());
        } else {
            return null;
        }
    }

    // member 수정
    public void update(MemberDTO memberDTO) {
        memberRepository.save(MemberEntity.toUpdateEntity(memberDTO));
    }

    // memeber 삭제 service
    public void deleteById(Long id) {
        memberRepository.deleteById(id);
    }

    // email 확인 service
    public String emailCheck(String memberEmail) {
        Optional<MemberEntity> byMemberEmail = memberRepository.findByMemberEmail(memberEmail);
        if(byMemberEmail.isPresent()){
            // 조회결과가 있다. -> 사용할 수 없다.
            return null;
        } else {
            // 조회결과가 없다. -> 사용할 수 있다.
            return "ok";
        }
    }
}
