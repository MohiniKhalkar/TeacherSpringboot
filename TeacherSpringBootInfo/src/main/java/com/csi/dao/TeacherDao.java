package com.csi.dao;

import com.csi.model.Teacher;
import com.csi.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherDao {
    @Autowired
    TeacherRepo teacherRepo;
    public Teacher savedata(Teacher teacher){
        return teacherRepo.save(teacher);
    }
}
