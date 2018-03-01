package ru.shumilin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.shumilin.component.StorageComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class StorageController {

    @Autowired
    StorageComponent storageComponent;

    @RequestMapping(value = "storage/updateListFiles",method = RequestMethod.POST)
    public List updateListFiles() {
        return storageComponent.getListAllFiles();
    }

    @RequestMapping(value = "/storage/uploadFile",method = RequestMethod.POST)
    public void uploadFile(Map<String,Object> model, @RequestParam(value = "filePath") String filePath){
        storageComponent.uploadFileToStorage(filePath);
    }

    @RequestMapping(value = "/storage/downloadFile",method = RequestMethod.POST)
    public void downloadFile(){

    }

}
