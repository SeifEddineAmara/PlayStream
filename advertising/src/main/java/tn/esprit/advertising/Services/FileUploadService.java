package tn.esprit.advertising.Services;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import tn.esprit.advertising.Interfaces.IFileUploadService;

import java.io.File;
import java.io.IOException;

@Service
public class FileUploadService implements IFileUploadService {
    @Override
    public void uploadfile(MultipartFile file) throws IllegalStateException, IOException {
        file.transferTo(new File("C:\\Users\\houss\\Desktop\\microservice\\ImmoFront\\PiImmoFront\\src\\assets\\"+file.getOriginalFilename()));
    }
}
