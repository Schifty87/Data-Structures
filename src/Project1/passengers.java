package Project1;

public class passengers {

	private String index;
	private String rank, age, sex;
	private String survived;
	
	public passengers(String index, String rank, String age, String sex, String survived){
		this.index = index;
		this.rank = rank;
		this.age = age;
		this.sex = sex;
		this.survived = survived;
	}

	/**
	 * @return the index
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(String index) {
		this.index = index;
	}

	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/**
	 * @param survived the survived to set
	 */
	public void setSurvived(String survived) {
		this.survived = survived;
	}

	public String getSurvived() {
		// TODO Auto-generated method stub
		return survived;
	}

	public String toString(){
		return (index + " " + rank + " " + age + " " + sex + " " + survived);
	}
	
}
