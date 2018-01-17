package io.github.coffee0127.service.impl;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import io.github.coffee0127.service.FunctionProcessService;
import io.github.coffee0127.service.ServiceMsg;

@Service("FunctionProcessService")
@WebService(name = "FunctionProcessService", serviceName = "FunctionProcessServiceClient",
    portName = "FunctionProcessServicePort", targetNamespace = "http://service.coffee0127.github.io/")
public class FunctionProcessServiceImpl implements FunctionProcessService {

    private static final String DATE_TIME_FORMAT = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

    @Override
    public ServiceMsg msgProcess(ServiceMsg serviceMsg) {
        serviceMsg.getHeader().setMessageTimestamp(DATE_TIME_FORMAT);
        serviceMsg.setBody("Return-" + serviceMsg.getBody());
        return serviceMsg;
    }

}
