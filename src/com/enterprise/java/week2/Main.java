package com.enterprise.java.week2;

public class Main {

    public static void main(String[] args) throws Exception {

        FindAndReplace rw = new FindAndReplace("input.txt", "correct.txt", "findandreplace.txt");
        rw.launch();
    }

}
