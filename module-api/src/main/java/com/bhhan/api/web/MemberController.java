package com.bhhan.api.web;

import com.bhhan.common.domain.member.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hbh5274@gmail.com on 2020-02-21
 * Github : http://github.com/bhhan5274
 */

@RestController
public class MemberController {
    @GetMapping("/")
    public Member get(){
        return Member.builder()
                .name("bhhan")
                .email("hbh5274@gmail.com")
                .build();
    }
}
