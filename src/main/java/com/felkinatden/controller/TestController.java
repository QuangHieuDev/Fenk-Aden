package com.felkinatden.controller;

import com.felkinatden.model.UserRole;
import com.felkinatden.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/{id1}/{id2}")
    public ResponseEntity<?> test(@PathVariable long id1, @PathVariable long id2){
        HttpStatus status;
        status = roleService.isCheck(id1,id2)?HttpStatus.OK:HttpStatus.CREATED;
        List list = roleService.save(id1,id2);
//        roleService.delete(id1, id2);
        return new ResponseEntity<>(list,status);
    }
}
