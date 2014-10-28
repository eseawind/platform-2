package com.eniac.test;

import java.util.ArrayList;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class JDOMDemoMain {
	private JDOMDemoMain() {
	}

	private List<String> imports = new ArrayList<String>();

	private static JDOMDemoMain instance;

	public static JDOMDemoMain getInstance() {
		return instance == null ? instance = new JDOMDemoMain() : instance;
	}

	public static void main(String[] args) throws Exception {
		Document doc = new SAXBuilder().build(JDOMDemoMain.class.getResource("/fxml/BasePaneLoginCtx.fxml"));

		for (Content content : doc.getContent()) {
			if ("ProcessingInstruction".equals(content.getCType().toString())) {
				System.out.println(content.getValue());
			}
		}
		print(doc.getRootElement());
	}

	private static void print(Element rootElement) {
		List<Element> children = rootElement.getChildren();
		for (Element element : children) {
			// System.out.println(element);

			List<Attribute> attributes = element.getAttributes();
			for (Attribute attr : attributes) {
				if ("id".equalsIgnoreCase(attr.getName())) {
					System.out.println(element.getName() + ":" + attr.getValue());
				}
			}
			if (element.getChildren() != null && !element.getChildren().isEmpty()) {
				print(element);
			}

		}
	}
}
