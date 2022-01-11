package com.example.api.service.impl;

import com.example.api.service.LogRecordService;
import org.springframework.stereotype.Service;

/**
 * @author lixn
 * @date 2022/01/11 14:27
 **/
@Service(value = "LogRecordServiceImpl")
public class LogRecordServiceImpl implements LogRecordService {

    @Override
    public String selectBatch() {
        return "selection result";
    }
}
