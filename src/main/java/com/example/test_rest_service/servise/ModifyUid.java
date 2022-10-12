package com.example.test_rest_service.servise;

import com.example.test_rest_service.model.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("ModifyUid")
public class ModifyUid implements MyModifyService {


    @Override
    public Response modify(Response response) {
        response.setUid("New Uid");
        return response;
    }
}
