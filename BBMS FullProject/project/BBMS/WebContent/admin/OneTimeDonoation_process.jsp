<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="blood.dto.*,blood.bl.*,blood.dl.*,blood.utlity.*,java.sql.Date,  java.text.SimpleDateFormat "%>
<%!String donor_id, donor_name, blood_grp, gender, age, dod;

	long phone;
	float height, weight;
	DonorDTO donor = null;
	int result;%>
<%
	try {
		donor_name = request.getParameter("txtDonorName");
		//session.setAttribute("donorName", donor_name);
		blood_grp = request.getParameter("txtBloodGrp");

		gender = request.getParameter("gender");
		age = request.getParameter("age");
		phone = Long.parseLong(request.getParameter("txtPhone"));
		height = Integer.parseInt(request.getParameter("txtHeight"));
		weight = Integer.parseInt(request.getParameter("txtWeight"));
		dod = request.getParameter("dod");

		donor = new DonorDTO();
		donor.setDonor_id(donor_id);
		donor.setDonor_name(donor_name);
		donor.setBlood_grp(blood_grp);
		donor.setGender(gender);
		donor.setAge(age);
		donor.setPhone(phone);
		donor.setHeight(height);
		donor.setWeight(weight);
		donor.setDod(dod);

		result = DonorBL.addOneTimeDonor(donor);

		if (result > 0) {
			session.setAttribute("message", "Donor details added successfully");
		} else {
			session.setAttribute("message", "Please try again later");
		}
		response.sendRedirect("../admin/admin_view_all_donor.jsp");
	}

	catch (Exception e) {
		System.out.println("**Error**: Donor: donor_add_process" + e.getMessage());
		e.printStackTrace();
		response.sendRedirect("donor/home.jsp");
	}
%>


