package trainingManagementSystem.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import trainingManagementSystem.model.Division;

@Component
public class DivisionDao {
	@Autowired
	HibernateTemplate hibernateTemplate;

	// save division
	@Transactional
	public void saveDivision(Division division) {
		hibernateTemplate.save(division);
	}

	// get all division
	public List<Division> getAllDivision() {
		return hibernateTemplate.loadAll(Division.class);
	}

	// get user by division
	public Division getById(Integer id, Boolean isLock) {
		return hibernateTemplate.get(Division.class, id);
	}

	// update division
	@Transactional
	public void updateDivision(Division division) {
		hibernateTemplate.update(division);
	}

	// delete division
	@Transactional
	public void deleteDivision(Integer id)

	{
		hibernateTemplate.delete(hibernateTemplate.get(Division.class, id));
	}

}
