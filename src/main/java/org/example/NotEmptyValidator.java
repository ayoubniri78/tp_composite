package org.example;

public class NotEmptyValidator implements Processor{
    @Override
    public String process(String string) {
        if (string == null || string.trim().isEmpty()) {
            throw new IllegalArgumentException("Tu as entres un element null");
        }
        return string;
    }
}
