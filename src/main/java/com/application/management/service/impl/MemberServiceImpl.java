package com.application.management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.management.generated.models.MemberDto;
import com.application.management.mapper.MemberMapper;
import com.application.management.repository.MemberRepository;
import com.application.management.service.MemberService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    @Override
    public List<MemberDto> getMembers() {
        return memberMapper.toListMemberDto(memberRepository.findAll());
    }
    
}
