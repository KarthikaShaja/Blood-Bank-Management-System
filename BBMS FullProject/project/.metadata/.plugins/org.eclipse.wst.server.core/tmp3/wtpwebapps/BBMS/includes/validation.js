function validate() {

	var name = document.getElementById("txtDonorName").value;
	var age = document.getElementById("txtage").value;
	var gender = document.donor.txtgender.value;
	var donation = document.donor.txtdonation.value;
	var phone = document.getElementById("txtPhone").value;
	
	var height = document.getElementById("txtHeight");
	var weight = document.getElementById("txtWeight");
	var valid = true;

	if (name <= 0) 
	{
		alert("Don't leave Name field empty!");
		valid = false;

	}
	else
		{
		if (name.length < 3)
			{
			alert("Name must be minimum 3 character");
			valid = false;
			}
		}
	
	if(isNaN(name)== false)
	{
		alert("Enter a valid name");
		valid = false;

	}
	
	if(age<=0 || isNaN(age))
		{
			alert("Don't leave Age field empty!");
			valid = false;
		}
	
	else {
		if(age < 17 || age > 66)
	
			{
				alert("You are under age/above age");
				valid = false;
			}
		}
	
	if(gender=="Male")
		{
		if(height.value.length <= 0 || weight.value.length <=0)
			{
			alert("Dont leave Height/Weight field empty");
			valid = false;
			}
		else 
			{
				if(isNaN(height.value) || height.value < 150)
				{
					alert("You Cant Donate Blood");
					valid = false;
				}
				if(isNaN(weight.value) || weight.value < 50)
					{
					alert("you are under weight for donation");
					valid = false;
					}
			}
		}
	
	if(gender=="Female")
	{
		if(height.value.length <= 0 || weight.value.length <=0)
		{
		alert("Dont leave Height/Weight field empty");
		valid = false;
		}
	else 
		{
			if(isNaN(height.value) || height.value < 140)
			{
				alert("You Cant Donate Blood");
				valid = false;
			}
			if(isNaN(weight.value) || weight.value < 50)
				{
				alert("you are under weight for donation");
				valid = false;
				}
		}
	}
	
	if(donation=="Yes")
	{
	alert("You cant Donate Blood Now");
	valid = false;
	}
	
	if(isNaN(phone) || phone.length > 10|| phone.length < 10)
		{
		alert("Enter a valid Mobile Number");
		valid = false;
		}
	
	return valid;
}