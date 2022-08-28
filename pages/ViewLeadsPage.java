package pages;

import base.BaseClass;

public class ViewLeadsPage extends BaseClass {

	public ViewLeadsPage verifyCreateLead() {
		String title=getDriver().getTitle();
		if (title.contains("View Lead")) {
			System.out.println("The lead is created successfully");
		}
		else {
			System.out.println("The lead is not created successfully");
		}
		return this;
	}
}
