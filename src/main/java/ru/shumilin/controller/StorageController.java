package ru.shumilin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import ru.shumilin.component.storageComponent.StorageComponent;

import java.util.List;

@Controller
public class StorageController {

    @Autowired
    StorageComponent storageComponent;

    @RequestMapping(value = "storage/updateListFiles",method = RequestMethod.POST)
    public List updateListFiles() {
        return storageComponent.getListAllFiles();
    }

    @PostMapping(value = "/storage/uploadFile")
    public String uploadFile(@RequestParam("file") MultipartFile file,
            RedirectAttributes redirectAttributes){
        storageComponent.uploadFileToStorage(file);
        redirectAttributes.addFlashAttribute("message",
                "You successfully uploaded " + file.getOriginalFilename() + "!");
        return "storagePage";
    }

    @RequestMapping(value = "/storage/downloadFile",method = RequestMethod.POST)
    public void downloadFile(){
        storageComponent.downloadFileFromStorage("");
    }

}
