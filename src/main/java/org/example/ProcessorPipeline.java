package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProcessorPipeline implements Processor{
    List<Processor> processors = new ArrayList<>();

    public void addProcessor(Processor processor) {
        processors.add(processor);
    }

    @Override
    public String process(String string) {
        String result = string;
        for (Processor processor : processors) {
            result = processor.process(result);
        }
        return result;
    }
}
