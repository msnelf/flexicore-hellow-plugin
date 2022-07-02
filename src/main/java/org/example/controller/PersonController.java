package org.example.controller;


import com.flexicore.annotations.OperationsInside;
import com.flexicore.interfaces.RestServicePlugin;
import com.flexicore.interfaces.ServicePlugin;
import com.wizzdi.flexicore.boot.base.interfaces.Plugin;

import org.example.service.PersonService;
import org.example.service.Ser;
import org.pf4j.Extension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("person")
@Extension
@OperationsInside
public class PersonController implements Plugin {

    @Autowired
    Ser ser;

    @RequestMapping(value = "/get")
    public ResponseEntity get()
    {
        return ResponseEntity.ok("d");
    }
}
