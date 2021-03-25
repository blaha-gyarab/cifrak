import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/test")
public class Servac extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        int b = Integer.parseInt(request.getParameter("cif"));
        int pocetcif = 0;
        int[] myNum = new int[1000000];
        while (b>1) {
            myNum[pocetcif] = b;
            b = b/10;
            pocetcif++;
        }


        out.println("<html>");
        out.println("<body>");
        out.print("Cifer "+ pocetcif + "  ");
        for (int a = 0; a<=pocetcif-1; a++) {
            out.print(myNum[a] + " ");

        }
        out.println("</body></html>");
    }
}