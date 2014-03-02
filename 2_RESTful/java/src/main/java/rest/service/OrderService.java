package rest.service;

import rest.model.Order;
import rest.model.Storage;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/orders")
@Produces({MediaType.APPLICATION_JSON})
public class OrderService {

	@POST
	public Response create() {
		Long createdId = Storage.add().getId();
		return Response.status(Response.Status.NO_CONTENT).header("Location", "/orders/" + createdId).build();
	}

	@GET
	@Path("/{id}/")
	public Order get(@PathParam("id") Long id) {
		return Storage.find(id);
	}
}
