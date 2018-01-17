package io.github.coffee0127.service;

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface FunctionProcessService {

    ServiceMsg msgProcess(@WebParam(name = "serviceMsg") ServiceMsg serviceMsg);

}
