package src;

public class StatusBuilder {
	
	private Integer id;
	private String status;
	
	public StatusBuilder() {
	}
	
	public StatusBuilder withId(Integer id) {
		this.id = id;
		return this;
	}
	
	public StatusBuilder withStatus(String status) {
		this.status = status;
		return this;
	}
	
	public Status build() {
		Status s = new Status();
		s.setId(this.id);
		s.setStatus(this.status);
		return s;
	}
	
	

}
