package com.example.resource;

import com.example.resource.dto.EmployeeDto;
import com.example.service.EmployeeService;
import org.hibernate.validator.constraints.NotBlank;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.validation.constraints.Pattern;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by tada on 2015/10/12.
 */
@Path("employees")
@RequestScoped
public class EmployeeResource {

    @Inject
    private EmployeeService employeeService;

    @GET
    @Path("{empId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response selectById(@PathParam("empId")
                                   @Pattern(regexp = "[1-9][0-9]*") String empIdStr) {
        Integer empId = Integer.valueOf(empIdStr);
        EmployeeDto employeeDto = employeeService.selectById(empId)
                .orElseThrow(() -> new NotFoundException("該当する社員が見つかりませんでした"));
        return Response.ok(employeeDto).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response selectLikeName(@QueryParam("name") @NotBlank
                               @Pattern(regexp = "[a-zA-Z]+") String name) {
        List<EmployeeDto> list = employeeService.selectLikeName(name);
        if (list.isEmpty()) {
            throw new NotFoundException("該当する社員が見つかりませんでした");
        }
        return Response.ok(list).build();
    }
}
