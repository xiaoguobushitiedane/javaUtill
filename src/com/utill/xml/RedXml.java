package com.utill.xml;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class RedXml {

	public static void main(String[] args) {
		
		long lasting = System.currentTimeMillis();
		
		SAXBuilder builder = new SAXBuilder(); 
		Document doc;
		try {
			doc = builder.build(new File("src/test.xml"));
			Element foo = doc.getRootElement(); 
			List allChildren = foo.getChildren();
			for (int i = 0; i < allChildren.size(); i++) { 
				System.out.print("字段名称:"+ ((Element) allChildren.get(i)).getChild("name").getText()); 
				System.out.println("字段类型:"+ ((Element) allChildren.get(i)).getChild("type").getText()); 
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
