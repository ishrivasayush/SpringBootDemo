package com.Narainox.SpringbootTutoial.departmentController;

import com.Narainox.SpringbootTutoial.entity.Department;
import com.Narainox.SpringbootTutoial.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department)
    {
        return departmentService.createDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> getAllDepartments()
    {
        return departmentService.getAll();
    }

    @GetMapping("/departments/{departmentId}")
    public Department getDepartment(@PathVariable long departmentId)
    {
        return departmentService.fetchDepartment(departmentId);
    }

    @DeleteMapping("/departments/{departmentId}")
    public String deleteDepartmentById(@PathVariable long departmentId)
    {
        departmentService.deleteDepartment(departmentId);
        return "Delete Department successfully !!";
    }

    @PutMapping("/departments/{departmentId}")
    public Department updateDepartment(@PathVariable long departmentId,
                                       @RequestBody Department department)
    {
        return departmentService.updateDepartment(departmentId,department);
    }

    @GetMapping("/departments/name/{departmentName}")
    public Department getDepartment(@PathVariable String departmentName)
    {
        return departmentService.getDepartmentByName(departmentName);
    }
}
