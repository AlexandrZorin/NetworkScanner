package ru.technex.networkscanner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.technex.networkscanner.dao.ComputerDAO;
import ru.technex.networkscanner.entity.Computer;

@Component("ComputerService")
@Transactional
public class ComputerService {
    @Autowired
    ComputerDAO computerDAO;

    public void addComputer(Computer computer) {
        computerDAO.addComputer(computer);
    }
}
