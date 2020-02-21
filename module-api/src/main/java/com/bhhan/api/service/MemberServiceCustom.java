package com.bhhan.api.service;

import com.bhhan.common.domain.member.Member;
import com.bhhan.common.domain.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by hbh5274@gmail.com on 2020-02-21
 * Github : http://github.com/bhhan5274
 */

@Service
@RequiredArgsConstructor
public class MemberServiceCustom {
    private final MemberRepository memberRepository;

    public Long signUp(Member member){
        return memberRepository.save(member).getId();
    }
}
