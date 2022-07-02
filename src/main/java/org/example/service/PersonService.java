package org.example.service;


import org.pf4j.Extension;
import org.pf4j.ExtensionPoint;


public interface PersonService extends  ExtensionPoint {

    String get();
}
