package Application.controllers;

import Application.entity.Employee;
import Application.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeesController {

    private EmployeesRepository repository;

    @Autowired
    public void setEmployeesRepository(EmployeesRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/update_employee")
    public void updateEmployee(@RequestParam int id,
                               @RequestParam String fio,
                               @RequestParam String position,
                               @RequestParam String phoneNumber){

        Employee employee = new Employee(id, fio, position, phoneNumber);

        repository.save(employee);
    }

    @PostMapping("/remove_employee")
    public void removeEmployee(@RequestParam int id){
            repository.deleteById(id);
    }

    @PostMapping("/add_employee")
    public Employee addEmployee(@RequestParam String fio,
                                @RequestParam String position,
                                @RequestParam String phoneNumber){

        Employee employee = new Employee(fio, position, phoneNumber);

        return repository.save(employee);
    }

    @PostMapping("/get_all_employees")
    public Iterable<Employee> testPrint(){

        for (Employee e : repository.findAll()) {
            System.out.println(e.getId() + " " + e.getFio() + " " + e.getPhoneNumber() + " " + e.getPosition());
        }
        return repository.findAll();
    }

}
