package co.com.action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;
import co.com.data.dto.Person;
import co.com.service.PersonService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author jpatarroyo
 */
public class PersonAction extends ActionSupport {

    private long peopleCount;

    Logger log = LogManager.getLogger(PersonAction.class);

    @Autowired
    private PersonService personService;

    private List<Person> people;

    @Override
    public String execute() {
        log.info("Executing method...");
        this.people = personService.getPeople();
        this.peopleCount = personService.countPeople();
        return SUCCESS;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public long getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(long peopleCount) {
        this.peopleCount = peopleCount;
    }
}
