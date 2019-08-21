package com.kgc.service.impl;

import com.kgc.dao.StudentMapper;
import com.kgc.pojo.Student;
import com.kgc.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jora on 2019/5/7.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper mapper;
    @Override
    public List<Student> queryAll() {
        return mapper.queryAll();
    }
}
