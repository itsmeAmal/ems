package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.ems.control.monthlySalaryControl;
import java.sql.ResultSet;

public final class salaryManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"ISO-8859-1\">\r\n");
      out.write("        <title>Add Salary</title>\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\r\n");
      out.write("        <!-- Google Fonts -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap\">\r\n");
      out.write("        <!-- Bootstrap core CSS -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <!-- Material Design Bootstrap -->\r\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/css/mdb.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- JQuery -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap tooltips -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap core JavaScript -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- MDB core JavaScript -->\r\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.18.0/js/mdb.min.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <form action=\"addMonthlySalaryDetail\" method=\"post\">\r\n");
      out.write("            <div style=\"position: absolute; left: 0px; width: 100%; height: 100%; top: 0px; \"></div> \r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  5%; width: 400px; height: 60px\" class=\"md-form\">\r\n");
      out.write("                <h5 class=\"card-title\">Add Employee Monthly Salary Detail</h5>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  15%; width: 300px; height: 60px\">\r\n");
      out.write("                <div class=\"dropdown\">\r\n");
      out.write("                    <div id=\"employee_name\">\r\n");
      out.write("                        <label for=\"form7\">Employee Name</label>\r\n");
      out.write("                        <select class=\"form-control\" name=\"employee\" id=form7>\r\n");
      out.write("                            <option>Pasindu</option>\r\n");
      out.write("                            <option>Chamoth</option>\r\n");
      out.write("                            <option>Akila</option>\r\n");
      out.write("                            <option>Sachin</option>\r\n");
      out.write("                            <option>Chamidhu</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  25%; width: 300px; height: 60px\" class=\"md-form\">\r\n");
      out.write("                <input type=\"text\" name=\"basic_salary\" placeholder=\"Basic Salary\" class=\"form-control\" id=\"form1\" required> \r\n");
      out.write("                <label for=\"form1\">Basic Salary</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  35%; width: 300px; height: 60px\" class=\"md-form\">\r\n");
      out.write("                <input type=\"text\" name=fixed_allowence placeholder=\"Fixed Allowence\" class=\"form-control\" id=\"form2\" required> \r\n");
      out.write("                <label for=\"form2\">Fixed Allowence</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  45%; width: 300px; height: 60px\" class=\"md-form\">\r\n");
      out.write("                <input type=\"text\" name=other_allowence placeholder=\"Other Allowence\" class=\"form-control\" id=\"form3\" required> \r\n");
      out.write("                <label for=\"form3\">Other Allowence</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  55%; width: 300px; height: 60px\" class=\"md-form\">\r\n");
      out.write("                <input type=\"text\" name=salary_deduction placeholder=\"Salary Deduction\" class=\"form-control\" id=\"form4\" required> \r\n");
      out.write("                <label for=\"form4\">Salary Deduction</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  65%; width: 300px; height: 60px\" class=\"md-form\">\r\n");
      out.write("                <input type=\"text\" name=note placeholder=\"Note\" class=\"form-control\" id=\"form5\" required> \r\n");
      out.write("                <label for=\"form5\">Note</label>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  75%; width: 300px; height: 60px\" align=\"left\"> \r\n");
      out.write("                <input type=\"submit\" value=\"ADD SALARY DETAIL\" name=\"save\"  class=\"btn btn-info btn-rounded\" id=\"form6\"> \r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div style=\"position: absolute; left: 5%; top:  85%; width: 300px; height: 60px\" align=\"left\"> \r\n");
      out.write("                <input type=\"submit\" value=\"UPDATE SALARY DETAIL\" name=\"update\"  class=\"btn btn-success btn-rounded\" id=\"form8\"> \r\n");
      out.write("            </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div style=\"position: absolute; left: 28%; top: 10%; width: 60%; height: 80%\"> \r\n");
      out.write("            <form action=\"deleteSalaryDetail\" method=\"post\">\r\n");
      out.write("                <table class=\"table\">\r\n");
      out.write("                    <thead class=\"black white-text\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th scope=\"col\">Employee Name </th>\r\n");
      out.write("                            <th scope=\"col\">Salary Date</th>\r\n");
      out.write("                            <th scope=\"col\">Basic Salary</th>\r\n");
      out.write("                            <th scope=\"col\">Fixed Allowence</th>\r\n");
      out.write("                            <th scope=\"col\">Other Allowence</th>\r\n");
      out.write("                            <th scope=\"col\">Deduction</th>\r\n");
      out.write("                            <th scope=\"col\">Delete</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("                        ");

                            ResultSet rset = monthlySalaryControl.getAllMonthlySalaryDetail();
                            while (rset.next()) {
                        
      out.write("\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <td>");
      out.print( rset.getString("monthly_salary_note"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rset.getDate("monthly_salary_date"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rset.getBigDecimal("monthly_salary_basic_salary"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rset.getBigDecimal("monthly_salary_fixed_allowence"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rset.getBigDecimal("monthly_salary_other_allowance"));
      out.write("</td>\r\n");
      out.write("                            <td>");
      out.print( rset.getBigDecimal("monthly_salary_deduction"));
      out.write("\r\n");
      out.write("                                <input type=\"hidden\" value=\"");
      out.print( rset.getString("monthly_salary_note"));
      out.write("\" name=\"hiddenEmpName\">\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <!--<td><input type=\"submit\" value=\"DELETE\"  class=\"btn btn-info btn-danger\" id=\"form6\"></td>-->\r\n");
      out.write("                            <td><input type=\"submit\" class=\"btn btn-danger btn-sm m-0\" value=\"DELETE\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        ");

                            }
                        
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
