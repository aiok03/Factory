package com.company;

public class Math implements MathTeacher{



    @Override
    public void giveHomework() {
         solveProblems();
    }

    @Override
    public Teacher teachLesson() {
        return new Math();
    }

    @Override
    public void solveProblems() {
        System.out.print("Solve math problems");
    }
}
