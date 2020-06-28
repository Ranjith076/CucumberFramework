$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Ranjith/eclipse-workspace/FreeCrmCucumberFramework/Features/DataTable.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "# ------ DATA DRIVEN APPROACH USING DATA TABLE --------------------"
    },
    {
      "line": 4,
      "value": "# No Scenario Outline is required"
    },
    {
      "line": 5,
      "value": "# Examples keyword is not required"
    },
    {
      "line": 6,
      "value": "# Data is provided by pipe below to the corresponding step"
    }
  ],
  "line": 8,
  "name": "Free CRM Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "ranjith.sit.cs@gmail.com",
        "R@njith076"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks login button",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Click on contacts",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Add new contacts details",
  "rows": [
    {
      "cells": [
        "Vismaya",
        "M",
        "Vismaya@gmail.com"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableDefinitions.user_is_already_on_login_page()"
});
formatter.result({
  "duration": 113744947853,
  "status": "passed"
});
formatter.match({
  "location": "DataTableDefinitions.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 41067614,
  "status": "passed"
});
formatter.match({
  "location": "DataTableDefinitions.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 3320979878,
  "status": "passed"
});
formatter.match({
  "location": "DataTableDefinitions.user_clicks_login_button()"
});
formatter.result({
  "duration": 1671218335,
  "status": "passed"
});
formatter.match({
  "location": "DataTableDefinitions.user_is_on_home_page()"
});
formatter.result({
  "duration": 36953671,
  "status": "passed"
});
formatter.match({
  "location": "DataTableDefinitions.click_on_contacts()"
});
formatter.result({
  "duration": 9563890593,
  "status": "passed"
});
formatter.match({
  "location": "DataTableDefinitions.add_new_contacts_details(DataTable)"
});
formatter.result({
  "duration": 20399702209,
  "status": "passed"
});
formatter.match({
  "location": "DataTableDefinitions.close_the_browser()"
});
formatter.result({
  "duration": 2618789674,
  "status": "passed"
});
});