package org.example.service;



import com.flexicore.interfaces.Plugin;
import com.flexicore.interfaces.ServicePlugin;
import org.pf4j.Extension;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Extension
public class Ser implements Plugin {
    public String get()
    {

        return "dvvvvvvvdd";
    }
}
