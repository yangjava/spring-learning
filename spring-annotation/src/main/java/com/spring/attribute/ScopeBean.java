package com.spring.attribute;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("scopeBean")
// 如果没有指定scope 是 singleton 单例
@Scope("prototype")
public class ScopeBean {

}
