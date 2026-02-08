package org.example;

public class UppercaseProcessor implements Processor{
    @Override
    public String process(String string) {
        if (string == null) {
            return null;
        }
        return string.toUpperCase();    }
}
