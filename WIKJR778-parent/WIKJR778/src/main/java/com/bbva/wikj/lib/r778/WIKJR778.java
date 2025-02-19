package com.bbva.wikj.lib.r778;


import java.util.Map;

public interface WIKJR778 {

	Map<String, Object> executeSelect(String dni);
	int executeInsert(Map<String, Object> args);

}
