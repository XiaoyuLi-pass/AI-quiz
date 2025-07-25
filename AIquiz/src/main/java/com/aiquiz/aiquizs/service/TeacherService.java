package com.aiquiz.aiquizs.service;

import com.aiquiz.aiquizs.model.entity.CourseContent;
import com.aiquiz.aiquizs.model.entity.CourseQuestion;
import com.aiquiz.aiquizs.model.vo.CourseVO;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface TeacherService extends IService<CourseContent> {


    int uploadCourseContent(MultipartFile file, Long courseId) throws IOException;

    List<CourseVO> getCourseList(Long id);

    Boolean createQuestion(String page, Long courseid);

    CourseQuestion getQuestion(Long courseId) throws IOException;
}
