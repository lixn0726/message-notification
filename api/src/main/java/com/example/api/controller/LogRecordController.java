package com.example.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static com.example.apicommon.constant.ApiConstant.LOG_RECORD_CONTROLLER;
import static com.example.apicommon.constant.ApiConstant.LOG_RECORD_SELECT;

/**
 * @author lixn
 * @date 2022/01/11 14:45
 **/
@RestController
@RequestMapping(LOG_RECORD_CONTROLLER)
public class LogRecordController {

    @RequestMapping(value = LOG_RECORD_SELECT, method = RequestMethod.GET)
    public String selectLog() {
        return "Log selection finished";
    }
}
