package com.brazuga.caesar_cipher;

import com.brazuga.caesar_cipher.service.DecryptService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "decryptController", value = "/decrypt")
public class DecryptController extends HttpServlet {

    private DecryptService decryptService;

    public DecryptController() {
        this.decryptService = new DecryptService();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String message = request.getParameter("message");
        Integer key = request.getParameter("key").equals("") ? 0 : Integer.parseInt(request.getParameter("key"));

        String decryptedMessage = decryptService.decrypt(message, key);

        PrintWriter responseWriter = response.getWriter();
        response.setContentType("text/html");

        responseWriter.println(HTMLInjector.START_HTML_BOILERPLATE);
        responseWriter.println(decryptedMessage);
        responseWriter.println(HTMLInjector.END_HTML_BOILERPLATE);
    }

    public void destroy() {
    }
}