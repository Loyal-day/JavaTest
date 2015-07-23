package test;

import java.util.*;

public class test5 {

	public static void main(String argn[]){
		
		Map<String, String> CourseMap = new HashMap<String, String>();
		
		SchoolCourse[] sc = new SchoolCourse[10];
		sc[0] = new SchoolCourse("Tom","CoreJava");
		sc[1] = new SchoolCourse("John","Oracle");
		sc[2] = new SchoolCourse("Susan","Oracle");
		sc[3] = new SchoolCourse("Jerry","JDBC");
		sc[4] = new SchoolCourse("Jim","Unix");
		sc[5] = new SchoolCourse("Kevin","Jsp");
		sc[6] = new SchoolCourse("Lucy","Jsp");
		
		int n=7;
		for (int i = 0; i < n; i++){
			CourseMap.put(sc[i].getTeacher(), sc[i].getCourse());
		}
		
		//printMaps(CourseMap);
		//System.out.println();
		
		sc[n] = new SchoolCourse("Allen","JDBC");	
		CourseMap.put(sc[n].getTeacher(), sc[n].getCourse());
		n+=1;
		
		//printMaps(CourseMap);
		//System.out.println();
		
		for (int i = 0; i < n; i++){
			if (sc[i].getTeacher() == "Lucy"){
				
				sc[i].setCourse("CoreJava");
				CourseMap.put(sc[i].getTeacher(),sc[i].getCourse());
				break;
				
			}
		}
		
		printMaps(CourseMap);
		System.out.println();
			
	}	
	
	public static void printMaps(Map<String, String> map)
	{
		
		Set<Map.Entry<String, String>> entries = map.entrySet();
		if (entries != null){
			
			for(Map.Entry<String, String> entry: entries){
				System.out.printf("%-8s%-10s\n",entry.getKey(),entry.getValue());
				//System.out.println(entry.getKey()+"  "+entry.getValue());
			}

/*			Iterator iterator = entries.iterator();
			while(iterator.hasNext()) {
				Map.Entry<String, String> entry =(Map.Entry<String, String>) iterator.next();
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
*/			
		}
		
	}
	
}

class SchoolCourse{
	
	private String teacher;
	private String course;
	
	public SchoolCourse(){
	}
	
	public SchoolCourse(String teacher, String course){
		
		this.teacher = teacher;
		this.course = course;
			
	}

	public void setTeacher(String teacher){
		this.teacher = teacher;
	}
	
	public void setCourse(String course){
		this.course = course;
	}
	
	public String getTeacher(){
		return this.teacher;
	}
	
	public String getCourse(){
		return this.course;
	}
	
}

