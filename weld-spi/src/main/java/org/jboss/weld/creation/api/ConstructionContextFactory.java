package org.jboss.weld.creation.api;

/**
 * @author Stuart Douglas
 */
public interface ConstructionContextFactory<T> {

    ConstructionContext<T> startCreation();

}
