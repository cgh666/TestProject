package com.example.command.test;

import org.springframework.beans.factory.annotation.Autowired;

public class Test {
    @Autowired
    public CommandUtils commandUtils;

    public void a(){
        commandUtils.A();
    }
}
