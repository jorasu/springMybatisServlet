package com.kgc.dao;
import com.kgc.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * Created by jora on 2019/5/7.
 */
@Repository
public interface StudentMapper {
    List<Student> queryAll();
}
