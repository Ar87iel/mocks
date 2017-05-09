package com.example.dto;

import com.example.common.BaseList;

import java.util.List;

/**
 * Created by DHbol on 5/9/2017.
 */
public class TabListDTO extends BaseList{

    private List<TabObjectDTO> data;

    public TabListDTO(List<TabObjectDTO> tabListDTOs, Integer totalPages, Integer sizeElements, Integer page, Integer pageSize){
        this.setPage(page);
        this.setTotalPages(totalPages);
        this.setSizeElements(sizeElements);
        this.setPageSize(pageSize);

        this.data = tabListDTOs;
    }

    @Override
    public List<TabObjectDTO> getData() {
        return data;
    }

    public void setData(List<TabObjectDTO> data) {
        this.data = data;
    }
}
