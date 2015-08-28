public class Person {
    //composition has-a relationship
    private Job job;
    private Education schools;
    


	public Education getSchools() {
		return schools;
	}

	public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        
        this.schools = new Education();

        
    }
 
    public long getSalary() {
        return job.getSalary();
    }
    
    
}

