package com.xjtu.controller;

import com.xjtu.model.Course;
import com.xjtu.model.Study;
import com.xjtu.model.User;
import com.xjtu.service.CourseService;
import com.xjtu.service.StudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by lenovo on 2017/10/12.
 */

@Controller
public class IndexController {

    @Autowired
    StudyService studyService;
    @Autowired
    CourseService courseService;

    @RequestMapping(value = "/index")
    public String toIndex(HttpServletRequest request) throws UnsupportedEncodingException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        System.out.println(request.getCharacterEncoding());
        //request.setCharacterEncoding("UTF-8");
        List<Study> studyes = studyService.getHasStudyedCourse(user.getUserid());
        List<Study> unStudyes = studyService.getUnStudyedCourse(user.getUserid());

        List<Course> studyedCourses = new ArrayList<>();
        for (Study study: studyes) {
            studyedCourses.add(courseService.getHasStudyedCourses(study.getCourseid()));
        }

        List<Course> unStudyedCourses = new ArrayList<>();
        for (Study unstudy:unStudyes) {
            unStudyedCourses.add(courseService.getUnStudyedCourses(unstudy.getCourseid()));
        }

        request.setAttribute("studyes",studyedCourses);
        request.setAttribute("unstudyes",unStudyedCourses);

        request.setAttribute("user",user);
        System.out.println("-------------"+studyes);
        return "/index";
    }
}
