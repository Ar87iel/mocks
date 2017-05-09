package com.example.common;

import com.fasterxml.jackson.databind.deser.Deserializers;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * Created by DHbol on 5/9/2017.
 */
public class BaseResponse implements Serializable{
    private int status;
    private String message;
    private Object mainData;

    public BaseResponse(){
        this.status = HttpStatus.OK.value();
        this.message = "The process was executed successfully";
        this.mainData = null;
    }

    public Object getMainData() {
        return mainData;
    }

    public void setMainData(Object mainData) {
        this.mainData = mainData;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
