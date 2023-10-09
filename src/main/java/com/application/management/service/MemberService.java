package com.application.management.service;

import java.util.List;

import com.application.management.generated.models.MemberDto;

public interface MemberService {
    
    List<MemberDto> getMembers();
}
