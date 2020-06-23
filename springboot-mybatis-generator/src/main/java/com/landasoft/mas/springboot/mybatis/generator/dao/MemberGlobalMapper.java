package com.landasoft.mas.springboot.mybatis.generator.dao;

import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobal;
import java.util.List;

public interface MemberGlobalMapper {
    int deleteByPrimaryKey(Long memberGlobalId);

    int insert(MemberGlobal record);

    MemberGlobal selectByPrimaryKey(Long memberGlobalId);

    List<MemberGlobal> selectAll();

    int updateByPrimaryKey(MemberGlobal record);
}