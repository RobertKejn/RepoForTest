package org.example;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = new ProcessBuilder(
                "cmd.exe", "/c", "start", "cmd.exe"
        ).start();


        long pid = process.pid();
        System.out.println("CMD PID = " + pid);

        Thread.sleep(15000);
    }
}