package org.jboss.weld.creation.api;

import java.util.concurrent.Callable;

import javax.enterprise.context.spi.CreationalContext;

/**
 *
 *
 * @author Stuart Douglas
 */
public interface ConstructionContext<T> {

    CreationalContext<T> getCreationContext();

    Object[] getParameters();

    T create(final Object[] parameters);

    T postConstruct(final Callable postConstructTask) throws Exception;

}
