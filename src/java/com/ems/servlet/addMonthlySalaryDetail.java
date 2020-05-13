/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ems.servlet;

import com.ems.control.monthlySalaryControl;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Amal
 */
@WebServlet(name = "addMonthlySalaryDetail", urlPatterns = {"/addMonthlySalaryDetail"})
public class addMonthlySalaryDetail extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String saveValue = request.getParameter("save");
            String updateValue = request.getParameter("update");

            System.out.println("saveValue " + saveValue);
            System.out.println("updateValue  " + updateValue);

            String basicSalary = request.getParameter("basic_salary");
            String fixedAllowence = request.getParameter("fixed_allowence");
            String otherAllowence = request.getParameter("other_allowence");
            String salaryDeduction = request.getParameter("salary_deduction");
            String note = request.getParameter("employee");

            if (saveValue == null) {
                saveValue = "";
            }
            if (updateValue == null) {
                updateValue = "";
            }

            if (saveValue.equalsIgnoreCase("ADD SALARY DETAIL")) {
                try {
                    monthlySalaryControl.addMonthlySalary(1, null, new BigDecimal(basicSalary),
                            new BigDecimal(fixedAllowence), new BigDecimal(otherAllowence), new BigDecimal(salaryDeduction), note, 1);
                } catch (SQLException e) {
                }
            } else if (updateValue.equalsIgnoreCase("UPDATE SALARY DETAIL")) {
                monthlySalaryControl.updateMonthlySalaryDetail(new BigDecimal(basicSalary),
                        new BigDecimal(fixedAllowence), new BigDecimal(otherAllowence), new BigDecimal(salaryDeduction), note);
            }
            response.sendRedirect("salaryManagement.jsp");

        } catch (SQLException ex) {
            Logger.getLogger(addMonthlySalaryDetail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
