package com.bbva.wikj.lib.r777.impl;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.wikj.lib.r777.WIKJR777;
import com.bbva.wikj.lib.r778.WIKJR778;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class WIKJR777Abstract extends AbstractLibrary implements WIKJR777 {

	protected ApplicationConfigurationService applicationConfigurationService;

	protected WIKJR778 wikjR778;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

	/**
	* @param wikjR778 the this.wikjR778 to set
	*/
	public void setWikjR778(WIKJR778 wikjR778) {
		this.wikjR778 = wikjR778;
	}

}