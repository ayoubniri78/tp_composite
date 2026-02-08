package org.example;

public class RemoveSpacesProcessor implements Processor{
    @Override
    public String process(String string) {
        return string.replace(" ", "");    }
}
