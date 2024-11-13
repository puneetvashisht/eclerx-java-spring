package com.eclerx.spring_boot_final_demo.dto;

public class CombinedResponse {
    
    String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CombinedResponse(String title) {
        this.title = title;
    }

    
}
