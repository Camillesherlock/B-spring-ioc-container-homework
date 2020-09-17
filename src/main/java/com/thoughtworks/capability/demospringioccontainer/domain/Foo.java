package com.thoughtworks.capability.demospringioccontainer.domain;

import com.thoughtworks.capability.demospringioccontainer.domain.Bar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Foo {

    private Bar bar;
    
    public void setFoo( Bar bar) {
        this.bar = bar;
    }

    public void hi() {
        System.out.println("Hi, " + bar.name());
    }

    public String name() {
        return "Foo";
    }
}
