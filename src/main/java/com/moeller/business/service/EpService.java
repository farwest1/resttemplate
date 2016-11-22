package com.moeller.business.service;

import com.moeller.common.Service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

/**
 * Created by Bernd on 22.11.2016.
 */
@Service
public class EpService {
    public void getEConnectVersion(){
        Client client = ClientBuilder.newClient();
        String name = client.target("https://www.evopark.de/econnect/api/v1/version")
                .request(MediaType.TEXT_PLAIN)
                .get(String.class);
    }
}
