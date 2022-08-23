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

	// get all division
	public List<Division> getAllDivision() {
		try {
			return divisionDao.getAllDivision();
		} catch (Exception e) {
			throw e;
		}
	}

}
