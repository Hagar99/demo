package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDaoImple implements EmployeeDao {

	public List<Employee> findAll() {

		List<Employee> employees = new LinkedList<>();
		Connection con = DBConnection.getConnection();

		if (con == null)
			return null;
		else {
			String query = "SELECT * FROM employee;";
			try (PreparedStatement prep = con.prepareStatement(query)) {

				ResultSet result = prep.executeQuery();
				while (result.next()) {

					Employee em = new Employee(result.getInt("id"), result.getString("name"),
							result.getBoolean("gender"), result.getDate("birth_date"), result.getDouble("salary"));

					employees.add(em);
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return employees;
	}

	public Employee findallById(int id) {

		Connection con = DBConnection.getConnection();
		if (con == null)
			return null;
		else {

			String query = "SELECT * FROM employee WHERE id = ?;";
			try (PreparedStatement pre = con.prepareStatement(query)) {

				pre.setInt(1, id);

				ResultSet res = pre.executeQuery();
				if (res.next())
					return new Employee(res.getInt("id"), res.getString("name"), res.getBoolean("gender"),
							res.getDate("birth_date"), res.getDouble("salary"));
				;

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return null;
		}
	}

	public void save(Employee emp) {

		Connection con = DBConnection.getConnection();

		if (con == null)
			return;
		else {
			if (emp.getId() > 0) // update old one
			{
				String query = "UPDATE employee SET name =?, gender =?, birth_date =?, salary =? WHERE id = ?;";

				try (PreparedStatement prepStet = con.prepareStatement(query);) {

					int indx = 1;

					prepStet.setString(indx++, emp.getName());
					prepStet.setBoolean(indx++, emp.getGender());
					prepStet.setDate(indx++, (java.sql.Date) emp.getBirth_date());
					prepStet.setDouble(indx++, emp.getSalary());
					prepStet.setInt(indx++, emp.getId());

					prepStet.executeUpdate();

				} catch (SQLException e) {

					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
				}

			} else { // create

				String query = "INSERT INTO employee(name, gender, birth_date, salary) VALUES(? , ?, ? , ?);";

				try (PreparedStatement prepStet = con.prepareStatement(query);) {

					int indx = 1;

					prepStet.setString(indx++, emp.getName());
					prepStet.setBoolean(indx++, emp.getGender());
					prepStet.setDate(indx++, (java.sql.Date) emp.getBirth_date());
					prepStet.setDouble(indx++, emp.getSalary());

					prepStet.executeUpdate();

				} catch (SQLException e) {

					e.printStackTrace();
				} finally {
					try {
						con.close();
					} catch (SQLException e) {

						e.printStackTrace();
					}
				}
			}
		}

	}

	public void deleteById(int id) {
		Connection con = DBConnection.getConnection();
		if (con == null)
			System.out.println("not connected!");
		else {

			String query = "DELETE FROM employee WHERE id =?;";
			try (PreparedStatement pre = con.prepareStatement(query)) {

				pre.setInt(1, id);
				int res = pre.executeUpdate();
				if (res == 1)
					System.out.println("Deleted!");

			} catch (SQLException e) {

				e.printStackTrace();
			}finally {
				try {
					con.close();
				}catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
