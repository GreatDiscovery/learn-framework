package org.elasticsearch.common.inject;

public interface Provider<T> {

    T get();
}
