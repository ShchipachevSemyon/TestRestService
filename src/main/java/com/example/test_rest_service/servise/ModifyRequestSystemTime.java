package com.example.test_rest_service.servise;

import com.example.test_rest_service.model.Request;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ModifyRequestSystemTime implements ModifyRequestService {

    @Override
    public void modifyRq(Request request) {

        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss");
        request.setSystemTime(dateFormat.format(new Date()));

        HttpEntity<Request> httpEntity = new HttpEntity<>(request);

        new RestTemplate().exchange("http://localhost:8082/feedback",
                HttpMethod.POST,
                httpEntity,
                new ParameterizedTypeReference<>() {
                });
    }
}
