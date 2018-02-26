package com.parfait.simplereactjs;

import com.parfait.simplereactjs.employee.domain.Employee;
import com.parfait.simplereactjs.employee.domain.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    @Autowired
    public DatabaseLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Employee employee = new Employee("Frodo", "Baggins", "ring bearer");
        this.repository.save(employee);
        log.info("saved : {}", employee);
    }
}