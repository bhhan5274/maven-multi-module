package com.bhhan.common.domain.member;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by hbh5274@gmail.com on 2020-02-21
 * Github : http://github.com/bhhan5274
 */

@ExtendWith(SpringExtension.class)
@DataJpaTest
@ActiveProfiles("test")
class MemberRepositoryTest {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    @DisplayName("add 테스트")
    public void test1(){
        final String name = "bhhan";

        final Member saved = memberRepository.save(Member.builder()
                .name(name)
                .email("hbh5274@gmail.com")
                .build());

        assertThat(saved.getName()).isEqualTo(name);
    }
}