package ru.technex.networkscanner.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.technex.networkscanner.dao.ComputerDAO;
import ru.technex.networkscanner.entity.Computer;

@Repository
@Transactional
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
