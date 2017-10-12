package com.xjtu.service;

import com.xjtu.dao.StudyMapper;
import com.xjtu.model.Study;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Daihangtao on 2017/10/12.
 */

@Service
public class StudyService {

    @Autowired
    StudyMapper studyMapper;


    public List<Study> getHasStudyedCourse(Integer userid){
        List<Study> studys = studyMapper.selectHasstudyCourseByUserId(userid);
        return studys;
    }

    public List<Study> getUnStudyedCourse(Integer userid){
        List<Study> studys = studyMapper.selectUnstudyCourseByUserId(userid);
        return studys;
    }


}

