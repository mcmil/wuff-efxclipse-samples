package pl.cmil.wuff.sample.services;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import javax.annotation.PostConstruct;
import java.util.concurrent.ThreadFactory;

public class SampleService {

    private ThreadFactory factory;

    @PostConstruct
    public void setup() {
        factory = new ThreadFactoryBuilder().build();
    }

    public String getName() {
        return factory.getClass().getName() + " is used.";
    }

}
