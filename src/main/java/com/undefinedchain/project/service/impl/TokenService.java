package com.undefinedchain.project.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.undefinedchain.project.model.User;
import org.springframework.stereotype.Service;


@Service("TokenService")
public class TokenService {
    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(String.valueOf(user.getUid()))// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getUpass()));// 以 password 作为 token 的密钥
        return token;
    }
}
