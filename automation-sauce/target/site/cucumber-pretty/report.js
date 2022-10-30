$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/loginSauce.feature");
formatter.feature({
  "line": 2,
  "name": "Login",
  "description": "As a user I want to Login to sauce demo",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 25423552800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Normal Login",
  "description": "",
  "id": "login;normal-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.match({
  "location": "LoginSteps.verifyLoginPage()"
});
formatter.result({
  "duration": 211881800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 296118400,
  "status": "passed"
});
formatter.after({
  "duration": 719944300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Invalid Login",
  "description": "",
  "id": "login;invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input \"\u003cuserName\u003e\" as userName and \"\u003cpassword\u003e\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User will see \"\u003cerrorText\u003e\" on login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login;invalid-login;",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "errorText"
      ],
      "line": 14,
      "id": "login;invalid-login;;1"
    },
    {
      "cells": [
        "asd",
        "secret_sauce",
        "Epic sadface: Username and password do not match any user in this service"
      ],
      "line": 15,
      "id": "login;invalid-login;;2"
    },
    {
      "cells": [
        "standard_user",
        "123",
        "Epic sadface: Username and password do not match any user in this service"
      ],
      "line": 16,
      "id": "login;invalid-login;;3"
    },
    {
      "cells": [
        "asd",
        "asd",
        "Epic sadface: Username and password do not match any user in this service"
      ],
      "line": 17,
      "id": "login;invalid-login;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8674710300,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Invalid Login",
  "description": "",
  "id": "login;invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input \"asd\" as userName and \"secret_sauce\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User will see \"Epic sadface: Username and password do not match any user in this service\" on login page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLoginPage()"
});
formatter.result({
  "duration": 90302700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asd",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 34
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 216277400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Epic sadface: Username and password do not match any user in this service",
      "offset": 15
    }
  ],
  "location": "LoginSteps.displayErrorMessage(String)"
});
formatter.result({
  "duration": 23082900,
  "status": "passed"
});
formatter.after({
  "duration": 672316800,
  "status": "passed"
});
formatter.before({
  "duration": 38228026400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Invalid Login",
  "description": "",
  "id": "login;invalid-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input \"standard_user\" as userName and \"123\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User will see \"Epic sadface: Username and password do not match any user in this service\" on login page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLoginPage()"
});
formatter.result({
  "duration": 51143500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "123",
      "offset": 44
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 199212600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Epic sadface: Username and password do not match any user in this service",
      "offset": 15
    }
  ],
  "location": "LoginSteps.displayErrorMessage(String)"
});
formatter.result({
  "duration": 20671000,
  "status": "passed"
});
formatter.after({
  "duration": 650649400,
  "status": "passed"
});
formatter.before({
  "duration": 31290796800,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Invalid Login",
  "description": "",
  "id": "login;invalid-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User input \"asd\" as userName and \"asd\" as password",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User will see \"Epic sadface: Username and password do not match any user in this service\" on login page",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLoginPage()"
});
formatter.result({
  "duration": 46502200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asd",
      "offset": 12
    },
    {
      "val": "asd",
      "offset": 34
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 210653600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Epic sadface: Username and password do not match any user in this service",
      "offset": 15
    }
  ],
  "location": "LoginSteps.displayErrorMessage(String)"
});
formatter.result({
  "duration": 22006300,
  "status": "passed"
});
formatter.after({
  "duration": 727314500,
  "status": "passed"
});
formatter.uri("features/purchaseFlow.feature");
formatter.feature({
  "line": 3,
  "name": "Purchase Flow",
  "description": "As user want to purchase item",
  "id": "purchase-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@PurchaseFlow"
    }
  ]
});
formatter.before({
  "duration": 14045453900,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User will short item by Name (Z to A)",
  "description": "",
  "id": "purchase-flow;user-will-short-item-by-name-(z-to-a)",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User open the web page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User input \"standard_user\" as userName and \"secret_sauce\" as password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User sort product list by \"Name (Z to A)\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User click add to chart on the chosen item",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User click the shopping cart",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User click remove button on the chosen item",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User click checkout button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "User input \"imi\" as firstName and \"imi\" as lastName and \"9099\" as postalCode",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "User click continue button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should get \"Item total: $89.96\" as expected item total",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User should get \"Tax: $7.20\" as expected tax",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should get \"Total: $97.16\" as expected total",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click finish button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User should get \"THANK YOU FOR YOUR ORDER\" as expected succes order",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User click back home button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.verifyLoginPage()"
});
formatter.result({
  "duration": 30379000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 44
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 234799400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 27
    }
  ],
  "location": "PurchaseSteps.selectProductCart(String)"
});
formatter.result({
  "duration": 3147015900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.selectItem()"
});
formatter.result({
  "duration": 3213739900,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.shoppingCart()"
});
formatter.result({
  "duration": 3061000100,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.removeChart()"
});
formatter.result({
  "duration": 3078523200,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.buttonCheckout()"
});
formatter.result({
  "duration": 3052314800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "imi",
      "offset": 12
    },
    {
      "val": "imi",
      "offset": 35
    },
    {
      "val": "9099",
      "offset": 57
    }
  ],
  "location": "PurchaseSteps.inputCredential(String,String,String)"
});
formatter.result({
  "duration": 3165371800,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.buttonContinue()"
});
formatter.result({
  "duration": 3059931700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Item total: $89.96",
      "offset": 17
    }
  ],
  "location": "PurchaseSteps.subTotal(String)"
});
formatter.result({
  "duration": 3039243300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tax: $7.20",
      "offset": 17
    }
  ],
  "location": "PurchaseSteps.taxLabel(String)"
});
formatter.result({
  "duration": 3025008200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Total: $97.16",
      "offset": 17
    }
  ],
  "location": "PurchaseSteps.totalLabel(String)"
});
formatter.result({
  "duration": 3045377300,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.buttonFinish()"
});
formatter.result({
  "duration": 3046951600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "THANK YOU FOR YOUR ORDER",
      "offset": 17
    }
  ],
  "location": "PurchaseSteps.headerComplete(String)"
});
formatter.result({
  "duration": 3028035400,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.buttonBackHome()"
});
formatter.result({
  "duration": 3046836800,
  "status": "passed"
});
formatter.after({
  "duration": 713396200,
  "status": "passed"
});
});