package my.project.resources;

import my.project.resource.Root;
import my.project.resource.api.Api;
import my.project.resources.api.ApiImpl;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RootImpl implements Root {

    @Inject
    ApiImpl apiImpl;

    @Override
    public Api api() {
        return apiImpl;
    }
}