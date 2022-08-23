package trainingManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import trainingManagementSystem.dao.DivisionDao;
import trainingManagementSystem.model.Division;

@Component
@Service
public class DivisionServices {
	@Autowired
	DivisionDao divisionDao;

	// save division
	public void saveDivision(Division division) {
		try {
			divisionDao.saveDivision(division);
		} catch (Exception e) {
			throw e;
		}
	}

	// get all division
	public List<Division> getAllDivision() {
		try {
			return divisionDao.getAllDivision();
		} catch (Exception e) {
			throw e;
		}
	}

	// get by id
	public Division getById(Integer id, Boolean isLock) {
		try {
			return divisionDao.getById(id, isLock);
		} catch (Exception e) {
			throw e;
		}
	}

	// update division
	public void updateDivision(Division division) {
		try {
			divisionDao.updateDivision(division);
		} catch (Exception e) {
			throw e;
		}
	}

	// delete division
	public void deleteDivision(Integer id) {
		try {
			divisionDao.deleteDivision(id);
		} catch (Exception e) {
			throw e;
		}
	}
}
