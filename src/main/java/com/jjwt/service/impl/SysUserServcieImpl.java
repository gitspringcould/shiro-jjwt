package com.jjwt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jjwt.domain.SysUser;
import com.jjwt.mapper.SysUserMapper;
import com.jjwt.service.ISysUserServcie;
import org.springframework.stereotype.Service;

@Service
public class SysUserServcieImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserServcie {
    @Override
    public SysUser findUserByName(String username) {
        QueryWrapper<SysUser> wrapper = new QueryWrapper<SysUser>();
        wrapper.eq("username", username);
        SysUser user = baseMapper.selectOne(wrapper);
        return user;
    }
}
