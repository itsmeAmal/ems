package com.ems.daoImpl;

import com.ems.control.commonController;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.ems.dao.monthlySalaryDao;
import com.ems.databaseconnection.DatabaseConnection;
import com.ems.model.MonthlySalary;

public class monthlySalaryDaoImpl implements monthlySalaryDao {

    private String selectQuery = "select monthly_salary_id, monthly_salary_emp_id, monthly_salary_date, monthly_salary_basic_salary, "
            + "monthly_salary_fixed_allowence, monthly_salary_other_allowance, monthly_salary_deduction, monthly_salary_note,"
            + " monthly_salary_payment_status, monthly_salary_status from monthly_salary";

    @Override
    public boolean addMonthlySalary(MonthlySalary monthlySalary) throws SQLException {

        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("insert into monthly_salary(monthly_salary_emp_id, monthly_salary_date,"
                + " monthly_salary_basic_salary, monthly_salary_fixed_allowence, monthly_salary_other_allowance, monthly_salary_deduction, "
                + " monthly_salary_note, monthly_salary_payment_status, monthly_salary_status) values(?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, monthlySalary.getEmployeeId());
        ps.setDate(2, commonController.getCurrentJavaSqlDate());
        ps.setBigDecimal(3, monthlySalary.getBasicSalary());
        ps.setBigDecimal(4, monthlySalary.getFixedAllowence());
        ps.setBigDecimal(5, monthlySalary.getOtherAllowence());
        ps.setBigDecimal(6, monthlySalary.getSalaryDeduction());
        ps.setString(7, monthlySalary.getNote());
        ps.setInt(8, monthlySalary.getPaymentStatus());
        ps.setInt(9, monthlySalary.getStatus());
        ps.executeUpdate();
        System.out.println("innnnnn");
        return true;
    }

    @Override
    public ResultSet getAllMonthlySalaryDetail() throws SQLException {
        return new commonDaoImpl().getAllRecords(selectQuery);
    }

    @Override
    public ResultSet getMonthlySalaryDetailByOneAttribute(String attribute, String condition, String value)
            throws SQLException {
        return new commonDaoImpl().getResultByAttribute(selectQuery, attribute, condition, value);
    }

    @Override
    public boolean updateMonthlySalaryDetail(MonthlySalary monthlySalary) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("update monthly_salary set monthly_salary_basic_salary=?, monthly_salary_fixed_allowence=?, "
                + " monthly_salary_other_allowance=?, monthly_salary_deduction=? "
                + " where monthly_salary_note=? ");
        ps.setBigDecimal(1, monthlySalary.getBasicSalary());
        ps.setBigDecimal(2, monthlySalary.getFixedAllowence());
        ps.setBigDecimal(3, monthlySalary.getOtherAllowence());
        ps.setBigDecimal(4, monthlySalary.getSalaryDeduction());
        ps.setString(5, monthlySalary.getNote());
        ps.executeUpdate();
        return true;
    }

    @Override
    public boolean deleteMonthlySalaryDetail(String empName) throws SQLException {
        Connection con = DatabaseConnection.getDatabaseConnection();
        PreparedStatement ps = con.prepareStatement("delete from monthly_salary where monthly_salary_note=?");
        ps.setString(1, empName);
        ps.executeUpdate();
        return true;
    }

}
