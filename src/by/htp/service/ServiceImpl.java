package by.htp.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import by.htp.dao.DaoImpl;

public class ServiceImpl implements ServiceInterface {

	@Override
	public void moreOneBook() {
		String query1="select e.name,count(b.id_book)as count from employee e join employee_book eb on e.id_employee=eb.id_employee join book b on eb.id_book=b.ID_BOOK  group by e.name having count(b.id_book)>1";
		DaoImpl dao =new DaoImpl();
		String query="select name from employee";
		try {
			ResultSet rs=dao.dbconnection(query1);
			while(rs.next())
				System.out.println(rs.getString("NAME")+"  |" +rs.getString("COUNT") );
				//System.out.println(rs.getString("name"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void lessTwoBooks() {
		String query="select e.name,date_of_birth,count(b.id_book)as count from employee e join employee_book eb on e.id_employee=eb.id_employee join book b on eb.id_book=b.ID_BOOK having count(b.id_book)<3  group by e.name,date_of_birth"; 

		DaoImpl dao =new DaoImpl();
		
		try {
			ResultSet rs=dao.dbconnection(query);
			while(rs.next())
				System.out.println(rs.getString("NAME")+"  |" + rs.getDate("DATE_OF_BIRTH")+"  |" +rs.getString("COUNT") );
					
				
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void rename() {
		
			String query1="Update Book set Name='Besy' where name='Idiot'";
			DaoImpl dao =new DaoImpl();
			
			try {
				ResultSet rs=dao.dbconnection(query1);
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	

}
