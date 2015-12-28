package com.skoushlendra.rest.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.skoushlendra.rest.pojo.Student;

@Path("/xmlServices")
public class RESTEasyXMLServices
{
	@GET
	@Path("/print/{name}")
	@Produces("application/xml")
	public Student getStudent(@PathParam("name") String name)
	{
		return new Student("Koushlendra","Singh Parihar",25,12190);
	}

	@POST
	@Path("/send")
	@Consumes("application/xml")
	public Response comsumeXML(Student student)
	{
		return Response.status(200).entity(student.toString()).build();
	}
}
