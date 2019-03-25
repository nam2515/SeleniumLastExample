Feature: when I go to the Employee Registration page, and filling the details,
		 after that it will redirect to the next page for Project Details.
Scenario:
	Given that I have gone to Employee_Registration_form.jsp page
	When I entered employee Num "101"
	And I entered employee Name "Xyz"
	And I selected the state "Maharashtra"
	And I selected the City "Pune"
	And I click on the next link
	Then It will redirect to the Project.html file and title is "project" 
	

  