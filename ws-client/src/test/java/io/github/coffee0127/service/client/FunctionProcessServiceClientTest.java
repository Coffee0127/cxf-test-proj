package io.github.coffee0127.service.client;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.coffee0127.service.Header;
import io.github.coffee0127.service.ServiceMsg;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = { "classpath*:META-INF/spring/service-wsc.xml" })
@SpringBootApplication
@SpringBootTest
public class FunctionProcessServiceClientTest {

    @Autowired
    private FunctionProcessServiceClient client;

    @Test
    public void testDoMsgProcess() throws Exception {
        assertNotNull(client);
        ServiceMsg serviceMsg = new ServiceMsg();
        Header header = new Header();
        header.setServiceId("SER001");
        serviceMsg.setHeader(header);
        serviceMsg.setBody("Hello World");
        ServiceMsg rtnServiceMsg = client.doMsgProcess(serviceMsg);
        assertNotNull(rtnServiceMsg);
        System.out.println(ReflectionToStringBuilder.toString(rtnServiceMsg, ToStringStyle.MULTI_LINE_STYLE));
    }

}
