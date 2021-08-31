package one.digitalinnovation.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PresonNotFoundException extends Exception {
    public PresonNotFoundException(Long id) {
        super("Person not found whith Id " + id);
    }
}
