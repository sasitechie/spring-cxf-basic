package org.learning.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Service;

@Service("apiService")
@Path("/api")
public class MainService {

	@GET
	@Path("/print")
	public String print(){
		return "CXF API";
	}
}
