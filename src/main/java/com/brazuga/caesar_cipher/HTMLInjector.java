package com.brazuga.caesar_cipher;

public class HTMLInjector {
    public static final String START_HTML_BOILERPLATE = "<!DOCTYPE html><html><head><title>Caesar Cipher</title>" +
            "<style>body {padding: 20px;}</style>" +
            "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css\" rel=\"" +
            "stylesheet\"integrity=\"sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ\" crossorigin=\"anonymous\">" +
            "</head><body>";
    public static final String END_HTML_BOILERPLATE =
            "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js\" " +
                    "integrity=\"sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe\" crossorigin=\"anonymous\">" +
                    "</script></body></html>";
}
