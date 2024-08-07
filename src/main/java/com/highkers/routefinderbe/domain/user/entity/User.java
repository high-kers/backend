package com.highkers.routefinderbe.domain.user.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id_num")
    private long userIdNum;

    private String id;
    private String pwd;
    private String nickname;

    public long getUserIdNum() {
        return userIdNum;
    }

    public void setUserIdNum(long userIdNum) {
        this.userIdNum = userIdNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
