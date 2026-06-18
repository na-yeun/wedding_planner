package com.weddingplanner.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/members/join")
    public String joinForm() {
        return "member/join";
    }

    @GetMapping("/mypage")
    public String myPage() {
        return "member/mypage";
    }
}
