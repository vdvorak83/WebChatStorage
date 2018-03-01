package ru.shumilin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.shumilin.component.StorageComponent;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StorageController {

    @Autowired
    StorageComponent storageComponent;

    @RequestMapping(value = "storage/updateListFiles",method = RequestMethod.POST)
    public List updateListFiles() {
        return storageComponent.getListAllFiles();
    }

    @RequestMapping(value = "/storage/uploadFile",method = RequestMethod.POST)
    public void uploadFile(){

    }

    @RequestMapping(value = "/storage/downloadFile",method = RequestMethod.POST)
    public void downloadFile(){

    }

}
