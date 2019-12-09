package controller;

import java.io.File;
import java.io.IOException;

import javax.management.relation.Relation;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.http.HttpSession;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import java.io.PrintWriter;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;
import javax.xml.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
/**
 * Servlet implementation class RegisterController
 */
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ServletInputStream xmlfile;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		xmlfile = request.getInputStream();
		JAXBContext jaxbContext;
		try
		{
		jaxbContext = JAXBContext.newInstance(User.class);              
		 
		 Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	
		User user = (User) jaxbUnmarshaller.unmarshal(xmlfile);
		System.out.println(user);
		}
		catch (JAXBException e) 
		{ 
		    e.printStackTrace();
		}
		
	}

		 
		 

		
		
		
	

}
