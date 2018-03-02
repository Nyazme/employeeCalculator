package com.mark.employeeCalculator.data;

import com.mark.employeeCalculator.model.Employee;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmployeeRepository {
    private List <Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public Employee findEmployeeById(String id){
        for(Employee employee : employeeList){
            if(employee.getId().equalsIgnoreCase(id)){
                return employee;
            }
        }

        return null;
    }

}
