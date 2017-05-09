package com.example.response;

import com.example.common.BaseResponse;
import com.example.dto.TabListDTO;
import com.example.dto.TabObjectDTO;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * Created by DHbol on 5/9/2017.
 */
public class TabListResponse extends BaseResponse{

    private TabListDTO mainData;

    public TabListResponse(List<TabObjectDTO> tabObjectDTOs,Integer totalPages, Integer sizeElements, Integer page, Integer pageSize){
        this.setStatus(HttpStatus.OK.value());
        this.setMessage("it's ok");
        mainData = new TabListDTO(tabObjectDTOs, totalPages, sizeElements, page, pageSize);
    }

    @Override
    public TabListDTO getMainData() {
        return mainData;
    }

    public void setMainData(TabListDTO mainData) {
        this.mainData = mainData;
    }
}
