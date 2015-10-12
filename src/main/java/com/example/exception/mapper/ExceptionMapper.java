package com.example.exception.mapper;

import com.example.exception.dto.ExceptionDto;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

/**
 * Created by tada on 2015/10/12.
 */
@Provider
public class ExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<Exception> {

    @Override
    public Response toResponse(Exception exception) {
        System.out.println("==========================");
        exception.printStackTrace();
        System.out.println("==========================");
        ExceptionDto dto = new ExceptionDto(
                exception.getClass().getName()
                , exception.getMessage());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                .entity(dto).build();
    }
}
