package site.adityasinha.Springboot.tutorial.service;

import site.adityasinha.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> fetchDepartmentList();


    public Department fetchDepartmentById(Long departmentId);

   public void deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department);

    public Department fetchDepartmentByName(String departmentName);
}
