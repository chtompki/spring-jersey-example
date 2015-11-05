package com.rt.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by tompkicr on 11/4/15.
 */
@Path("/example-json")
@Component
@Scope("request")
public class ExampleResource {

    private static final String CLASSNAME = ExampleResource.class.getName();
    private Logger LOGGER = LoggerFactory.getLogger(CLASSNAME);


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/v1_0")
    public String getJsonExampleString() {
        String METHOD_NAME="getJsonExampleString";
        LOGGER.info("Entered method: {}", METHOD_NAME);
        String exampleResponse;
        try {
            exampleResponse = JSON_EXAMPLE_STRING;
        } catch (Exception e) {
            exampleResponse = "failure";
        }
        LOGGER.info("Exiting method: {}", METHOD_NAME);
        return exampleResponse;
    }


    private static final String JSON_EXAMPLE_STRING = "{\"menu\": {" +
            "  \"id\": \"file\"," +
            "  \"value\": \"File\"," +
            "  \"popup\": {" +
            "    \"menuitem\": [" +
            "      {\"value\": \"New\", \"onclick\": \"CreateNewDoc()\"}," +
            "      {\"value\": \"Open\", \"onclick\": \"OpenDoc()\"}," +
            "      {\"value\": \"Close\", \"onclick\": \"CloseDoc()\"}" +
            "    ]" +
            "  }" +
            "}}";
}
