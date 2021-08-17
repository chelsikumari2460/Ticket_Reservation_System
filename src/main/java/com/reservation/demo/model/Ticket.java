package com.reservation.demo.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

@Entity
public class Ticket {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column (name="id" ,nullable=false,unique=true)
    private int id;
	private float price;
	private String pnr;
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	private String gender;
	
	@ManyToOne(targetEntity=Train.class,cascade=CascadeType.ALL )
	@JoinColumn(name="train_nofk",referencedColumnName="train_no")
	private Train trainobj;
	
	
	@ManyToOne(targetEntity=User.class,cascade=CascadeType.ALL)
	@JoinColumn(name="user_idfk",referencedColumnName="userid")
	private User user;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public Train getTrainobj() {
		return trainobj;
	}
	public void setTrainobj(Train train) {
		this.trainobj = train;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user2) {
		this.user = user2;
	}

	@PrePersist
    protected void onCreate() {
        setPnr(java.util.UUID.randomUUID().toString());
    }
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", price=" + price + ", pnr=" + pnr + ", name=" + name + ", age=" + age
				+ ", gender=" + gender + ", trainobj=" + trainobj + ", user=" + user + "]";
	}
	 
	
	
	
}
