$(document).ready(function() {
	
	$("#btnSend").click(function() {
		let objUser = {
			"email": $("#email").val(),
			"password": $("#password").val(),
			"name": $("#name").val(),
			"age": $("#age").val()
		};
		
		$.post({
			"url": "api/users",
			"contentType": "JSON",
			"data": JSON.stringify(objUser),
			"success":
				//{  "json": JSON.stringify(objUser)},
			   function(respuestaUserObj) {
				   $("#id").val(respuestaUserObj.id);
			   }
		});
	});
	
});