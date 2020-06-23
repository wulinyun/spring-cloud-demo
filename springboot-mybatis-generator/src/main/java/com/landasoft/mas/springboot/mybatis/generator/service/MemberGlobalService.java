package com.landasoft.mas.springboot.mybatis.generator.service;

import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobal;

import java.util.List;

/**
 * @Author wulinyun
 * @Version 1.0
 * @JdkVesion 1.7
 * @Description TODO
 * @Date 2020/6/24 0:19
 */
public interface MemberGlobalService {
    int deleteByPrimaryKey(Long memberGlobalId);

    int insert(MemberGlobal record);

    MemberGlobal selectByPrimaryKey(Long memberGlobalId);

    List<MemberGlobal> selectAll();

    int updateByPrimaryKey(MemberGlobal record);
}
