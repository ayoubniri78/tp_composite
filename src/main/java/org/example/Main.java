package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Processor pipeline = new EmailPipelineBuilder()
                .notEmpty()
                .trim()
                .toUpperCase()
                .removeSpaces()
                .regex("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}$")
                .build();
        String result = pipeline.process(" TEST.email@ example.com ");
        System.out.println(result);
    }
}