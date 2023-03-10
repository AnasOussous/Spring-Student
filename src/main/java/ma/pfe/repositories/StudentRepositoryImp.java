package ma.pfe.repositories;

import ma.pfe.controllers.StudentController;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepositoryImp implements  StudentRepository{

    private final Logger LOG = LoggerFactory.getLogger(StudentRepositoryImp.class);
    @Override
    public StudentEntity create(StudentEntity studentEntity) {
        LOG.debug("start method create");
        return null;
    }

    @Override
    public boolean update(StudentEntity studentEntity) {
        LOG.debug("start method update");
        return false;
    }

    @Override
    public boolean delete(Long id) {
        LOG.debug("start method delete");
        return false;
    }

    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start method read all");
        return null;
    }
}
