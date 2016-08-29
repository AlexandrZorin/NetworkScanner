package ru.technex.networkscanner.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import ru.technex.networkscanner.dao.ComputerDAO;
import ru.technex.networkscanner.entity.Computer;

public class ComputerDAOImpl implements ComputerDAO {
    private final SessionFactory sessionFactory;

    @Autowired
    public ComputerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addComputer(Computer computer) {
        sessionFactory.getCurrentSession().save(computer);
    }
}
