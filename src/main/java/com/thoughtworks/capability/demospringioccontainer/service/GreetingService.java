package com.thoughtworks.capability.demospringioccontainer.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON;

@Service
@Scope(value = SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class GreetingService {
   public GreetingService(){

           System.out.println("################");

   }
   public String sayHi() {
        return "hello world";
    }
}
