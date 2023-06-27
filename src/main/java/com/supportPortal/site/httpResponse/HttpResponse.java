package com.supportPortal.site.httpResponse;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HttpResponse {
    private int httpStatusCode;
    private HttpStatus httpStatus;
    private String reason;
    private String message;


/*
    {
        code:200;
        httpStatus:"OK",
        reason: "Ok",
        message: "Your Request was Successful",
    }

 */

}
