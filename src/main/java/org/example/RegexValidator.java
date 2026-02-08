package org.example;

public class RegexValidator implements Processor{
    private final String regex;

    public RegexValidator(String regex) {
        this.regex = regex;
    }

    @Override
    public String process(String string) {
        if (string == null) {
            throw new IllegalArgumentException("Entrer un element non vide");
        }
        if (!string.matches(regex)) {
            throw new IllegalArgumentException("L'entre n'est pas similaire a regex: " + regex);
        }
        return string;
    }
}
