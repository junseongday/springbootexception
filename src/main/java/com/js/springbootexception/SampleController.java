package com.js.springbootexception;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetMapping("/hello")
    public String hello() {
        throw new SampleException();
    }

    @ExceptionHandler(SampleException.class)
    public @ResponseBody AppError SampleError(SampleException e) {
        AppError appError = new AppError();
        appError.setMessage("app.error.key");
        appError.setReason("idk idk idk");
        return appError;
    }
}
