package org.example;

public class EmailPipelineBuilder {
    private final ProcessorPipeline pipeline = new ProcessorPipeline();

    public EmailPipelineBuilder notEmpty() {
        pipeline.addProcessor(new NotEmptyValidator());
        return this;
    }

    public EmailPipelineBuilder trim() {
        pipeline.addProcessor(new TrimProcessor());
        return this;
    }

    public EmailPipelineBuilder toUpperCase() {
        pipeline.addProcessor(new UppercaseProcessor());
        return this;
    }


    public EmailPipelineBuilder removeSpaces() {
        pipeline.addProcessor(new RemoveSpacesProcessor());
        return this;
    }

    public EmailPipelineBuilder regex(String regex) {
        pipeline.addProcessor(new RegexValidator(regex));
        return this;
    }

    public Processor build() {
        return pipeline;
    }


}
