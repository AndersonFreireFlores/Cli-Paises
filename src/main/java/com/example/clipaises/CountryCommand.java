package com.example.clipaises;

import org.springframework.shell.command.annotation.Command;

@Command(group = "Country commands")
public class CountryCommand {

    @Command(command = "hello", description = "Prints a hello message")
    public String hello() {
        return "Hello, World!";
    }
}
