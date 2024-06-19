package my_package.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbldesignations")
public class Designations {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int designation_id;
	private  String designation_name;
	
	public Designations() {
		super();
	}
	public Designations(int designation_id, String designation_name) {
		super();
		this.designation_id = designation_id;
		this.designation_name = designation_name;
	}
	public int getDesignation_id() {
		return designation_id;
	}
	public void setDesignation_id(int designation_id) {
		this.designation_id = designation_id;
	}
	public String getDesignation_name() {
		return designation_name;
	}
	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}
	
}
