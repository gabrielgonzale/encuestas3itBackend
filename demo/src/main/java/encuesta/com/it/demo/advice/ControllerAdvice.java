package encuesta.com.it.demo.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import encuesta.com.it.demo.exception.EmailDuplicadoException;

@RestControllerAdvice
public class ControllerAdvice {
    
      @ExceptionHandler(EmailDuplicadoException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<String> manejarEmailDuplicado(EmailDuplicadoException ex) {
        String mensajeDeError = "Error: El correo electrónico ya está en uso. Por favor, utilice otro correo electrónico.";
        return ResponseEntity.badRequest().body(mensajeDeError);
    }
}
