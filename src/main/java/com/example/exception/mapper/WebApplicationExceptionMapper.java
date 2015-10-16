package com.example.exception.mapper;

import com.example.exception.dto.ExceptionDto;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 * Javaの例外クラス名をクライアントにそのままレスポンスしているので、
 * このコードは本番環境では真似しないでください。
 * あくまで学習用のサンプルと捉えてください。
 * Created by tada on 2015/10/12.
 */
@Provider
public class WebApplicationExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<WebApplicationException> {
    @Override
    public Response toResponse(WebApplicationException exception) {
        System.out.println("==========================");
        exception.printStackTrace();
        System.out.println("==========================");
        ExceptionDto dto = new ExceptionDto(exception.getClass().getName(), exception.getMessage());
        return Response.status(exception.getResponse().getStatusInfo())
                .entity(dto).build();
    }
}
