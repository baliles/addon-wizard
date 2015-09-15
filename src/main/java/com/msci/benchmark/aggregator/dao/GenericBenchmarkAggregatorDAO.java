package com.msci.benchmark.aggregator.dao;

import org.jvnet.hk2.annotations.Contract;


@Contract
public interface GenericBenchmarkAggregatorDAO<T> {
	
	public String create(T entity);
	public T read(String id);
	public T update(T entity);
	void delete(String id);

}
