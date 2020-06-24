package com.landasoft.mas.springboot.mybatis.generator.dao;

import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobal;
import com.landasoft.mas.springboot.mybatis.generator.entity.MemberGlobalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberGlobalMapper {
    long countByExample(MemberGlobalExample example);

    int deleteByExample(MemberGlobalExample example);

    int deleteByPrimaryKey(Long memberGlobalId);

    int insert(MemberGlobal record);

    int insertSelective(MemberGlobal record);

    List<MemberGlobal> selectByExample(MemberGlobalExample example);

    MemberGlobal selectByPrimaryKey(Long memberGlobalId);

    int updateByExampleSelective(@Param("record") MemberGlobal record, @Param("example") MemberGlobalExample example);

    int updateByExample(@Param("record") MemberGlobal record, @Param("example") MemberGlobalExample example);

    int updateByPrimaryKeySelective(MemberGlobal record);

    int updateByPrimaryKey(MemberGlobal record);
}