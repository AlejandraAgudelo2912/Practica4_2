package ParteA;



public class Modulo {
	private String id;
	private String name;
	private String curso;
	private String horas;
	private String teacher;

	public Alumno[] alumno;
	
	public Modulo(){
	}
	public Modulo(String id, String name, String curso, String horas, String teacher){
		setId(id);
		setName(name);
		setCurso(curso);
		setHoras(horas);
		setTeacher(teacher);
	}
		
	
	public String getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public String getCurso() {
		return this.curso;
	}
	public String getHoras() {
		return this.horas;
	}
	public String getTeacher() {
		return this.teacher;
	}
	
	public void setId(String id) {	
		this.id=id;		
	}
	public void setName(String name) {	
		this.name=name;		
	}
	public void setCurso(String curso) {	
		this.curso=curso;		
	}
	public void setHoras(String horas) {	
		this.horas=horas;		
	}
	public void setTeacher(String teacher) {	
		this.teacher=teacher;		
	}
	

}
