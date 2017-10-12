package com.xjtu.service;

import com.xjtu.dao.CourseMapper;
import com.xjtu.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Daihangtao on 2017/10/12.
 */
@Service
public class CourseService {

    @Autowired
    CourseMapper courseMapper;


    public Course getHasStudyedCourses(Integer courseId){
        Course course = courseMapper.selectByPrimaryKey(courseId);
        return course;
    }

    public Course getUnStudyedCourses(Integer courseId){
        Course course = courseMapper.selectByPrimaryKey(courseId);
        return course;
    }
}

