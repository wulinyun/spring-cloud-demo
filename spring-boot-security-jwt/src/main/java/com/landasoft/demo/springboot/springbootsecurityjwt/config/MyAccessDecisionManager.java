package com.landasoft.demo.springboot.springbootsecurityjwt.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Iterator;

/**
 * @Author wulinyun
 * @Version 1.0
 * @Description 决策器
 * @Date 2020/1/21 16:12
 */
@Component
public class MyAccessDecisionManager implements AccessDecisionManager {
    private final static Logger logger = LoggerFactory.getLogger(MyAccessDecisionManager.class);

    /**
     *
     * @param authentication 包含了当前的用户信息，包括拥有的权限。这里的权限来源就是前面登录时UserDetailsService中设置的authorities。
     * @param o 就是FilterInvocation对象，可以得到request等web资源
     * @param collection 是本次访问需要的权限
     * @throws AccessDeniedException
     * @throws InsufficientAuthenticationException
     */
    @Override
    public void decide(Authentication authentication, Object o, Collection<ConfigAttribute> collection) throws AccessDeniedException, InsufficientAuthenticationException {
        if (null == collection || 0 >= collection.size()) {
            return;
        } else {
            String needRole;
            for(Iterator<ConfigAttribute> iter = collection.iterator(); iter.hasNext(); ) {
                needRole = iter.next().getAttribute();

                for(GrantedAuthority ga : authentication.getAuthorities()) {
                    if(needRole.trim().equals(ga.getAuthority().trim())) {
                        return;
                    }
                }
            }
            throw new AccessDeniedException("当前访问没有权限");
        }
    }
    /**
     * 表示此AccessDecisionManager是否能够处理传递的ConfigAttribute呈现的授权请求
     */
    @Override
    public boolean supports(ConfigAttribute configAttribute) {
        return true;
    }
    /**
     * 表示当前AccessDecisionManager实现是否能够为指定的安全对象（方法调用或Web请求）提供访问控制决策
     */
    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}