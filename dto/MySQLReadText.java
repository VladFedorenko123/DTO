package src.srccode.dto;

import java.sql.ResultSet;
import java.sql.Statement;

import src.srccode.interfaces.MySQLConnector;
import src.srccode.interfaces.Reader;

public class MySQLReadText implements Reader {
	MySQLConnector con = new MySQLConnect();

	@Override
	public String getText() {
		try {
			Statement statement = con.connection().createStatement();

			ResultSet resultSet = statement.executeQuery("SELECT * FROM mytable");
			String myText = null;
			while (resultSet.next()) {
				String text1 = resultSet.getString(2);
				myText = text1;
			}
			return myText;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
