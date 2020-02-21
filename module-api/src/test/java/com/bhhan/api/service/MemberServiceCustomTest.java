package com.bhhan.api.service;

import com.bhhan.common.domain.member.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by hbh5274@gmail.com on 2020-02-21
 * Github : http://github.com/bhhan5274
 */

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberServiceCustomTest {
    @Autowired
    private MemberServiceCustom memberServiceCustom;

    @Test
    public void save(){
        final Member member = Member.builder()
                .name("bhhan")
                .email("hbh5274@gmail.com")
                .build();

        final Long id = memberServiceCustom.signUp(member);
        assertThat(id).isEqualTo(1L);
    }
}