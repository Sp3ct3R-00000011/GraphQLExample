package com.accenture.graphQLDemo.service;
import com.accenture.graphQLDemo.model.Person;
import com.accenture.graphQLDemo.repository.PersonRepo;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.List;

@Component
public class PersonServiceImpl implements GraphQLQueryResolver, GraphQLMutationResolver {
    @Autowired
    private PersonRepo pRepo;

    public Person getByPersonID(Integer id) {
        return pRepo.getById(id);
    }

    public Person createPerson(Person p) {
        pRepo.save(p);
        return p;
    }


    public List<Person> getAllPersonList() {
        return pRepo.findAll();
    }


    public Person updatePersonDetails(Integer id, Person p) {
        Person p1 = pRepo.findById(id).get();
        p.setpID(p1.getpID());
        pRepo.save(p);

        return p;
    }


    public String deletePersonDetails(Integer id) {
        pRepo.deleteById(id);
        return "Deleted Successfully!!";
    }
}
