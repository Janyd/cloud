package com.janyd.controller;

import com.janyd.service.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by a3139 on 2017/3/25 0025.
 */
@RestController
public class ConsumerController {

    @Autowired
    ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Map<String, Object> add()
    {
        Integer result = computeClient.add(10, 20);
        Map<String, Object> map = new HashMap<>();
        map.put("result", result);
        return map;
    }
}
