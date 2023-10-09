package com.application.management.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.application.management.entity.Member;
import com.application.management.generated.models.MemberDto;

@Mapper(componentModel = "spring")
public interface MemberMapper {
    
    MemberDto toMemberDto(Member member);

    List<MemberDto> toListMemberDto(List<Member> members);
}
