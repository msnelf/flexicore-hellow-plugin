package org.example.service;



import org.pf4j.Extension;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Primary
@Extension
public class PersonServiceImpl implements PersonService {

    public String get() {
        return "new Person";
    }
}
