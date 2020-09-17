package com.thoughtworks.capability.demospringioccontainer.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Bar {
   @Autowired
    private Foo foo;

//    @Autowired
//    public setBar(@Lazy Foo foo) {
//        this.foo = foo;
//    }

    @PostConstruct
    public void init(){
        foo.setFoo(this);
    }

    public Foo getFoo() {
        return foo;
    }

    public void hi() {
        System.out.println("Hi, " + foo.name());
    }

    public String name() {
        return "Bar";
    }
}
