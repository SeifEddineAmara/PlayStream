package tn.esprit.advertising.Interfaces;

import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

public interface IFileUploadService {
    void uploadfile(MultipartFile file) throws IllegalStateException, IOException;

}
