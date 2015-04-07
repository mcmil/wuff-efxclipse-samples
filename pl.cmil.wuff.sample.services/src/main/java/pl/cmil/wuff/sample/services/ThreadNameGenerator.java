package pl.cmil.wuff.sample.services;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import javax.annotation.PostConstruct;

/**
 * Illustrates guava usage in OSGi.
 */
public class ThreadNameGenerator
{

    @PostConstruct
    public void constr()
    {
        System.out.println( "hmm" );
    }

    public String getName()
    {
        return new ThreadFactoryBuilder().build().toString();
    }

}
