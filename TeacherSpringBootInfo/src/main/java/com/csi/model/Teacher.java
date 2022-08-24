package com.csi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Teacher {
    @Id
    @GeneratedValue
    private int teacherId;
    private String teacherName;
    private String teacherAddress;
    @JsonFormat(pattern = "dd-MM-yyyy",timezone = "Asia/Kolkata")
    private Date teacherDOB;
    @Column(name="teacherEmailId",unique = true)
    private String teacherEmailId;

}
