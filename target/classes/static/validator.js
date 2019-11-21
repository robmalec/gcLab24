function validate(first, last, email, phone, password, cPassword){	
	var complete = true;
	
	var firstNameBox = document.getElementById("txtFirst");
	var lastNameBox = document.getElementById("txtLast");
	var emailBox = document.getElementById("txtEmail");
	var phoneNumBox = document.getElementById("txtPhone");
	var passwordBox = document.getElementById("txtPassword");
	var cPasswordBox = document.getElementById("txtCPassword");
		
	//var phoneNumRegex = RegExp("[0-9]{10,10}");
	var phoneNumRegex2 = RegExp("[(][0-9]{3}[)][0-9]{3}[-][0-9]{4}");
	
	if (!phoneNumRegex2.test(phoneNumBox.value)){
		makeErrorElt("This doesn't look like a phone number, which should be written in this format: (xxx)xxx-xxxx.  ", "phoneNumDiv");
	
		complete = false;
	}
		
	var emailRegex= RegExp("[a-z]{1,}[@][a-z]{1,}[.][a-z]{1,}");
	
	if (!emailRegex.test(emailBox.value)){
		makeErrorElt("This doesn't look like an email address.  ", "emailDiv");

		complete = false;
	}
		
	if (passwordBox.value != cPasswordBox.value){
		
		makeErrorElt("These passwords don't match.  ", "cPswdDiv");
		
		complete = false;
	}
	
	
	
	return complete;
}

function makeErrorElt(objectDescription, parentElt){
	var item = document.getElementById(parentElt);

	if (item.childElementCount <= 2){
		var message = document.createTextNode(objectDescription + getErrorQuip());
		var span = document.createElement('span');
		
		span.style.color="red";
		span.appendChild(message);
		item.appendChild(span);
	}
}

function getErrorQuip(){
	var verb = ["awaken further", 
		"invigorate yourself", 
		"rejuvinate your senses", 
		"wake your ass up", 
		"celebrate the day", 
		"enhance your awareness", 
		"get more zooted", 
		"zoot yourself", 
		"pop a diet addy", 
		"step into this plane of existence",
		"jump-start your day", 
		"start your engine up",
		"energize yourself"
		];
		
	var num1 = Math.floor(Math.random() * verb.length);
		
	var blends = ["the rare Corktown blend", "Mackinac Island blend", "Motown blend", "the elusive Midland blend", "Antonella blend", "Kyle blend"];
	
	var num2 = Math.floor(Math.random() * blends.length);
	
	var chosenVerb = verb[num1];
	
	var chosenCoffee = blends[num2];
	
	return "Please " + chosenVerb + " with a cup of " + chosenCoffee + " and try again.";
}