package com.example.response;

import com.example.common.BaseResponse;
import com.example.dto.TabObjectDTO;
import org.springframework.http.HttpStatus;

/**
 * Created by DHbol on 5/9/2017.
 */
public class TabResponse extends BaseResponse{

    private TabObjectDTO mainData;

    public TabResponse(Integer id,String nombre){
        this.setStatus(HttpStatus.OK.value());
        this.setMessage("all is ok");
        mainData = new TabObjectDTO(id, nombre);
    }

    @Override
    public TabObjectDTO getMainData(){
        return mainData;
    }

    public void setMainData(TabObjectDTO mainData){
        this.mainData = mainData;
    }

}
