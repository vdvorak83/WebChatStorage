package ru.shumilin.component.storageComponent;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;


@Component
public class StorageComponent {

    @Value("${storagePath}")
    private String storageLocation;
    private Path storagePath;
    //повесить на кнопку обновления списка файлов, в дальнейшем поток демон будет обновлять его для клиента
    public ArrayList<String> getListAllFiles(){
        ArrayList<String> listFiles = new ArrayList<>();
        return listFiles;
    }

    //загрузка файла в хранилище
    public void uploadFileToStorage(MultipartFile file){
        storagePath = Paths.get(storageLocation);
        String filename = StringUtils.cleanPath(file.getOriginalFilename());
        System.out.println("Let upload file: " + filename);
        try {
            if (file.isEmpty()) {
                throw new StorageException("Failed to store empty file " + filename);
            }
            if (filename.contains("..")) {
                // This is a security check
                throw new StorageException(
                        "Cannot store file with relative path outside current directory "
                                + filename);
            }
            Files.copy(file.getInputStream(), storagePath.resolve(filename),
                    StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e) {
            throw new StorageException("Failed to store file " + filename, e);
        }
    }

    //скачать файл из хранилища
    public void downloadFileFromStorage(String fileName){
        System.out.println("Davai skachaem file");
    }
}
