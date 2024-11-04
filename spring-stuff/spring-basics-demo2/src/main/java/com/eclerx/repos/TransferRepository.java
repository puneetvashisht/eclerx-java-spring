package com.eclerx.repos;

import org.springframework.stereotype.Repository;

@Repository
public class TransferRepository {
    public void execute(){
        System.out.println("Execute in repository..");
    }
}
