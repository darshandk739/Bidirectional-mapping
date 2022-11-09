package manytomany_bi2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private int age;
		private long phone;
		@ManyToMany
		@JoinTable(joinColumns = {@JoinColumn},inverseJoinColumns = {@JoinColumn(name="id")}  )
		private List<Teacher> teachers;
		public List<Teacher> getTeachers() {
			return teachers;
		}
		public void setTeachers(List<Teacher> teachers) {
			this.teachers = teachers;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
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
		public long getPhone() {
			return phone;
		}
		public void setPhone(long phone) {
			this.phone = phone;
		}
		
		
}
