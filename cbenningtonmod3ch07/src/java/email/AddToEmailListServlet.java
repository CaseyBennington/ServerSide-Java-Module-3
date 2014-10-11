package email;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import business.User;
import data.UserIO;

public class AddToEmailListServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        // get parameters from the request
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String emailAddress = request.getParameter("emailAddress");

        // use regular Java classes
        User user = new User(firstName, lastName, emailAddress);

        // validate the parameters
        String message = "";
        String url = "";
        if (firstName.length() == 0 || lastName.length() == 0 || emailAddress.length() == 0) {
            message = "Please fill out all three tesxt boxes.";
            url = "/join_email_list.jsp";
        } else {
            message = "";

            // get a relative file name
            ServletContext context = this.getServletContext();
            String custServEmail = context.getInitParameter("custServEmail");
            ServletConfig config = this.getServletConfig();
            String relativePath = config.getInitParameter("relativePathToFile");
            ServletContext context2 = this.getServletContext();
            String path = context2.getRealPath(relativePath);
            UserIO.addRecord(user, path);

            url = "/display_email_entry.jsp";
        }

        // store the User object in the request object
        request.setAttribute("user", user);
        request.setAttribute("message", message);

        // forward request and response objects to JSP page
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}