package ru.shumilin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import ru.shumilin.storage.StorageProperties;
import ru.shumilin.storage.FileSystemStorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class WebChatStorageApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebChatStorageApplication.class,args);
    }

//    clear storage directory for start
//    @Bean
//    CommandLineRunner init(FileSystemStorageService storageService) {
//        return (args) -> {
//            storageService.deleteAll();
//            storageService.init();
//        };
//    }
}
