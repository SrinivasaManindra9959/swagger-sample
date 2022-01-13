package com.swagger.controller;

import com.swagger.model.Student;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/students")
public class StudentController {
        private final Logger logger = LoggerFactory.getLogger(this.getClass());

        @GetMapping(value = "/all")
        public List<Student> getAllStudents() {
            logger.debug("Getting All students ......");
            List<Student> students = new ArrayList<>();
            Student stu = new Student();
            students.add(stu);
            try {
                logger.debug("Getting All students ...... ::");
            } catch (Exception ex) {
                logger.error("Error occurred in searchStudentById >>", ex, ex.getMessage());
            }
            return  students;

    }
}
