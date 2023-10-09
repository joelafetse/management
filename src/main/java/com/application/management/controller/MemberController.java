package com.application.management.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.application.management.generated.api.MembersApi;
import com.application.management.generated.models.MemberDto;
import com.application.management.service.MemberService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class MemberController implements MembersApi {

	private final MemberService memberService;
    
	@Override
    public ResponseEntity<List<MemberDto>> getMembers() {
		return new ResponseEntity<List<MemberDto>>(memberService.getMembers(), HttpStatus.OK);
		
	}
}
