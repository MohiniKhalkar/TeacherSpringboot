package com.csi.service;

import com.csi.dao.TeacherDao;
import com.csi.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    TeacherDao teacherDao;
    public Teacher savedata(Teacher teacher){
        return teacherDao.savedata(teacher);
    }
}
