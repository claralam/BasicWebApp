package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<h1>Welcome!</h1>" +
                "<h2>Testing a change </h2>" +
                "<h3>Testing another change</h3>" +
                "<p>Enter your query in the box below: " +
                  "<form><input type=\"text\" name=\"q\" />" +
                    "<input type=\"submit\">" +
                  "</form>" +
                "</p>");
    }
    
}
