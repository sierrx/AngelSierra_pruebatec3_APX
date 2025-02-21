package com.bbva.wikj;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;


public abstract class AbstractWIKJT77701MXTransaction extends AbstractTransaction {

	public AbstractWIKJT77701MXTransaction(){
	}



	protected DtoIn getDtoin(){
		return (DtoIn)this.getParameter("dtoIn");
	}


	protected void setDtoout(final DtoOut field){
		this.addParameter("dtoOut", field);
	}
}
