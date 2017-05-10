package com.example.controllers;

import com.example.dto.TabObjectDTO;
import com.example.response.TabListResponse;
import com.example.response.TabResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DHbol on 5/9/2017.
 */
@RestController
@RequestMapping(value="/mock")
public class TabController {

    @RequestMapping(method = RequestMethod.GET, path = "/test")
    public Object getTabs(){
        TabResponse tabResponse = new TabResponse(true,false,true,false);
        return tabResponse;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/list")
    public Object getAll(){
        List<TabObjectDTO> tabObjectDTOs = new ArrayList<>();
        TabObjectDTO tabObjectDTO1 = new TabObjectDTO(true,false,true,false);
        TabObjectDTO tabObjectDTO2 = new TabObjectDTO(true,true,true,true);
        TabObjectDTO tabObjectDTO3 = new TabObjectDTO(true,true,true,true);
        tabObjectDTOs.add(tabObjectDTO1);
        tabObjectDTOs.add(tabObjectDTO2);
        tabObjectDTOs.add(tabObjectDTO2);

        TabListResponse tabListResponse = new TabListResponse(tabObjectDTOs, 1, 3, 0, 10);
        return tabListResponse;
    }
}
