import java.io.*;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class helloBean implements Serializable {
	
	String name;
	String address;
	String beanName="hello bean viresh";
	hiBean hibean ;

	public hiBean getHibean() {
		return hibean;
	}

	public void setHibean(hiBean hibean) {
		this.hibean = hibean;
	}

	public String getBeanName() {
		return beanName;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
