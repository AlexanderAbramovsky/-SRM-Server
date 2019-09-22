package Application.controllers;

import Application.entity.Employee;
import Application.entity.Parent;
import Application.repository.EmployeesRepository;
import Application.repository.ParentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parents")
public class ParentController {

    private ParentsRepository repository;

    @Autowired
    public void setParentsRepository(ParentsRepository repository) {
        this.repository = repository;
    }

    public void addParent(){

        Parent parent = new Parent(null ,"Абрамовский", "Александр", "Владимирович", "89237795552",
                "89237795552", "1111", "123456", "Отделением УФМС РОССИИ ПО АЛТАЙСКОМУ КРАЮ",
                "22.09.2019", "220 - 05", "22.09.2019", "123456789101112", "11,12,13");

        repository.save(parent);
    }

    @PostMapping("/get_all")
    public Iterable<Parent> getAllParents(){
        //addParent();
        return repository.findAll();
    }

}
