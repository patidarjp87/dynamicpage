import javax.servlet.*;
import java.io.*;
import java.util.*; 
public class DateServlet extends GenericServlet 
{
    public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException
    {
        PrintWriter pw =null;
        Date date=null;
        res.setContentType("text/html");
        pw=res.getWriter();
        date=new Date();
        pw.println("<h1 stype='align:center'>Date and time:::"+date+"</h1>");
        pw.close();
    }

}