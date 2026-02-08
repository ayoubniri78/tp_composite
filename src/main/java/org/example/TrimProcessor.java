package org.example;

public class TrimProcessor implements Processor{
    @Override
    public String process(String string) {
        return string != null ? string.trim() : null;    }
}
