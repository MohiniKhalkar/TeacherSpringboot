package com.csi.controller;

import com.csi.model.Teacher;
import com.csi.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @PostMapping("save")
    public ResponseEntity<Teacher> saveData(@RequestBody Teacher teacher ){
        return ResponseEntity.ok(teacherService.savedata(teacher));
    }
    @GetMapping()
    public String sayString (){
        return"WELCOME TO CSI";
    }
 @GetMapping("/service")
    public String sayService(){
        return "development|QR Code solution";
 }

 @GetMapping("/Welcome")
    public String sayWelcome(){
        return  "Welcome To Pune";
 }
@GetMapping("/say")
    public String hello(){
        return "Helllllo";
}
}
