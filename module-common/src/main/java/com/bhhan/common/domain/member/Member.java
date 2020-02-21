package com.bhhan.common.domain.member;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by hbh5274@gmail.com on 2020-02-21
 * Github : http://github.com/bhhan5274
 */

@Entity
@Table(name = "MEMBERS")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    private String name;

    private String email;

    @Builder
    public Member(String name, String email){
        this.name = name;
        this.email = email;
    }
}
