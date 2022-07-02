package org.example;
import com.wizzdi.flexicore.boot.base.events.PluginsLoadedEvent;
import com.wizzdi.flexicore.boot.base.interfaces.Plugin;
import org.pf4j.Extension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//@Component
//@Extension
//
//public class HelloWorld implements Plugin {
//    private static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);
//    @EventListener
//    public void pluginLoaded(PluginsLoadedEvent event) {
//        logger.info("\n***************** plugin loaded event called *******plugins started: , " +
//                "\n number of plugins loaded: "+event.getStartedPlugins().size());
//    }
//
//
//}