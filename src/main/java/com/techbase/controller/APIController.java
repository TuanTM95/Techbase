package com.techbase.controller;

import com.techbase.domain.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class APIController {
    private final PositionService positionService;
    private final TeamService teamService;
    private final DepartmentService departmentService;
    private final EmployeeService employeeService;

    public APIController(PositionService positionService, TeamService teamService, DepartmentService departmentService, EmployeeService employeeService) {
        this.positionService = positionService;
        this.teamService = teamService;
        this.departmentService = departmentService;
        this.employeeService = employeeService;
    }

    // test
    @RequestMapping(method = RequestMethod.GET)
    public String helloWorld() {
        return "Hello World";
    }

    //get all Position
    @RequestMapping(value = "/getAllPosition", method = RequestMethod.POST)
    @ResponseBody
    public APIModel getAllPosition() {
        ArrayResponse response = new ArrayResponse();
        List<PositionEntity> entity = positionService.getListPosition();
           return response.setRstDataArray1(entity);
        }

    // get all Team
    @RequestMapping(value = "/getAllTeam", method = RequestMethod.POST)
    @ResponseBody
    public APIModel getAllTeam() {
        ArrayResponse response = new ArrayResponse();
        List<TeamEntity> entity = teamService.getListTeam();
        return response.setRstDataArray2(entity);
    }

    // get all Department
    @RequestMapping(value = "/getAllDepartment", method = RequestMethod.POST)
    @ResponseBody
    public APIModel getAllDepartment() {
        ArrayResponse response = new ArrayResponse();
        List<DepartmentEntity> entity = departmentService.getListDepartment();
        return response.setRstDataArray3(entity);
    }

    // get all Employee
    @RequestMapping(value = "/getAllEmployee", method = RequestMethod.POST)
    @ResponseBody
    public APIModel getAllEmployee() {
        ArrayResponse response = new ArrayResponse();
        List<EmployeeEntity> entity = employeeService.getListEmployee();
        return response.setRstDataArray4(entity);
    }

    // add new Team
    @RequestMapping(value = "/addNewTeam", method = RequestMethod.POST)
    @ResponseBody
    public APIModel insertNewTeam(@RequestBody TeamRequest request) {
        return (APIModel) teamService.insertNewTeam(request);

    }

    // add new Department
    // add new Employee

}
