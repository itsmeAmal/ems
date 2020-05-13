package com.ems.control;

import com.ems.daoImpl.monthlySalaryDaoImpl;
import com.ems.model.MonthlySalary;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class monthlySalaryControl {

    public static boolean addMonthlySalary(int employeeId, Date salaryDate, BigDecimal basicSalary, BigDecimal fixedAllowence,
            BigDecimal otherAllowence, BigDecimal salaryDeduction, String note, int paymentStatus) throws SQLException {
        MonthlySalary monthlySalary = new MonthlySalary();
        monthlySalary.setEmployeeId(employeeId);
        monthlySalary.setDate(salaryDate);
        monthlySalary.setBasicSalary(basicSalary);
        monthlySalary.setFixedAllowence(fixedAllowence);
        monthlySalary.setOtherAllowence(otherAllowence);
        monthlySalary.setSalaryDeduction(salaryDeduction);
        monthlySalary.setNote(note);
        monthlySalary.setPaymentStatus(1);
        return new monthlySalaryDaoImpl().addMonthlySalary(monthlySalary);
    }

    public static boolean updateMonthlySalaryDetail(BigDecimal basicSalary, BigDecimal fixedAllowence,
            BigDecimal otherAllowence, BigDecimal salaryDeduction, String empNameNote) throws SQLException {
        MonthlySalary monthlySalary = new MonthlySalary();
        monthlySalary.setBasicSalary(basicSalary);
        monthlySalary.setFixedAllowence(fixedAllowence);
        monthlySalary.setOtherAllowence(otherAllowence);
        monthlySalary.setSalaryDeduction(salaryDeduction);
        monthlySalary.setNote(empNameNote); 
        return new monthlySalaryDaoImpl().updateMonthlySalaryDetail(monthlySalary); 
    }

    public static ResultSet getAllMonthlySalaryDetail() throws SQLException {
        return new monthlySalaryDaoImpl().getAllMonthlySalaryDetail();
    }

    public static boolean deleteMonthlySalaryDetail(String empName) throws SQLException {
        return new monthlySalaryDaoImpl().deleteMonthlySalaryDetail(empName);
    }

}
