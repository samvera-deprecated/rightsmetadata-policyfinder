package org.projecthydra.xacml.finder;

import static org.junit.Assert.assertTrue;

import java.io.InputStream;

import org.junit.Test;


public class RightsMetadataDocumentTest {

    @Test
    public void test() throws Exception {

        InputStream in =
                this.getClass().getClassLoader().getResourceAsStream(
                        "rightsMetadata.xml");
        RightsMetadataDocument rmd = new RightsMetadataDocument(in);
        assertTrue(rmd.getActionSubjectMap().get("read")
                .contains("researcher1"));
    }

}
