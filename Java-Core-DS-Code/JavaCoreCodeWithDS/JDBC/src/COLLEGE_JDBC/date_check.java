package COLLEGE_JDBC;

public class date_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Date udate=new java.util.Date();	
		System.out.println("util date:"+udate);
		
		long l=udate.getTime();
		java.sql.Date sdate=new java.sql.Date(l);
		
		System.out.println("sql date"+sdate);

	}

}
