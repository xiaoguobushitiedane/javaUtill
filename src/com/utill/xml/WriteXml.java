package com.utill.xml;

import java.io.FileOutputStream;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

public class WriteXml {
	 Column[] books = new Column[]  
	            {  
	                    new Column("AccountID","int"),  
	                    new Column("Name","varchar"),  
	                    new Column("Balance","decimal"),  
	                    new Column("Amount","decimal"),
	                    new Column("Interest","decimal"),
	                    new Column("Date","varchar")
	            };  
	      
	    public void BuildXMLDoc() throws IOException, JDOMException {     
	        // 创建根节点 并设置它的属性 ;     
	        Element root = new Element("columns").setAttribute("count", books.length+"");     
	        // 将根节点添加到文档中；     
	        Document Doc = new Document(root);     
	          
	        for (int i = 0; i < books.length; i++) {    
	           // 创建节点 book;     
	           Element elements = new Element("column");       
	           // 给 book 节点添加子节点并赋值；     
	           elements.addContent(new Element("name").setText(books[i].getColName()));    
	           elements.addContent(new Element("type").setText(books[i].getColType()));    
	           //    
	           root.addContent(elements);    
	       }    
	        // 输出 books.xml 文件；    
	        // 使xml文件 缩进效果  
	        Format format = Format.getPrettyFormat();  
	        XMLOutputter XMLOut = new XMLOutputter(format);  
	        XMLOut.output(Doc, new FileOutputStream("src/test.xml"));  
	    }   
	    public static void main(String[] args) {    
	       try {    
	    	   WriteXml j2x = new WriteXml();    
	           System.out.println("正在生成 books.xml 文件...");    
	           j2x.BuildXMLDoc();    
	       } catch (Exception e) {    
	           e.printStackTrace();    
	       }    
	       System.out.println("c:/books.xml 文件已生成");  
	    }    
}
