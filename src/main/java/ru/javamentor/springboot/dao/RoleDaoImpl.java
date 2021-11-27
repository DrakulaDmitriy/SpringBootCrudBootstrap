package ru.javamentor.springboot.dao;

import org.springframework.stereotype.Repository;
import ru.javamentor.springboot.model.Role;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("SELECT role FROM Role role", Role.class).getResultList();
    }

    @Override
    public Role getRole(String userRole) {
<<<<<<< HEAD
        return entityManager.createQuery("SELECT role FROM Role role WHERE role.userRole =: userRole", Role.class)
=======
        return entityManager.createQuery("SELECT role FROM Role role where role.userRole =: userRole", Role.class)
>>>>>>> c58d5b869a472c2de264a9363d5b0ae73351ff25
                .setParameter("userRole", userRole).getSingleResult();
    }

    @Override
    public Role getRoleById(Long id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public void addRole(Role role) {
        entityManager.persist(role);
    }
}
