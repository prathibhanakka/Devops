package com.gp.usersearch.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import com.gp.usersearch.entities.Usermaster;

@Projection(name = "user", types = { Usermaster.class })
public interface UserProjection {
	String getUsername();

	String getEmpid();

	String getPassword();

	Long getRoleid();

	String getFirstname();

	byte getIsdeleted();

	String getLastname();

	Long getUserid();

}
