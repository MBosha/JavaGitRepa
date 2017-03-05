package io.hexlet.java.m101.xo.view;

import io.hexlet.java.m101.xo.controller.Game;


public class ConsoleView {

    public void show(final Game game) {}

    public boolean move(final Game game) {
        return false;
    }

    public void show(Game game) {
        System.out.println("show");
    }
}