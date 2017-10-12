package com.xjtu.dao;

import com.xjtu.model.Study;
import com.xjtu.model.StudyExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudyMapper {
    long countByExample(StudyExample example);

    int deleteByExample(StudyExample example);

    int insert(Study record);

    int insertSelective(Study record);

    List<Study> selectByExample(StudyExample example);

    int updateByExampleSelective(@Param("record") Study record, @Param("example") StudyExample example);

    int updateByExample(@Param("record") Study record, @Param("example") StudyExample example);

    List<Study> selectUnstudyCourseByUserId(Integer userid);

    List<Study> selectHasstudyCourseByUserId(Integer userid);
}