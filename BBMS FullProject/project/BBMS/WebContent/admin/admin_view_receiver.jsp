<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*,blood.dto.*,blood.bl.*" pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/menu.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="../Designs/css/bootstrap.min.css">

<link rel="stylesheet" type="text/css"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<!-- Swiper CSS -->
<link rel="stylesheet" href="../Designs/css/swiper.min.css">

<meta charset="UTF-8">
<title>Request Receiver</title>
</head>
<h1 align="centre">Receiver Request</h1>

	<%@ include file="../includes/menu_admin.jsp"%>

	<body>
		<table width="100%" height="688" border="0">
			<tbody>
				<tr>
					<td height="684" align="center" valign="top"><table
							width="100%" border="0">
							<tbody>
								<tr>
									<td height="530" align="center" valign="top"><table
											width="100%" border="0">
											<tbody>
												<tr>
													<td height="33" align="center" valign="middle"
														style="color: #F70509"></td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"></td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"
														style="font-family: Cambria, 'Hoefler Text', 'Liberation Serif', Times, 'Times New Roman', serif; font-weight: bold; font-size: 250%;">Receiver
														Request</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle"
														style="color: #F70509">
														<%
															if (session.getAttribute("message") != null) {
																out.println((String) session.getAttribute("message"));
																session.removeAttribute("message");
															}
														%>
													</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle">
														<form id="form1" name="form1" method="post">
															<%
																ArrayList<ReceiverFormDTO> receiverss = ReceiverFormBL.getReceivers();
																if (receiverss != null && receiverss.size() > 0) {
															%>
															<table width="95%" border="1" align="center"
																class="table table-striped"
																style="background-color: white">
																<tbody style="">
																	<tr style="background-color: red">
																		<td width="11%" height="33" align="center"
																			valign="middle" style="color: white"><spam
																				style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Patient
																			ID</spam></td>
																		<td width="16%" align="center" valign="middle"
																			style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Patient
																				Name </span></td>
																		<td width="12%" align="center" valign="middle"
																			style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Blood
																				Group </span></td>
																		<td width="12%" align="center" valign="middle"
																			style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Gender</span></td>
																		<td width="11%" align="center" valign="middle"
																			style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Hospital
																				Name</span></td>
																		<td width="20%" align="center" valign="middle"
																			style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Hospital
																				Patient ID</span></td>
																		<td width="18%" align="center" valign="middle"
																			style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Contact
																				No:</span></td>
																		<td width="18%" align="center" valign="middle"
																			style="color: white"><span
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">Action</span></td>


																	</tr>
																	<%
																		for (ReceiverFormDTO receiver1 : receiverss) {
																	%>
																	<tr>
																		<td height="30" align="center"><%=receiver1.getPatient_id()%>&nbsp;</td>
																		<td align="center"><%=receiver1.getPatient_name()%>&nbsp;</td>
																		<td align="center"><%=receiver1.getBlood_grp()%>&nbsp;</td>
																		<td align="center" valign="middle"
																			style="font-family: 'Lucida Grande', 'Lucida Sans Unicode', 'Lucida Sans', 'DejaVu Sans', Verdana, sans-serif">&nbsp;<%=receiver1.getGender()%></td>
																		<td align="center"><%=receiver1.getHos_name()%>&nbsp;</td>
																		<td align="center" valign="middle"><%=receiver1.getHos_pat_id()%>&nbsp;</td>
																		<td align="center"><%=receiver1.getPhone()%>&nbsp;</td>
																		<td align="left" valign="middle"><a
																			href="admin_release_process_receiver.jsp?patient_id=<%=receiver1.getPatient_id()%>&blood_grp=<%=receiver1.getBlood_grp()%>">Release</a>&nbsp;</td>


																	</tr>
																	<%
																		}
																		} else {
																	%>
																	<tr>
																		<td  align="center" valign="middle" colspan="7" style="color: red; font-weight: bold;">No Receiver
																			Details Found</td>
																	</tr>
																	<%
																		}
																	%>
																</tbody>
															</table>


														</form>
													</td>
												</tr>
												<tr>
													<td height="33" align="center" valign="middle">&nbsp;</td>
												</tr>
											</tbody>
										</table></td>
								</tr>
							</tbody>
						</table></td>
				</tr>
			</tbody>
		</table>

<%@ include file="../Designs/footer.jsp"%>
</body>
</html>
