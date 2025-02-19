package com.bbva.wikj;

import com.bbva.wikj.dto.user.DtoOut;
import com.bbva.wikj.lib.r777.WIKJR777;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class WIKJT77701MXTransaction extends AbstractWIKJT77701MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(WIKJT77701MXTransaction.class);


	@Override
	public void execute() {
		WIKJR777 wikjR777 = this.getServiceLibrary(WIKJR777.class);
		DtoOut dtoOut = wikjR777.execute(this.getDtoin());
		this.setDtoout(dtoOut);
	}

}
