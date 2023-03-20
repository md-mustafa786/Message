package com.example.Message.exception;

import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String,String> methodArgumentException(MethodArgumentNotValidException ex){
        BindingResult bindResult = ex.getBindingResult();
        List<ObjectError> allError = bindResult.getAllErrors();
        Map<String,String> errorList = new HashMap<>();
        for(ObjectError error:allError){
            String Message = error.getDefaultMessage();
            String field = ((FieldError) error).getField();
            errorList.put(field,Message);
        }
        return errorList;
    }
}
