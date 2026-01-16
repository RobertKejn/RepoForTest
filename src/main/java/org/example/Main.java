package org.example;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // this is now 1 commit in new main branch main_new
    public static void main(String[] args) throws IOException, InterruptedException {
        Process process = new ProcessBuilder(
                "cmd.exe", "/c", "start", "cmd.exe"
        ).start();


        long pid = process.pid();
        System.out.println("CMD PID = " + pid);

        // and some more COMMIT 3 MAIN

        Thread.sleep(15000);
        // COMMIT 2 IN MAIN MERGE CONFLICT
        // this is commit 1 (but actually 3)
        // this is commit 2
        // this is commit 3!

        // this is commit 4 for MR
    }
}