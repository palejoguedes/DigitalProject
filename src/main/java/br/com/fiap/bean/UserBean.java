package br.com.fiap.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.fiap.dao.UserDAO;
import br.com.fiap.model.User;

@ManagedBean
public class UserBean {
	private User user = new User();
	
	public void save() {
		new UserDAO().save(this.user);
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Usuario cadastrado com sucesso"));
		System.out.println(this.user);
	}
	
	public List<User> getUsers(){
		return new UserDAO().getAll();
	}
	
	public User getUser() {
		return this.user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
