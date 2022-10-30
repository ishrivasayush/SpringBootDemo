package com.Narainox.SpringbootTutoial.service;

import com.Narainox.SpringbootTutoial.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(Department department);

    List<Department> getAll();

    Department fetchDepartment(long departmentId);

    void deleteDepartment(long departmentId);

    Department updateDepartment(long departmentId, Department department);

    Department getDepartmentByName(String departmentName);
}
