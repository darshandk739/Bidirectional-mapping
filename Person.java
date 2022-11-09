package onetooone_bi2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Person {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String name;
		private int age;
		private String gender;
		
		@OneToOne
		@JoinColumn
		private AadharCard aadharcard;

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

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public AadharCard getAadharcard() {
			return aadharcard;
		}

		public void setAadharcard(AadharCard aadharcard) {
			this.aadharcard = aadharcard;
		}
		
		
}
