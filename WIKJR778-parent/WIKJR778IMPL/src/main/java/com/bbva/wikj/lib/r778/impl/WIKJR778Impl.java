package com.bbva.wikj.lib.r778.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;


public class WIKJR778Impl extends WIKJR778Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJR778Impl.class);


	@Override
	public Map<String, Object> executeSelect(String dni) {
		return this.jdbcUtils.queryForMap("query.query1",dni);
	}

	@Override
	public int executeInsert(Map<String, Object> args) {
		return this.jdbcUtils.update("query.query2", args);
	}
}
