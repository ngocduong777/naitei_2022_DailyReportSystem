package trainingManagementSystem.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "Divisions")
public class Division extends BaseEntity {
	private String name;
	private String description;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "division")
	private List<User> users;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "managerId", referencedColumnName = "id")
	private User manager;

	public Division() {
		super();
	}

	public Division(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public User getManager() {
		return manager;
	}

	public String getName() {
		return name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setManager(User manager) {
		this.manager = manager;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	

}
