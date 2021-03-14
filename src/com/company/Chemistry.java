package com.company;

public class Chemistry implements ChemistryTeacher{



    @Override
    public void giveHomework() {
         doExperiments();
    }

    @Override
    public Teacher teachLesson() {
        return new Chemistry();
    }

    @Override
    public void doExperiments() {
        System.out.println("Make experiments on chemistry lesson");
    }
}
