package ca.cmpt213.secure;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AdminController {
    @GetMapping("/admin/secureAPI")
    public ResponseEntity secureAPI(@RequestHeader HttpHeaders headers) {
        return new ResponseEntity<>("Auth passed - secure data", HttpStatus.OK);
    }

    @GetMapping("/public/openAPI")
    public ResponseEntity openAPI(@RequestHeader HttpHeaders headers) {
        return new ResponseEntity<>("Public data", HttpStatus.OK);
    }
}


