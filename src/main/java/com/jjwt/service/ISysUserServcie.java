package com.jjwt.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jjwt.domain.SysUser;

public interface ISysUserServcie extends IService<SysUser> {
    SysUser findUserByName(String username);
}
