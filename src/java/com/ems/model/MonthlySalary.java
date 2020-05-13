package com.ems.model;

import java.math.BigDecimal;
import java.sql.Date;

public class MonthlySalary {

    private int salaryDetailId;
    private int employeeId;
    private Date date;
    private BigDecimal basicSalary;
    private BigDecimal fixedAllowence;
    private BigDecimal otherAllowence;
    private BigDecimal salaryDeduction;
    private String note;
    private int paymentStatus;
    private int status;

    public int getSalaryDetailId() {
        return salaryDetailId;
    }

    public void setSalaryDetailId(int salaryDetailId) {
        this.salaryDetailId = salaryDetailId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(BigDecimal basicSalary) {
        this.basicSalary = basicSalary;
    }

    public BigDecimal getFixedAllowence() {
        return fixedAllowence;
    }

    public void setFixedAllowence(BigDecimal fixedAllowence) {
        this.fixedAllowence = fixedAllowence;
    }

    public BigDecimal getOtherAllowence() {
        return otherAllowence;
    }

    public void setOtherAllowence(BigDecimal otherAllowence) {
        this.otherAllowence = otherAllowence;
    }

    public BigDecimal getSalaryDeduction() {
        return salaryDeduction;
    }

    public void setSalaryDeduction(BigDecimal salaryDeduction) {
        this.salaryDeduction = salaryDeduction;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
