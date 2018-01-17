package io.github.coffee0127.service.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.coffee0127.service.FunctionProcessService;
import io.github.coffee0127.service.ServiceMsg;

@Service
public class FunctionProcessServiceClient {

    @Autowired
    private FunctionProcessService service;

    public ServiceMsg doMsgProcess(ServiceMsg serviceMsg) {
        return service.msgProcess(serviceMsg);
    }

}
