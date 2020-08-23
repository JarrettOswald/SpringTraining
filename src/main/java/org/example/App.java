package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MessageRenderer messageRenderer = new StandardOutMessageRenderer();
        MessageProvider messageProvider = new HelloWorldMessageProvider();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
