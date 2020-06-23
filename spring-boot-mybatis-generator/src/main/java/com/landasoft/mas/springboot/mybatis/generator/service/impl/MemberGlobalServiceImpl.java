package com.landasoft.mas.springboot.mybatis.generator.service.impl;

import com.landasoft.mas.springboot.mybatis.generator.dao.MemberGlobalMapper;
import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobal;
import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobalExample;
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
    public long countByExample(MemberGlobalExample example) {
        return memberGlobalMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(MemberGlobalExample example) {
        return memberGlobalMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Long memberGlobalId) {
        return memberGlobalMapper.deleteByPrimaryKey(memberGlobalId);
    }

    @Override
    public int insert(MemberGlobal record) {
        return memberGlobalMapper.insert(record);
    }

    @Override
    public int insertSelective(MemberGlobal record) {
        return memberGlobalMapper.insertSelective(record);
    }

    @Override
    public List<MemberGlobal> selectByExample(MemberGlobalExample example) {
        return memberGlobalMapper.selectByExample(example);
    }

    @Override
    public MemberGlobal selectByPrimaryKey(Long memberGlobalId) {
        return memberGlobalMapper.selectByPrimaryKey(memberGlobalId);
    }

    @Override
    public int updateByExampleSelective(MemberGlobal record, MemberGlobalExample example) {
        return memberGlobalMapper.updateByExample(record,example);
    }

    @Override
    public int updateByExample(MemberGlobal record, MemberGlobalExample example) {
        return memberGlobalMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(MemberGlobal record) {
        return memberGlobalMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int updateByPrimaryKey(MemberGlobal record) {
        return memberGlobalMapper.updateByPrimaryKey(record);
    }
}
