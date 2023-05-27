package com.brazuga.caesar_cipher;

import java.io.*;

import com.brazuga.caesar_cipher.service.EncryptService;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "crypticController", value = "/encrypt")
public class CrypticController extends HttpServlet {

    private EncryptService encryptService;

    public CrypticController() {
        this.encryptService = new EncryptService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = request.getParameter("message");
        Integer key = request.getParameter("key").equals("") ? 0 : Integer.parseInt(request.getParameter("key"));

        String encryptedMessage = encryptService.encrypt(message, key);

        PrintWriter responseWriter = response.getWriter();
        response.setContentType("text/html");

        responseWriter.println("<html>" +
                                    "<body>");
        responseWriter.println(     "<h1>" + encryptedMessage + "</h1>");
        responseWriter.println("</body></html>");
    }

    public void destroy() {
    }
}