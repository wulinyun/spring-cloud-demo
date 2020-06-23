package com.landasoft.mas.springboot.mybatis.generator.service.impl;

import com.landasoft.mas.springboot.mybatis.generator.dao.MemberGlobalMapper;
import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobal;
import com.landasoft.mas.springboot.mybatis.generator.service.MemberGlobalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/6/24 0:20
 */
@Service
public class MemberGlobalServiceImpl implements MemberGlobalService {
    @Autowired
    private MemberGlobalMapper memberGlobalMapper;
    @Override
    public int deleteByPrimaryKey(Long memberGlobalId) {
        return memberGlobalMapper.deleteByPrimaryKey(memberGlobalId);
    }

    @Override
    public int insert(MemberGlobal record) {
        return memberGlobalMapper.insert(record);
    }

    @Override
    public MemberGlobal selectByPrimaryKey(Long memberGlobalId) {
        return memberGlobalMapper.selectByPrimaryKey(memberGlobalId);
    }

    @Override
    public List<MemberGlobal> selectAll() {
        return memberGlobalMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(MemberGlobal record) {
        return memberGlobalMapper.updateByPrimaryKey(record);
    }
}
