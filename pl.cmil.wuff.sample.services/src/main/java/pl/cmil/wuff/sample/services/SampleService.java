package pl.cmil.wuff.sample.services;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import javax.annotation.PostConstruct;
public class SampleService
{

    public String getName()
    {
        return "Random";
    }

}
