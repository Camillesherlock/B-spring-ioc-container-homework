package com.thoughtworks.capability.demospringioccontainer.service;

import com.thoughtworks.capability.demospringioccontainer.domain.Bar;
import com.thoughtworks.capability.demospringioccontainer.domain.Foo;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    private final Foo foo;
    private final Bar bar;

    public GreetingService(Foo foo, Bar bar) {
        this.foo = foo;
        this.bar = bar;
    }

    public String sayHi() {
        foo.hi();
        bar.hi();
        return "hello world";
    }
}
