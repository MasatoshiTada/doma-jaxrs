package com.example.exception.mapper;

import com.example.exception.dto.ExceptionDto;

import javax.validation.ConstraintViolationException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.*;

/**
 * Created by tada on 2015/10/12.
 */
@Provider
public class ConstraintViolationExceptionMapper implements javax.ws.rs.ext.ExceptionMapper<ConstraintViolationException> {
    @Override
    public Response toResponse(ConstraintViolationException exception) {
        String[] messages = exception.getConstraintViolations()
                .stream()
                .map(violation -> violation.getMessage())
                .toArray(String[]::new);
        ExceptionDto dto = new ExceptionDto("入力エラー", messages);
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(dto).build();
    }
}
