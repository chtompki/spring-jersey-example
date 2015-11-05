package com.rt.resource;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

/**
 * Created by tompkicr on 11/4/15.
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({ ExampleResource.class })
public class ExampleResourceTest {

    private ExampleResource exampleResource;

    @Test
    public void testGetExampleJson() {
        exampleResource = new ExampleResource();

        assertEquals(exampleResource.getJsonExampleString(), JSON_EXAMPLE_STRING);
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
