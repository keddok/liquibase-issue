package com.keddok.testcase.rdm;

import com.opentable.db.postgres.embedded.EmbeddedPostgres;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

/**
 * Created by tnurdinov on 31.05.2018.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(properties = {
        "spring.datasource.url=jdbc:postgresql://localhost:5444/postgres",
        "spring.datasource.username=postgres",
        "spring.datasource.password=postgres"
} )
public class ApplicationTest {

    @BeforeClass
    public static void startDb() throws IOException {
        EmbeddedPostgres.builder().setPort(5444).start();
    }

    @Test
    public void testIsRunning() throws Exception {
        assert true;
    }
}
