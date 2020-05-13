package com.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.ems.model.MonthlySalary;

public interface monthlySalaryDao {

    public boolean addMonthlySalary(MonthlySalary monthlySalary) throws SQLException;

    public ResultSet getAllMonthlySalaryDetail() throws SQLException;

    public ResultSet getMonthlySalaryDetailByOneAttribute(String attribute, String condition, String value) throws SQLException;

    public boolean updateMonthlySalaryDetail(MonthlySalary monthlySalary) throws SQLException;

    public boolean deleteMonthlySalaryDetail(String salaryDetailId) throws SQLException;

}
