package com.eclerx.services;

import com.eclerx.repos.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferService {


    @Autowired
    TransferRepository transferRepository;

    public void execute(){
        transferRepository.execute();
        System.out.println("Execute in service..");
    }
}
