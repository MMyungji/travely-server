package com.travely.travely.advice;

import com.travely.travely.dto.exception.ExceptionResponseDto;
import com.travely.travely.exception.NotFoundStoreException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class StoreExceptionControllerAdvice {
    private static final String FIELD ="store";

    @ExceptionHandler(NotFoundStoreException.class)
    public ResponseEntity<ExceptionResponseDto> emailAlreadyExists(NotFoundStoreException exception) {
        log.debug("[NotFoundStoreException]  {}", exception.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(ExceptionResponseDto.builder()
                        .field(FIELD)
                        .message(exception.getMessage())
                        .build());
    }
}