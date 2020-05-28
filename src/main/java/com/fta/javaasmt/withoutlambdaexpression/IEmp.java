package com.fta.javaasmt.withoutlambdaexpression;

public class IEmp {
    @FunctionalInterface
    public interface IEmpObj {
        Employee get(String name, String acc, double salary);
    }

}
