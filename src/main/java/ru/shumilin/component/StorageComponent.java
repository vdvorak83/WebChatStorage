package ru.shumilin.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


@Component
public class StorageComponent {

    //повесить на кнопку обновления списка файлов, в дальнейшем поток демон будет обновлять его для клиента
    public ArrayList<String> getListAllFiles(){
        ArrayList<String> listFiles = new ArrayList<>();
        return listFiles;
    }

    //загрузка файла в хранилище
    public void uploadFileToStorage(String pathFile){

    }
    //скачать файл из хранилища
    public void downloadFileFromStorage(String fileName){

    }
}
